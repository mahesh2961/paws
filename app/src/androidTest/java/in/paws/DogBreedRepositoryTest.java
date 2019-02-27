package in.paws;

import android.content.Context;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.room.Room;
import androidx.test.InstrumentationRegistry;
import in.paws.database.AppDatabase;
import in.paws.database.DogBreedDao;
import in.paws.database.DogBreedRepository;
import in.paws.database.DogCategory;
import in.paws.network.ApiHandler;
import in.paws.network.NetworkManager;
import in.paws.utils.ConstantsKt;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@RunWith(MockitoJUnitRunner.class)
public class DogBreedRepositoryTest {
    private ApiHandler apiHandler;
    private static final String TAG = "ApiUnitTesting";

    private DogBreedDao dao;

    private DogBreedRepository dogBreedRepository;

    NetworkManager manager;


    @Rule
    public TestRule rule = new InstantTaskExecutorRule();


    @Before
    public void setup() {

        MockitoAnnotations.initMocks(this);

        Context appContext = InstrumentationRegistry.getTargetContext();

        dao=Room.databaseBuilder(appContext, AppDatabase.class, ConstantsKt.DATABASE_NAME).build().dogCategoryDao();


        apiHandler = new Retrofit.Builder()
                .baseUrl(ConstantsKt.API_HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiHandler.class);

        manager= new NetworkManager(apiHandler);


        dogBreedRepository = new DogBreedRepository(dao,manager);



        RxAndroidPlugins.setInitMainThreadSchedulerHandler(scheduler -> Schedulers.trampoline());

    }

    @Test
    public void testDataInsertAndFetch() {

        List<DogCategory> categories = getTestData();
          dogBreedRepository.insertData(categories);
          List<DogCategory> fetchedCategories=  LiveDataTestUtil.INSTANCE.getValue(dogBreedRepository.getDogCaetgories());
          Assert.assertThat(fetchedCategories, Matchers.hasItem(categories.get(0)));
    }


    @Test
    public void testIsDataAvailable() {

        List<DogCategory> categories = getTestData();
        dogBreedRepository.insertData(categories);
        Assert.assertEquals(true, dogBreedRepository.isDataAvailable());
    }



    public List<DogCategory> getTestData()
    {
        List<DogCategory> categories = new ArrayList<>();
        DogCategory category = new DogCategory("Abc",new ArrayList<>(),false,new ArrayList<String>(),false,"");
//
        categories.add(category);
        return categories;

    }

}

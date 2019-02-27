package in.paws.api;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import in.paws.IPawsNetworkResponse;
import in.paws.database.DogBreedRepository;
import in.paws.database.DogBreedDao;
import in.paws.database.DogCategory;
import in.paws.network.ApiHandler;
import in.paws.network.NetworkManager;
import in.paws.pojos.DogsCategoryResponse;


@RunWith(MockitoJUnitRunner.class)
public class ApiUnitTesting {

    @Mock
    private ApiHandler apiHandler;
    private static final String TAG = "ApiUnitTesting";


    @Mock
    private DogBreedDao dao;

    private DogBreedRepository dogBreedRepository;
    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @Mock
    NetworkManager manager;

    @Mock
    IPawsNetworkResponse<List<DogCategory>> callback;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        dogBreedRepository = new DogBreedRepository(dao, manager);
    }

    @Test
    public void verifySuccessResponse() {


        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                ((IPawsNetworkResponse<List<DogCategory>>)invocation.getArguments()[0]).sucessReponse(getCategoryList());
                return null;
            }
        }).when(manager).getDogBreeds(ArgumentMatchers.any());

        dogBreedRepository.fetchDogCategories(callback);

        Mockito.verify(callback, Mockito.times(1)).sucessReponse(ArgumentMatchers.any());

    }

    @Test
    public void verifyErrorResponse() {

        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                ((IPawsNetworkResponse<List<DogCategory>>)invocation.getArguments()[0]).error(new Exception("Something went wrong"));
                return null;
            }
        }).when(manager).getDogBreeds(ArgumentMatchers.any());

        dogBreedRepository.fetchDogCategories(callback);

        Mockito.verify(callback, Mockito.times(1)).error(ArgumentMatchers.any());

    }


    public List<DogCategory> getCategoryList()
    {
        List<DogCategory> categories = new ArrayList<>();
        DogCategory category = new DogCategory("Abc",new ArrayList<>(),false,new ArrayList<String>(),false,"");
//
        categories.add(category);
        return categories;

    }


}

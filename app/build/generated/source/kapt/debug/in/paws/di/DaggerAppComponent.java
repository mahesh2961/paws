// Generated by Dagger (https://google.github.io/dagger).
package in.paws.di;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import in.paws.PawsApp;
import in.paws.PawsApp_MembersInjector;
import in.paws.activities.MainActivity;
import in.paws.activities.MainActivity_MembersInjector;
import in.paws.database.AppDatabase;
import in.paws.database.DogBreedDao;
import in.paws.database.RoomModule;
import in.paws.database.RoomModule_ProvideRepoFactory;
import in.paws.database.RoomModule_ProvidesBreadDaoFactory;
import in.paws.database.RoomModule_ProvidesRoomDatabaseFactory;
import in.paws.fragment.BaseFragment_MembersInjector;
import in.paws.fragment.BaseListFragment;
import in.paws.fragment.BaseListFragment_MembersInjector;
import in.paws.fragment.DogCategoryListFragment;
import in.paws.fragment.DogSubCategoryListFragment;
import in.paws.fragment.ImageFragment;
import in.paws.fragment.ImageListFragment;
import in.paws.fragment.ImageListFragment_MembersInjector;
import in.paws.network.ApiHandler;
import in.paws.network.NetworkManager;
import in.paws.network.NetworkModule;
import in.paws.network.NetworkModule_BuildNetworkApiFactory;
import in.paws.network.NetworkModule_ProvidePawsNetworkLayerFactory;
import in.paws.viewmodels.CategoryImageViewModel;
import in.paws.viewmodels.CategoryImageViewModel_Factory;
import in.paws.viewmodels.DogCategoryViewModel;
import in.paws.viewmodels.DogCategoryViewModel_Factory;
import in.paws.viewmodels.DogSubCategoryViewModel;
import in.paws.viewmodels.DogSubCategoryViewModel_Factory;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityModule_ContributePawsActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent.Builder>
      baseListFragmentSubcomponentBuilderProvider;

  private Provider<
          ActivityModule_ContributeDogCategoryListFragment.DogCategoryListFragmentSubcomponent
              .Builder>
      dogCategoryListFragmentSubcomponentBuilderProvider;

  private Provider<
          ActivityModule_ContributeDogSubCategoryListFragment.DogSubCategoryListFragmentSubcomponent
              .Builder>
      dogSubCategoryListFragmentSubcomponentBuilderProvider;

  private Provider<ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent.Builder>
      imageListFragmentSubcomponentBuilderProvider;

  private Provider<ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent.Builder>
      imageFragmentSubcomponentBuilderProvider;

  private Provider<Context> appContextProvider;

  private Provider<AppDatabase> providesRoomDatabaseProvider;

  private Provider<DogBreedDao> providesBreadDaoProvider;

  private Provider<ApiHandler> buildNetworkApiProvider;

  private Provider<NetworkManager> providePawsNetworkLayerProvider;

  private RoomModule_ProvideRepoFactory provideRepoProvider;

  private DogSubCategoryViewModel_Factory dogSubCategoryViewModelProvider;

  private DogCategoryViewModel_Factory dogCategoryViewModelProvider;

  private CategoryImageViewModel_Factory categoryImageViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<InjectingViewModelFactory> injectingViewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return Collections
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider);
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_ContributePawsActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributePawsActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.baseListFragmentSubcomponentBuilderProvider =
        new Provider<
            ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent.Builder
              get() {
            return new BaseListFragmentSubcomponentBuilder();
          }
        };
    this.dogCategoryListFragmentSubcomponentBuilderProvider =
        new Provider<
            ActivityModule_ContributeDogCategoryListFragment.DogCategoryListFragmentSubcomponent
                .Builder>() {
          @Override
          public ActivityModule_ContributeDogCategoryListFragment
                  .DogCategoryListFragmentSubcomponent.Builder
              get() {
            return new DogCategoryListFragmentSubcomponentBuilder();
          }
        };
    this.dogSubCategoryListFragmentSubcomponentBuilderProvider =
        new Provider<
            ActivityModule_ContributeDogSubCategoryListFragment
                .DogSubCategoryListFragmentSubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributeDogSubCategoryListFragment
                  .DogSubCategoryListFragmentSubcomponent.Builder
              get() {
            return new DogSubCategoryListFragmentSubcomponentBuilder();
          }
        };
    this.imageListFragmentSubcomponentBuilderProvider =
        new Provider<
            ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent.Builder
              get() {
            return new ImageListFragmentSubcomponentBuilder();
          }
        };
    this.imageFragmentSubcomponentBuilderProvider =
        new Provider<ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent.Builder get() {
            return new ImageFragmentSubcomponentBuilder();
          }
        };
    this.appContextProvider = InstanceFactory.create(builder.appContext);
    this.providesRoomDatabaseProvider =
        DoubleCheck.provider(
            RoomModule_ProvidesRoomDatabaseFactory.create(builder.roomModule, appContextProvider));
    this.providesBreadDaoProvider =
        DoubleCheck.provider(
            RoomModule_ProvidesBreadDaoFactory.create(
                builder.roomModule, providesRoomDatabaseProvider));
    this.buildNetworkApiProvider =
        DoubleCheck.provider(NetworkModule_BuildNetworkApiFactory.create(builder.networkModule));
    this.providePawsNetworkLayerProvider =
        DoubleCheck.provider(
            NetworkModule_ProvidePawsNetworkLayerFactory.create(
                builder.networkModule, buildNetworkApiProvider));
    this.provideRepoProvider =
        RoomModule_ProvideRepoFactory.create(
            builder.roomModule, providesBreadDaoProvider, providePawsNetworkLayerProvider);
    this.dogSubCategoryViewModelProvider =
        DogSubCategoryViewModel_Factory.create(provideRepoProvider);
    this.dogCategoryViewModelProvider = DogCategoryViewModel_Factory.create(provideRepoProvider);
    this.categoryImageViewModelProvider =
        CategoryImageViewModel_Factory.create(provideRepoProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(3)
            .put(DogSubCategoryViewModel.class, (Provider) dogSubCategoryViewModelProvider)
            .put(DogCategoryViewModel.class, (Provider) dogCategoryViewModelProvider)
            .put(CategoryImageViewModel.class, (Provider) categoryImageViewModelProvider)
            .build();
    this.injectingViewModelFactoryProvider =
        DoubleCheck.provider(
            InjectingViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(PawsApp arg0) {
    injectPawsApp(arg0);
  }

  private PawsApp injectPawsApp(PawsApp instance) {
    PawsApp_MembersInjector.injectDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder extends AppComponent.Builder {
    private RoomModule roomModule;

    private NetworkModule networkModule;

    private PawsApp seedInstance;

    private Context appContext;

    @Override
    public AppComponent build() {
      if (roomModule == null) {
        this.roomModule = new RoomModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(PawsApp.class.getCanonicalName() + " must be set");
      }
      if (appContext == null) {
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public void seedInstance(PawsApp arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }

    @Override
    public Builder appContext(Context appContext) {
      this.appContext = Preconditions.checkNotNull(appContext);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityModule_ContributePawsActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityModule_ContributePawsActivity.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityModule_ContributePawsActivity.MainActivitySubcomponent {
    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {}

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(5)
          .put(
              BaseListFragment.class,
              (Provider) DaggerAppComponent.this.baseListFragmentSubcomponentBuilderProvider)
          .put(
              DogCategoryListFragment.class,
              (Provider) DaggerAppComponent.this.dogCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              DogSubCategoryListFragment.class,
              (Provider)
                  DaggerAppComponent.this.dogSubCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              ImageListFragment.class,
              (Provider) DaggerAppComponent.this.imageListFragmentSubcomponentBuilderProvider)
          .put(
              ImageFragment.class,
              (Provider) DaggerAppComponent.this.imageFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }
  }

  private final class BaseListFragmentSubcomponentBuilder
      extends ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent.Builder {
    private BaseListFragment seedInstance;

    @Override
    public ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(BaseListFragment.class.getCanonicalName() + " must be set");
      }
      return new BaseListFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(BaseListFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class BaseListFragmentSubcomponentImpl
      implements ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent {
    private BaseListFragmentSubcomponentImpl(BaseListFragmentSubcomponentBuilder builder) {}

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(5)
          .put(
              BaseListFragment.class,
              (Provider) DaggerAppComponent.this.baseListFragmentSubcomponentBuilderProvider)
          .put(
              DogCategoryListFragment.class,
              (Provider) DaggerAppComponent.this.dogCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              DogSubCategoryListFragment.class,
              (Provider)
                  DaggerAppComponent.this.dogSubCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              ImageListFragment.class,
              (Provider) DaggerAppComponent.this.imageListFragmentSubcomponentBuilderProvider)
          .put(
              ImageFragment.class,
              (Provider) DaggerAppComponent.this.imageFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @Override
    public void inject(BaseListFragment arg0) {
      injectBaseListFragment(arg0);
    }

    private BaseListFragment injectBaseListFragment(BaseListFragment instance) {
      BaseFragment_MembersInjector.injectChildFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      BaseListFragment_MembersInjector.injectVmFactory(
          instance, DaggerAppComponent.this.injectingViewModelFactoryProvider.get());
      return instance;
    }
  }

  private final class DogCategoryListFragmentSubcomponentBuilder
      extends ActivityModule_ContributeDogCategoryListFragment.DogCategoryListFragmentSubcomponent
          .Builder {
    private DogCategoryListFragment seedInstance;

    @Override
    public ActivityModule_ContributeDogCategoryListFragment.DogCategoryListFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            DogCategoryListFragment.class.getCanonicalName() + " must be set");
      }
      return new DogCategoryListFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DogCategoryListFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DogCategoryListFragmentSubcomponentImpl
      implements ActivityModule_ContributeDogCategoryListFragment
          .DogCategoryListFragmentSubcomponent {
    private DogCategoryListFragmentSubcomponentImpl(
        DogCategoryListFragmentSubcomponentBuilder builder) {}

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(5)
          .put(
              BaseListFragment.class,
              (Provider) DaggerAppComponent.this.baseListFragmentSubcomponentBuilderProvider)
          .put(
              DogCategoryListFragment.class,
              (Provider) DaggerAppComponent.this.dogCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              DogSubCategoryListFragment.class,
              (Provider)
                  DaggerAppComponent.this.dogSubCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              ImageListFragment.class,
              (Provider) DaggerAppComponent.this.imageListFragmentSubcomponentBuilderProvider)
          .put(
              ImageFragment.class,
              (Provider) DaggerAppComponent.this.imageFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @Override
    public void inject(DogCategoryListFragment arg0) {
      injectDogCategoryListFragment(arg0);
    }

    private DogCategoryListFragment injectDogCategoryListFragment(
        DogCategoryListFragment instance) {
      BaseFragment_MembersInjector.injectChildFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      BaseListFragment_MembersInjector.injectVmFactory(
          instance, DaggerAppComponent.this.injectingViewModelFactoryProvider.get());
      return instance;
    }
  }

  private final class DogSubCategoryListFragmentSubcomponentBuilder
      extends ActivityModule_ContributeDogSubCategoryListFragment
          .DogSubCategoryListFragmentSubcomponent.Builder {
    private DogSubCategoryListFragment seedInstance;

    @Override
    public ActivityModule_ContributeDogSubCategoryListFragment
            .DogSubCategoryListFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            DogSubCategoryListFragment.class.getCanonicalName() + " must be set");
      }
      return new DogSubCategoryListFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DogSubCategoryListFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DogSubCategoryListFragmentSubcomponentImpl
      implements ActivityModule_ContributeDogSubCategoryListFragment
          .DogSubCategoryListFragmentSubcomponent {
    private DogSubCategoryListFragmentSubcomponentImpl(
        DogSubCategoryListFragmentSubcomponentBuilder builder) {}

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(5)
          .put(
              BaseListFragment.class,
              (Provider) DaggerAppComponent.this.baseListFragmentSubcomponentBuilderProvider)
          .put(
              DogCategoryListFragment.class,
              (Provider) DaggerAppComponent.this.dogCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              DogSubCategoryListFragment.class,
              (Provider)
                  DaggerAppComponent.this.dogSubCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              ImageListFragment.class,
              (Provider) DaggerAppComponent.this.imageListFragmentSubcomponentBuilderProvider)
          .put(
              ImageFragment.class,
              (Provider) DaggerAppComponent.this.imageFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @Override
    public void inject(DogSubCategoryListFragment arg0) {
      injectDogSubCategoryListFragment(arg0);
    }

    private DogSubCategoryListFragment injectDogSubCategoryListFragment(
        DogSubCategoryListFragment instance) {
      BaseFragment_MembersInjector.injectChildFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      BaseListFragment_MembersInjector.injectVmFactory(
          instance, DaggerAppComponent.this.injectingViewModelFactoryProvider.get());
      return instance;
    }
  }

  private final class ImageListFragmentSubcomponentBuilder
      extends ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent.Builder {
    private ImageListFragment seedInstance;

    @Override
    public ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            ImageListFragment.class.getCanonicalName() + " must be set");
      }
      return new ImageListFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ImageListFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ImageListFragmentSubcomponentImpl
      implements ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent {
    private ImageListFragmentSubcomponentImpl(ImageListFragmentSubcomponentBuilder builder) {}

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(5)
          .put(
              BaseListFragment.class,
              (Provider) DaggerAppComponent.this.baseListFragmentSubcomponentBuilderProvider)
          .put(
              DogCategoryListFragment.class,
              (Provider) DaggerAppComponent.this.dogCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              DogSubCategoryListFragment.class,
              (Provider)
                  DaggerAppComponent.this.dogSubCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              ImageListFragment.class,
              (Provider) DaggerAppComponent.this.imageListFragmentSubcomponentBuilderProvider)
          .put(
              ImageFragment.class,
              (Provider) DaggerAppComponent.this.imageFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @Override
    public void inject(ImageListFragment arg0) {
      injectImageListFragment(arg0);
    }

    private ImageListFragment injectImageListFragment(ImageListFragment instance) {
      BaseFragment_MembersInjector.injectChildFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      ImageListFragment_MembersInjector.injectVmFactory(
          instance, DaggerAppComponent.this.injectingViewModelFactoryProvider.get());
      return instance;
    }
  }

  private final class ImageFragmentSubcomponentBuilder
      extends ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent.Builder {
    private ImageFragment seedInstance;

    @Override
    public ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(ImageFragment.class.getCanonicalName() + " must be set");
      }
      return new ImageFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ImageFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ImageFragmentSubcomponentImpl
      implements ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent {
    private ImageFragmentSubcomponentImpl(ImageFragmentSubcomponentBuilder builder) {}

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(5)
          .put(
              BaseListFragment.class,
              (Provider) DaggerAppComponent.this.baseListFragmentSubcomponentBuilderProvider)
          .put(
              DogCategoryListFragment.class,
              (Provider) DaggerAppComponent.this.dogCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              DogSubCategoryListFragment.class,
              (Provider)
                  DaggerAppComponent.this.dogSubCategoryListFragmentSubcomponentBuilderProvider)
          .put(
              ImageListFragment.class,
              (Provider) DaggerAppComponent.this.imageListFragmentSubcomponentBuilderProvider)
          .put(
              ImageFragment.class,
              (Provider) DaggerAppComponent.this.imageFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @Override
    public void inject(ImageFragment arg0) {
      injectImageFragment(arg0);
    }

    private ImageFragment injectImageFragment(ImageFragment instance) {
      BaseFragment_MembersInjector.injectChildFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }
  }
}
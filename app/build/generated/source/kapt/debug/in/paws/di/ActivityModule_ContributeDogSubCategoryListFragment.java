package in.paws.di;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import in.paws.fragment.DogSubCategoryListFragment;

@Module(
  subcomponents =
      ActivityModule_ContributeDogSubCategoryListFragment.DogSubCategoryListFragmentSubcomponent
          .class
)
public abstract class ActivityModule_ContributeDogSubCategoryListFragment {
  private ActivityModule_ContributeDogSubCategoryListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DogSubCategoryListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DogSubCategoryListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DogSubCategoryListFragmentSubcomponent
      extends AndroidInjector<DogSubCategoryListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DogSubCategoryListFragment> {}
  }
}

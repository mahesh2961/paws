package in.paws.di;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import in.paws.fragment.DogCategoryListFragment;

@Module(
  subcomponents =
      ActivityModule_ContributeDogCategoryListFragment.DogCategoryListFragmentSubcomponent.class
)
public abstract class ActivityModule_ContributeDogCategoryListFragment {
  private ActivityModule_ContributeDogCategoryListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DogCategoryListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DogCategoryListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface DogCategoryListFragmentSubcomponent
      extends AndroidInjector<DogCategoryListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DogCategoryListFragment> {}
  }
}

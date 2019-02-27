package in.paws.di;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import in.paws.fragment.ImageListFragment;

@Module(
  subcomponents = ActivityModule_ContributeImageListFragment.ImageListFragmentSubcomponent.class
)
public abstract class ActivityModule_ContributeImageListFragment {
  private ActivityModule_ContributeImageListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ImageListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ImageListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ImageListFragmentSubcomponent extends AndroidInjector<ImageListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ImageListFragment> {}
  }
}

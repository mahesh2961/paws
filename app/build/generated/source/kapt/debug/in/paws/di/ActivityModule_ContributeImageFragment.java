package in.paws.di;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import in.paws.fragment.ImageFragment;

@Module(subcomponents = ActivityModule_ContributeImageFragment.ImageFragmentSubcomponent.class)
public abstract class ActivityModule_ContributeImageFragment {
  private ActivityModule_ContributeImageFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ImageFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ImageFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ImageFragmentSubcomponent extends AndroidInjector<ImageFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ImageFragment> {}
  }
}

package in.paws.di;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import in.paws.fragment.BaseListFragment;

@Module(
  subcomponents = ActivityModule_ContributeBaseListFragment.BaseListFragmentSubcomponent.class
)
public abstract class ActivityModule_ContributeBaseListFragment {
  private ActivityModule_ContributeBaseListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(BaseListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      BaseListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface BaseListFragmentSubcomponent extends AndroidInjector<BaseListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseListFragment> {}
  }
}

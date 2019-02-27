// Generated by Dagger (https://google.github.io/dagger).
package in.paws.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class ImageListFragment_MembersInjector implements MembersInjector<ImageListFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> vmFactoryProvider;

  public ImageListFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> vmFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<ImageListFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> vmFactoryProvider) {
    return new ImageListFragment_MembersInjector(childFragmentInjectorProvider, vmFactoryProvider);
  }

  @Override
  public void injectMembers(ImageListFragment instance) {
    BaseFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  public static void injectVmFactory(
      ImageListFragment instance, ViewModelProvider.Factory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}

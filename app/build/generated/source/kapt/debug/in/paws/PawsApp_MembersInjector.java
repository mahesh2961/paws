// Generated by Dagger (https://google.github.io/dagger).
package in.paws;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class PawsApp_MembersInjector implements MembersInjector<PawsApp> {
  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  public PawsApp_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<PawsApp> create(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    return new PawsApp_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(PawsApp instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  public static void injectDispatchingAndroidInjector(
      PawsApp instance, DispatchingAndroidInjector<Activity> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}

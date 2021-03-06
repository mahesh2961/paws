// Generated by Dagger (https://google.github.io/dagger).
package in.paws.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class NetworkModule_ProvidePawsNetworkLayerFactory implements Factory<NetworkManager> {
  private final NetworkModule module;

  private final Provider<ApiHandler> apiHandlerProvider;

  public NetworkModule_ProvidePawsNetworkLayerFactory(
      NetworkModule module, Provider<ApiHandler> apiHandlerProvider) {
    this.module = module;
    this.apiHandlerProvider = apiHandlerProvider;
  }

  @Override
  public NetworkManager get() {
    return provideInstance(module, apiHandlerProvider);
  }

  public static NetworkManager provideInstance(
      NetworkModule module, Provider<ApiHandler> apiHandlerProvider) {
    return proxyProvidePawsNetworkLayer(module, apiHandlerProvider.get());
  }

  public static NetworkModule_ProvidePawsNetworkLayerFactory create(
      NetworkModule module, Provider<ApiHandler> apiHandlerProvider) {
    return new NetworkModule_ProvidePawsNetworkLayerFactory(module, apiHandlerProvider);
  }

  public static NetworkManager proxyProvidePawsNetworkLayer(
      NetworkModule instance, ApiHandler apiHandler) {
    return Preconditions.checkNotNull(
        instance.providePawsNetworkLayer(apiHandler),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

package in.paws.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u001c\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fJ\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lin/paws/network/NetworkManager;", "", "apiHandler", "Lin/paws/network/ApiHandler;", "(Lin/paws/network/ApiHandler;)V", "getApiHandler", "()Lin/paws/network/ApiHandler;", "setApiHandler", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getDogBreeds", "", "responseHandler", "Lin/paws/IPawsNetworkResponse;", "", "Lin/paws/database/DogCategory;", "getImageForCategory", "category", "", "Lin/paws/pojos/DogImagesResponse;", "getRandomImageForCategory", "Lin/paws/IRandomImageResponseListener;", "app_debug"})
public final class NetworkManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private in.paws.network.ApiHandler apiHandler;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void getDogBreeds(@org.jetbrains.annotations.NotNull()
    in.paws.IPawsNetworkResponse<java.util.List<in.paws.database.DogCategory>> responseHandler) {
    }
    
    public final void getRandomImageForCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    in.paws.IRandomImageResponseListener responseHandler) {
    }
    
    public final void getImageForCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    in.paws.IPawsNetworkResponse<in.paws.pojos.DogImagesResponse> responseHandler) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.network.ApiHandler getApiHandler() {
        return null;
    }
    
    public final void setApiHandler(@org.jetbrains.annotations.NotNull()
    in.paws.network.ApiHandler p0) {
    }
    
    @javax.inject.Inject()
    public NetworkManager(@org.jetbrains.annotations.NotNull()
    in.paws.network.ApiHandler apiHandler) {
        super();
    }
}
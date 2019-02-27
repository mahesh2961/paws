package in.paws.database;

import java.lang.System;

/**
 * * Repository to provide Breeds from Database or web Service
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u001a\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0014J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\"J\u0016\u0010#\u001a\n \u001d*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001a2\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010%\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\'\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020(J\u0010\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010,J\u001e\u0010-\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u00060"}, d2 = {"Lin/paws/database/DogBreedRepository;", "", "dogBreedDao", "Lin/paws/database/DogBreedDao;", "networkLayer", "Lin/paws/network/NetworkManager;", "(Lin/paws/database/DogBreedDao;Lin/paws/network/NetworkManager;)V", "getDogBreedDao", "()Lin/paws/database/DogBreedDao;", "setDogBreedDao", "(Lin/paws/database/DogBreedDao;)V", "getNetworkLayer", "()Lin/paws/network/NetworkManager;", "setNetworkLayer", "(Lin/paws/network/NetworkManager;)V", "fetchCategoryImages", "", "category", "", "handler", "Lin/paws/IPawsNetworkResponse;", "Lin/paws/pojos/DogImagesResponse;", "fetchDogCategories", "", "Lin/paws/database/DogCategory;", "getDogCaetgories", "Landroidx/lifecycle/LiveData;", "getDogCategory", "getPluralStringResouce", "kotlin.jvm.PlatformType", "id", "", "quanity", "getRandomImageForCategory", "Lin/paws/IRandomImageResponseListener;", "getStringResouce", "getSubCategories", "insertData", "newList", "isCategorySync", "", "isDataAvailable", "setRandomImageForCategory", "randomCategory", "Lin/paws/pojos/RandomCategoryImage;", "updateCategoryWithImages", "list", "", "app_debug"})
public final class DogBreedRepository {
    @org.jetbrains.annotations.NotNull()
    private in.paws.database.DogBreedDao dogBreedDao;
    @org.jetbrains.annotations.NotNull()
    private in.paws.network.NetworkManager networkLayer;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> getDogCaetgories() {
        return null;
    }
    
    public final void insertData(@org.jetbrains.annotations.NotNull()
    java.util.List<in.paws.database.DogCategory> newList) {
    }
    
    public final void fetchDogCategories(@org.jetbrains.annotations.NotNull()
    in.paws.IPawsNetworkResponse<java.util.List<in.paws.database.DogCategory>> handler) {
    }
    
    public final boolean isDataAvailable() {
        return false;
    }
    
    public final void getRandomImageForCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    in.paws.IRandomImageResponseListener handler) {
    }
    
    public final java.lang.String getStringResouce(int id) {
        return null;
    }
    
    public final java.lang.String getPluralStringResouce(int id, int quanity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> getSubCategories(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    public final boolean isCategorySync(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<in.paws.database.DogCategory> getDogCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    public final void fetchCategoryImages(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    in.paws.IPawsNetworkResponse<in.paws.pojos.DogImagesResponse> handler) {
    }
    
    public final void setRandomImageForCategory(@org.jetbrains.annotations.Nullable()
    in.paws.pojos.RandomCategoryImage randomCategory) {
    }
    
    public final void updateCategoryWithImages(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.database.DogBreedDao getDogBreedDao() {
        return null;
    }
    
    public final void setDogBreedDao(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.network.NetworkManager getNetworkLayer() {
        return null;
    }
    
    public final void setNetworkLayer(@org.jetbrains.annotations.NotNull()
    in.paws.network.NetworkManager p0) {
    }
    
    @javax.inject.Inject()
    public DogBreedRepository(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedDao dogBreedDao, @org.jetbrains.annotations.NotNull()
    in.paws.network.NetworkManager networkLayer) {
        super();
    }
}
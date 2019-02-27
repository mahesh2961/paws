package in.paws.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\u0019J\b\u0010 \u001a\u00020\u0019H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lin/paws/viewmodels/CategoryImageViewModel;", "Lin/paws/viewmodels/BaseViewModel;", "Lin/paws/IPawsNetworkResponse;", "Lin/paws/pojos/DogImagesResponse;", "dogBreedRepository", "Lin/paws/database/DogBreedRepository;", "(Lin/paws/database/DogBreedRepository;)V", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "dogCategory", "Landroidx/lifecycle/MediatorLiveData;", "Lin/paws/database/DogCategory;", "getDogCategory", "()Landroidx/lifecycle/MediatorLiveData;", "liveDogSubCategory", "Landroidx/lifecycle/LiveData;", "getLiveDogSubCategory", "()Landroidx/lifecycle/LiveData;", "setLiveDogSubCategory", "(Landroidx/lifecycle/LiveData;)V", "error", "", "", "fetchImages", "fetchImagesIfNotAvailable", "getDogBreedsForCategory", "initiate", "referesh", "setMediator", "sucessReponse", "response", "app_debug"})
public final class CategoryImageViewModel extends in.paws.viewmodels.BaseViewModel implements in.paws.IPawsNetworkResponse<in.paws.pojos.DogImagesResponse> {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String category;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<in.paws.database.DogCategory> dogCategory = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<in.paws.database.DogCategory> liveDogSubCategory;
    private final in.paws.database.DogBreedRepository dogBreedRepository = null;
    
    @java.lang.Override()
    public void sucessReponse(@org.jetbrains.annotations.NotNull()
    in.paws.pojos.DogImagesResponse response) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<in.paws.database.DogCategory> getDogCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<in.paws.database.DogCategory> getLiveDogSubCategory() {
        return null;
    }
    
    public final void setLiveDogSubCategory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<in.paws.database.DogCategory> p0) {
    }
    
    public final void initiate(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    private final void fetchImagesIfNotAvailable() {
    }
    
    private final void fetchImages() {
    }
    
    private final void getDogBreedsForCategory(java.lang.String category) {
    }
    
    private final void setMediator() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<in.paws.database.DogCategory> getCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    public final void referesh() {
    }
    
    @javax.inject.Inject()
    public CategoryImageViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedRepository dogBreedRepository) {
        super(null);
    }
}
package in.paws.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u001f\u001a\u00020\u001aH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006 "}, d2 = {"Lin/paws/viewmodels/DogSubCategoryViewModel;", "Lin/paws/viewmodels/BaseCategoryViewModel;", "dogBreedRepository", "Lin/paws/database/DogBreedRepository;", "(Lin/paws/database/DogBreedRepository;)V", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "dogCategory", "Landroidx/lifecycle/MediatorLiveData;", "", "Lin/paws/database/DogCategory;", "getDogCategory", "()Landroidx/lifecycle/MediatorLiveData;", "liveDogSubCategory", "Landroidx/lifecycle/LiveData;", "getLiveDogSubCategory", "()Landroidx/lifecycle/LiveData;", "setLiveDogSubCategory", "(Landroidx/lifecycle/LiveData;)V", "getBreedTitle", "breed", "getDogBreeds", "", "getDogBreedsForCategory", "getSubCategories", "getSubCategoryCount", "initiate", "setMediator", "app_debug"})
public final class DogSubCategoryViewModel extends in.paws.viewmodels.BaseCategoryViewModel {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String category;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<in.paws.database.DogCategory>> dogCategory = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> liveDogSubCategory;
    private final in.paws.database.DogBreedRepository dogBreedRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBreedTitle(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogCategory breed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSubCategoryCount(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogCategory breed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void getDogBreeds() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<in.paws.database.DogCategory>> getDogCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> getLiveDogSubCategory() {
        return null;
    }
    
    public final void setLiveDogSubCategory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> p0) {
    }
    
    public final void initiate(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    private final void getDogBreedsForCategory(java.lang.String category) {
    }
    
    private final void setMediator() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<in.paws.database.DogCategory>> getSubCategories(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    @javax.inject.Inject()
    public DogSubCategoryViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedRepository dogBreedRepository) {
        super(null);
    }
}
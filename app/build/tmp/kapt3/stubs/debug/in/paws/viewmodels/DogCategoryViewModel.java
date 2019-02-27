package in.paws.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\tJ\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0006\u0010\u001e\u001a\u00020\u0013J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\u0016\u0010 \u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lin/paws/viewmodels/DogCategoryViewModel;", "Lin/paws/viewmodels/BaseCategoryViewModel;", "Lin/paws/IPawsNetworkResponse;", "", "Lin/paws/database/DogCategory;", "dogBreedRepository", "Lin/paws/database/DogBreedRepository;", "(Lin/paws/database/DogBreedRepository;)V", "categoryList", "Landroidx/lifecycle/MediatorLiveData;", "getCategoryList", "()Landroidx/lifecycle/MediatorLiveData;", "liveCategoryList", "Landroidx/lifecycle/LiveData;", "getLiveCategoryList", "()Landroidx/lifecycle/LiveData;", "setLiveCategoryList", "(Landroidx/lifecycle/LiveData;)V", "error", "", "", "fetchCategories", "fetchCategoriesIfNotAvailable", "getAllCategories", "getBreedTitle", "", "breed", "getCatgories", "getDogBreeds", "getSubCategoryCount", "refresh", "setMediator", "sucessReponse", "list", "app_debug"})
public final class DogCategoryViewModel extends in.paws.viewmodels.BaseCategoryViewModel implements in.paws.IPawsNetworkResponse<java.util.List<? extends in.paws.database.DogCategory>> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<in.paws.database.DogCategory>> categoryList = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> liveCategoryList;
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
    public final androidx.lifecycle.MediatorLiveData<java.util.List<in.paws.database.DogCategory>> getCategoryList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> getLiveCategoryList() {
        return null;
    }
    
    public final void setLiveCategoryList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<in.paws.database.DogCategory>> getCatgories() {
        return null;
    }
    
    public final void getAllCategories() {
    }
    
    private final void fetchCategories() {
    }
    
    private final void fetchCategoriesIfNotAvailable() {
    }
    
    public final void refresh() {
    }
    
    @java.lang.Override()
    public void getDogBreeds() {
    }
    
    private final void setMediator() {
    }
    
    @java.lang.Override()
    public void sucessReponse(@org.jetbrains.annotations.NotNull()
    java.util.List<in.paws.database.DogCategory> list) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @javax.inject.Inject()
    public DogCategoryViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedRepository dogBreedRepository) {
        super(null);
    }
}
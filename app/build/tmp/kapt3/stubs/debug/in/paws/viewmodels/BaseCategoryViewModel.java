package in.paws.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tJ\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lin/paws/viewmodels/BaseCategoryViewModel;", "Lin/paws/viewmodels/BaseViewModel;", "Lin/paws/IRandomImageResponseListener;", "dogBreedRepository", "Lin/paws/database/DogBreedRepository;", "(Lin/paws/database/DogBreedRepository;)V", "getBreedTitle", "", "breed", "Lin/paws/database/DogCategory;", "getDogBreeds", "", "getRandomImage", "dogCategory", "getStringResouce", "kotlin.jvm.PlatformType", "id", "", "getSubCategoryCount", "onRandomImageResponseSuccess", "randomCategoryImage", "Lin/paws/pojos/RandomCategoryImage;", "onRandomImageResponseThrowable", "e", "", "app_debug"})
public abstract class BaseCategoryViewModel extends in.paws.viewmodels.BaseViewModel implements in.paws.IRandomImageResponseListener {
    private final in.paws.database.DogBreedRepository dogBreedRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRandomImage(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogCategory dogCategory) {
        return null;
    }
    
    public abstract void getDogBreeds();
    
    public final java.lang.String getStringResouce(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void onRandomImageResponseSuccess(@org.jetbrains.annotations.Nullable()
    in.paws.pojos.RandomCategoryImage randomCategoryImage) {
    }
    
    @java.lang.Override()
    public void onRandomImageResponseThrowable(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBreedTitle(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogCategory breed);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSubCategoryCount(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogCategory breed);
    
    public BaseCategoryViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedRepository dogBreedRepository) {
        super(null);
    }
}
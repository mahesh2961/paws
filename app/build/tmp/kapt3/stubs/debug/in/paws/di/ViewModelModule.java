package in.paws.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lin/paws/di/ViewModelModule;", "", "()V", "bindCategoryImageViewModel", "Landroidx/lifecycle/ViewModel;", "categoryImageViewModel", "Lin/paws/viewmodels/CategoryImageViewModel;", "bindDogCategoryViewModel", "dogCategoryViewModel", "Lin/paws/viewmodels/DogCategoryViewModel;", "bindDogSubCategoryViewModel", "dogSubCategoryViewModel", "Lin/paws/viewmodels/DogSubCategoryViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lin/paws/di/InjectingViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = in.paws.viewmodels.DogSubCategoryViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDogSubCategoryViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.viewmodels.DogSubCategoryViewModel dogSubCategoryViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = in.paws.viewmodels.DogCategoryViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDogCategoryViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.viewmodels.DogCategoryViewModel dogCategoryViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = in.paws.viewmodels.CategoryImageViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindCategoryImageViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.viewmodels.CategoryImageViewModel categoryImageViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    in.paws.di.InjectingViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}
package in.paws.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lin/paws/di/ActivityModule;", "", "()V", "contributeBaseListFragment", "Lin/paws/fragment/BaseListFragment;", "contributeDogCategoryListFragment", "Lin/paws/fragment/DogCategoryListFragment;", "contributeDogSubCategoryListFragment", "Lin/paws/fragment/DogSubCategoryListFragment;", "contributeImageFragment", "Lin/paws/fragment/ImageFragment;", "contributeImageListFragment", "Lin/paws/fragment/ImageListFragment;", "contributePawsActivity", "Lin/paws/activities/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract in.paws.activities.MainActivity contributePawsActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract in.paws.fragment.BaseListFragment contributeBaseListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract in.paws.fragment.DogCategoryListFragment contributeDogCategoryListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract in.paws.fragment.DogSubCategoryListFragment contributeDogSubCategoryListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract in.paws.fragment.ImageListFragment contributeImageListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract in.paws.fragment.ImageFragment contributeImageFragment();
    
    public ActivityModule() {
        super();
    }
}
package `in`.paws.di

import `in`.paws.activities.MainActivity
import `in`.paws.fragment.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributePawsActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeBaseListFragment(): BaseListFragment

    @ContributesAndroidInjector
    abstract fun contributeDogCategoryListFragment(): DogCategoryListFragment

    @ContributesAndroidInjector
    abstract fun contributeDogSubCategoryListFragment(): DogSubCategoryListFragment

    @ContributesAndroidInjector
    abstract fun contributeImageListFragment(): ImageListFragment

    @ContributesAndroidInjector
    abstract fun contributeImageFragment(): ImageFragment
}
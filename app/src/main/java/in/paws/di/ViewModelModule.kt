package `in`.paws.di

import `in`.paws.viewmodels.CategoryImageViewModel
import `in`.paws.viewmodels.DogCategoryViewModel
import `in`.paws.viewmodels.DogSubCategoryViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DogSubCategoryViewModel::class)
    abstract fun bindDogSubCategoryViewModel(dogSubCategoryViewModel: DogSubCategoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DogCategoryViewModel::class)
    abstract fun bindDogCategoryViewModel(dogCategoryViewModel: DogCategoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CategoryImageViewModel::class)
    abstract fun bindCategoryImageViewModel(categoryImageViewModel: CategoryImageViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: InjectingViewModelFactory): ViewModelProvider.Factory
}
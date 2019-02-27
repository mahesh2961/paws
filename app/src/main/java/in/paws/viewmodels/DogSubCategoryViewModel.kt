package `in`.paws.viewmodels

import `in`.paws.R
import `in`.paws.database.DogBreedRepository
import `in`.paws.database.DogCategory
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import javax.inject.Inject

class DogSubCategoryViewModel @Inject constructor(
        private val dogBreedRepository: DogBreedRepository
) : BaseCategoryViewModel(dogBreedRepository)

{
    override fun getBreedTitle(breed: DogCategory): String {
        return breed.category.split("-")[1];
    }

    override fun getSubCategoryCount(breed: DogCategory): String {
        return ""
    }

    lateinit var category: String;

    override fun getDogBreeds() {
        getDogBreedsForCategory(category)
    }

    val dogCategory = MediatorLiveData<List<DogCategory>>()

    lateinit var  liveDogSubCategory: LiveData<List<DogCategory>>


    fun initiate(category: String){
        this.category=category;
        getDogBreedsForCategory(category)
        setMediator()
    }


    private fun getDogBreedsForCategory(category:String) {
        liveDogSubCategory = dogBreedRepository.getSubCategories(category)
    }

    private fun setMediator() {
        dogCategory.addSource(liveDogSubCategory, dogCategory::setValue)
    }

    fun getSubCategories(category: String):MediatorLiveData<List<DogCategory>>
    {
       initiate(category);
        return dogCategory
    }

}
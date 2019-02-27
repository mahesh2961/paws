package `in`.paws.viewmodels

import `in`.paws.IRandomImageResponseListener
import `in`.paws.database.DogBreedRepository
import `in`.paws.database.DogCategory
import `in`.paws.pojos.RandomCategoryImage
import java.util.concurrent.Executors


abstract class BaseCategoryViewModel constructor(
        private val dogBreedRepository: DogBreedRepository
) : BaseViewModel(dogBreedRepository), IRandomImageResponseListener {

    fun getRandomImage(dogCategory: DogCategory): String {
        if (dogCategory.images.isNullOrEmpty()) {
            dogBreedRepository.getRandomImageForCategory(dogCategory.category, this)
            return ""//Todo
        } else return dogCategory.images.get(0)
    }

    abstract fun getDogBreeds();


    fun getStringResouce(id: Int) = dogBreedRepository.getStringResouce(id)


    override fun onRandomImageResponseSuccess(randomCategoryImage: RandomCategoryImage?) {
        val executor = Executors.newSingleThreadExecutor()
        executor.execute {
            dogBreedRepository.setRandomImageForCategory(randomCategoryImage)
            getDogBreeds()
        }

    }

    override fun onRandomImageResponseThrowable(e: Throwable?) {

    }

    abstract fun getBreedTitle(breed:DogCategory):String

    abstract fun getSubCategoryCount(breed:DogCategory):String

}



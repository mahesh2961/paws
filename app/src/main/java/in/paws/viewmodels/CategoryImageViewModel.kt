package `in`.paws.viewmodels

import `in`.paws.IPawsNetworkResponse
import `in`.paws.R
import `in`.paws.database.DogBreedRepository
import `in`.paws.database.DogCategory
import `in`.paws.pojos.DogImagesResponse
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import java.util.concurrent.Executors
import javax.inject.Inject

class CategoryImageViewModel @Inject constructor(
        private val dogBreedRepository: DogBreedRepository
) : BaseViewModel(dogBreedRepository), IPawsNetworkResponse<DogImagesResponse> {
    override fun sucessReponse(response: DogImagesResponse) {
        if (response.status.equals("success")) {
            val executor = Executors.newSingleThreadExecutor()
            executor.execute{
                dogBreedRepository.updateCategoryWithImages(category, response.message)
                setShowMessage(false)
                postDisplayMessage(null)
            }

        }

    }

    override fun error(error: Throwable) {
        setShowMessage(true)
        postDisplayMessage(dogBreedRepository.getStringResouce(R.string.message_network_error))
    }


    lateinit var category: String;

    val dogCategory = MediatorLiveData<DogCategory>()

    lateinit var liveDogSubCategory: LiveData<DogCategory>

    fun initiate(category: String) {
        this.category = category;
        getDogBreedsForCategory(category)
        setMediator()
        fetchImagesIfNotAvailable()
    }

    private fun fetchImagesIfNotAvailable() {
        val executor = Executors.newSingleThreadExecutor()
        executor.execute {
            if (!dogBreedRepository.isCategorySync(category)) {
                fetchImages()
            } else
                setShowMessage(false)
        }
    }

    private fun fetchImages() {
        setShowMessage(true)
        postDisplayMessage(dogBreedRepository.getStringResouce(R.string.messgae_loading))
        dogBreedRepository.fetchCategoryImages(category, this)
    }


    private fun getDogBreedsForCategory(category: String) {
        liveDogSubCategory = dogBreedRepository.getDogCategory(category)
    }

    private fun setMediator() {
        dogCategory.addSource(liveDogSubCategory, dogCategory::setValue)
    }

    fun getCategory(category: String): MediatorLiveData<DogCategory> {
        initiate(category);
        return dogCategory
    }

    fun referesh() {
        getDogBreedsForCategory(category)
        fetchImagesIfNotAvailable()
    }


}
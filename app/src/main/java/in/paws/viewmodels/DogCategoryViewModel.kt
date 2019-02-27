package `in`.paws.viewmodels

import `in`.paws.IPawsNetworkResponse
import `in`.paws.R
import `in`.paws.database.DogBreedRepository
import `in`.paws.database.DogCategory
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import java.util.concurrent.Executors
import javax.inject.Inject

class DogCategoryViewModel@Inject constructor(
        private val dogBreedRepository: DogBreedRepository
):BaseCategoryViewModel(dogBreedRepository), IPawsNetworkResponse<List<DogCategory>>
{
    override fun getBreedTitle(breed: DogCategory): String {
        return breed.category;
    }

    override fun getSubCategoryCount(breed: DogCategory): String {
            if(breed.subCategory.size>0)
            return dogBreedRepository.getPluralStringResouce(R.plurals.sub_cat_count,breed.subCategory.size)
        else return "";
    }

    val categoryList = MediatorLiveData<List<DogCategory>>()

    lateinit var  liveCategoryList: LiveData<List<DogCategory>>


    init {
        getAllCategories()
    }

    fun getCatgories() = categoryList

    fun getAllCategories()
    {
        getDogBreeds()
        setMediator()
        fetchCategoriesIfNotAvailable()
    }

    private fun fetchCategories() {
        setShowMessage(true)
        postDisplayMessage(getStringResouce(R.string.messgae_loading))
        dogBreedRepository.fetchDogCategories(this)
    }

    private fun fetchCategoriesIfNotAvailable() {
        val executor = Executors.newSingleThreadExecutor()
        executor.execute {
            if(!dogBreedRepository.isDataAvailable()) {
                fetchCategories()
            }
            else
                setShowMessage(false)
        }
    }

    public fun refresh() =fetchCategories()

    override fun getDogBreeds() {
        liveCategoryList = dogBreedRepository.getDogCaetgories()
    }


    private fun setMediator() {
        categoryList.addSource(liveCategoryList, categoryList::setValue)

    }

    override fun sucessReponse(list: List<DogCategory>) {
        val executor = Executors.newSingleThreadExecutor()
        setShowMessage(false)
        executor.execute {
            dogBreedRepository.insertData(list)
            if (!list.isNullOrEmpty()) {
                categoryList.postValue(list)
                postDisplayMessage(null)
            }
            else postDisplayMessage(getStringResouce(R.string.no_breeds_found))
        }
    }

    override fun error(error: Throwable) {
        setShowMessage(true)
        postDisplayMessage(getStringResouce(R.string.message_network_error))
    }


}
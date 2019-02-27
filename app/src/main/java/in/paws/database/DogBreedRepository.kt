package `in`.paws.database

import `in`.paws.PawsApp
import `in`.paws.IPawsNetworkResponse
import `in`.paws.IRandomImageResponseListener
import `in`.paws.R
import `in`.paws.network.NetworkManager
import `in`.paws.pojos.DogImagesResponse
import `in`.paws.pojos.RandomCategoryImage
import androidx.lifecycle.LiveData
import kotlinx.android.synthetic.main.list_item_bread.view.*
import javax.inject.Inject

/**
 * Repository to provide Breeds from Database or web Service
 */

class DogBreedRepository @Inject constructor(var dogBreedDao : DogBreedDao, var networkLayer :NetworkManager) {


    fun getDogCaetgories() = dogBreedDao.getDogBreeds(false)

    fun insertData(newList: List<DogCategory>) = dogBreedDao.insertAll(newList)

    fun fetchDogCategories(handler: IPawsNetworkResponse<List<DogCategory>>) = networkLayer.getDogBreeds(handler)

    fun isDataAvailable()=(dogBreedDao.getNumberOfRows()>0)

    fun getRandomImageForCategory(category:String,handler:IRandomImageResponseListener)
            =networkLayer.getRandomImageForCategory(category,handler)


    fun getStringResouce(id :Int)= PawsApp.instance.getString(id)

    fun getPluralStringResouce(id :Int,quanity:Int)= PawsApp.instance.resources.getQuantityString(id,quanity,quanity);


    fun getSubCategories(category: String):LiveData<List<DogCategory>>{
        var query="%"+category+"-%"
        return dogBreedDao.getSubCategories(query)
    }

    fun isCategorySync(category: String)=dogBreedDao.getIsCategorySynced(category)


    fun getDogCategory(category: String)=dogBreedDao.getCategoryAsync(category)

    fun fetchCategoryImages(category: String,handler: IPawsNetworkResponse<DogImagesResponse>)=networkLayer.getImageForCategory(category,handler)




    fun setRandomImageForCategory(randomCategory:RandomCategoryImage?)  {

         var  cat= dogBreedDao.getCategory(randomCategory?.category!!)
          if(!cat.images.contains(randomCategory.imageUrl)) {
              cat.images.add(randomCategory.imageUrl!!)
              dogBreedDao.update(cat)

          }


    }


    fun updateCategoryWithImages(category: String,list:MutableList<String>?)  {

        var  cat= dogBreedDao.getCategory(category)
        cat.images= list!!
        cat.isSynced=true
        dogBreedDao.update(cat)

    }


}
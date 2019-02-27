package `in`.paws.network

import `in`.paws.IPawsNetworkResponse
import `in`.paws.IRandomImageResponseListener
import `in`.paws.database.DogCategory
import `in`.paws.pojos.DogImagesResponse
import `in`.paws.pojos.RandomCategoryImage
import `in`.paws.utils.ParsingUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Handles request and response to and from Webservice
 */
const val TAG = "NetworkManager"

class NetworkManager @Inject constructor(var apiHandler: `in`.paws.network.ApiHandler) {
    val compositeDisposable = CompositeDisposable()

    fun getDogBreeds(responseHandler: IPawsNetworkResponse<List<DogCategory>>) {
            val subscription = apiHandler.allBreeds
                    .subscribeOn(Schedulers.io())
                    .map { response -> ParsingUtils.getDogCategoryList(response.message) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(responseHandler::sucessReponse, responseHandler::error)
            compositeDisposable.addAll(subscription)

    }

    fun getRandomImageForCategory(category:String,responseHandler: IRandomImageResponseListener) {

        val subscription = apiHandler.getRandomImageForCategory(category)
                .subscribeOn(Schedulers.io())
                .map { response -> RandomCategoryImage(response.message,category) }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(responseHandler::onRandomImageResponseSuccess, responseHandler::onRandomImageResponseThrowable)
        compositeDisposable.addAll(subscription)

    }

    fun getImageForCategory(category:String,responseHandler: IPawsNetworkResponse<DogImagesResponse>) {

        val subscription = apiHandler.getImagesForCategory(category)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(responseHandler::sucessReponse, responseHandler::error)
        compositeDisposable.addAll(subscription)

    }

}
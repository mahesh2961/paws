package `in`.paws.viewmodels

import `in`.paws.database.DogBreedRepository
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

abstract class BaseViewModel constructor(
        private val dogBreedRepository: DogBreedRepository
) : ViewModel() {


    var displayMessage = ObservableField<Boolean>()

    var message = ObservableField<String>()


    fun setShowMessage(showMessage: Boolean?) {
        this.displayMessage.set(showMessage)
    }

    fun postDisplayMessage(message: String?) {
        this.message.set(message)
    }

}
package kh.edu.rupp.ite.let_trip_project.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoadingContentViewModel @Inject constructor() : ViewModel(), ViewModelStoreOwner {

    private var errorMessage = MutableLiveData<String>()
    private var displayError = MutableLiveData<Boolean>()
    private var displayLoadingContentSkeleton = MutableLiveData(true)
    private var onRetryListener: () -> Unit = {}


    private   var LoadingContentViewModel =
        ViewModelProvider(this).get(LoadingContentViewModel::class.java)
    fun getErrorMessage(): LiveData<String> {
        return errorMessage
    }

    fun getDisplayError(): LiveData<Boolean> {
        return displayError
    }

    fun getDisplayLoadingContentSkeleton(): LiveData<Boolean> {
        return displayLoadingContentSkeleton
    }

    fun onRetryClicked() {
        onRetryListener.invoke()
    }

    fun onRetryListener(listener: () -> Unit) {
        onRetryListener = listener
    }

    fun showError(error: String) {
        displayError.postValue(true)
        displayLoadingContentSkeleton.postValue(false)
        errorMessage.postValue(error)
    }

    fun showLoadingContentSkeleton() {
        displayLoadingContentSkeleton.postValue(true)
        displayError.postValue(false)
    }

    fun hideScreenLoadingOrError() {
        displayError.postValue(false)
        errorMessage.postValue("")
        displayLoadingContentSkeleton.postValue(false)
    }

    fun isDisplayingAnyContent(): Boolean {
        return displayError.value == true || displayLoadingContentSkeleton.value == true
    }

    override val viewModelStore: ViewModelStore
        get() = TODO("Not yet implemented")
}
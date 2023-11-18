package kh.edu.rupp.ite.let_trip_project.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kh.edu.rupp.ite.let_trip_project.Model.DestinationModel
import kh.edu.rupp.ite.let_trip_project.Repository.DestinationRepo
import kotlinx.coroutines.launch

class DestinationViewModel(private val repository: DestinationRepo) : ViewModel() {

    private val _myModel = MutableLiveData<DestinationModel>()
    val destinationModel: LiveData<DestinationModel> get() = _myModel

    fun fetchData() {
        viewModelScope.launch {
            try {
                _myModel.value = repository.getDestinationModel()
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}

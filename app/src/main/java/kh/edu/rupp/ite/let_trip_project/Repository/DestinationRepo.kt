package kh.edu.rupp.ite.let_trip_project.Repository

import ApiService
import kh.edu.rupp.ite.let_trip_project.Model.DestinationModel

class DestinationRepo(private val apiService: ApiService) {
    suspend fun getDestinationModel(): DestinationModel {
        return apiService.getMyModel()
    }
}
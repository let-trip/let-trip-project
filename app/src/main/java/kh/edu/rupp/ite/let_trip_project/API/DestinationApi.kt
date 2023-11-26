package kh.edu.rupp.ite.let_trip_project.API// kh.edu.rupp.ite.let_trip_project.API.ApiService.kt
import kh.edu.rupp.ite.let_trip_project.Model.DestinationModel
import retrofit2.http.GET

interface ApiService {
    @GET("http://server.mekmunsopheaktra.com/api/destination")
    suspend fun getMyModel(): DestinationModel
}
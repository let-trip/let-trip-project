package kh.edu.rupp.ite.let_trip_project.retrofit

import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

object RetrofitManager {
    private const val BASE_URL = "http://server.mekmunsopheaktra.com/"

//    @Provides
//    @Singleton
//    fun provideRetrofit(
//        loggingInterceptor: HttpLoggingInterceptor, headerInterceptor: HeaderInterceptor
//    ): Retrofit {
//        val clientBuilder = OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
//            .writeTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS)
//
//        clientBuilder.addInterceptor(loggingInterceptor)
//        clientBuilder.addInterceptor(headerInterceptor)
//        val builder: Retrofit.Builder =
//            Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
//                .client(clientBuilder.build())
//
//        return builder.build()
//    }
}
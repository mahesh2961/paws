package `in`.paws.network


import `in`.paws.BuildConfig
import `in`.paws.pojos.DogsCategoryResponse
import `in`.paws.utils.API_HOST
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {


    @Provides
    @Singleton
    fun buildNetworkApi(): `in`.paws.network.ApiHandler {
        val clientBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            clientBuilder.interceptors().add(logging)
        }

        return Retrofit.Builder().client(clientBuilder.build())
                .baseUrl(API_HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(`in`.paws.network.ApiHandler::class.java)

    }


    @Provides
    @Singleton
    fun providePawsNetworkLayer(apiHandler: `in`.paws.network.ApiHandler) :NetworkManager= NetworkManager(apiHandler);
}

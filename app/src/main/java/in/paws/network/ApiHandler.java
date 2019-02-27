package in.paws.network;


import in.paws.pojos.DogImagesResponse;
import in.paws.pojos.DogsCategoryResponse;
import in.paws.pojos.RandomDogImageResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Api Handler for Retrofit
 */
public interface ApiHandler {

    @GET("breeds/list/all")
    Observable<DogsCategoryResponse> getAllBreeds();

    @GET("breed/{category}/images/random")
    Observable<RandomDogImageResponse> getRandomImageForCategory(@Path("category") String breed);

    @GET("breed/{category}/images")
    Observable<DogImagesResponse> getImagesForCategory(@Path("category") String breed);


}

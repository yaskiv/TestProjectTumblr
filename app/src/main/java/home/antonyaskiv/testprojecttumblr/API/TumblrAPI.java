package home.antonyaskiv.testprojecttumblr.API;

import home.antonyaskiv.testprojecttumblr.Model.Example;
import home.antonyaskiv.testprojecttumblr.Model.Response_of_API;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by AntonYaskiv on 09.01.2018.
 */

public interface TumblrAPI {
    @GET("/v2/blog/{user_name}/posts?")
    Call<Example> getAllPostsByUser(@Path("user_name")String user_name, @Query("api_key") String api_key);
}

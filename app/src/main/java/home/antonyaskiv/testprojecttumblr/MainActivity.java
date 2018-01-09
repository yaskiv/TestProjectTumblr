package home.antonyaskiv.testprojecttumblr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.android.youtube.player.YouTubeBaseActivity;

import home.antonyaskiv.testprojecttumblr.API.TumblrAPI;
import home.antonyaskiv.testprojecttumblr.Adapter.AdapterForRecyclerView;
import home.antonyaskiv.testprojecttumblr.Model.Example;
import home.antonyaskiv.testprojecttumblr.Model.Video;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends YouTubeBaseActivity {
    TextView userView;
    private HttpLoggingInterceptor interceptor;
    private Retrofit retrofit;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fresco.initialize(this);
        userView = findViewById(R.id.user_name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ApiInit();
    }

    public void load(View view) {
        LoadUserPosts(userView.getText().toString());
    }


    public void ApiInit() {
        interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.tumblr.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public void LoadUserPosts(String user_name) {


        Callback<Example> req = new Callback<Example>() {

            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                AdapterForRecyclerView adapter = new AdapterForRecyclerView(response.body().getResponseOfAPI().getPosts(), getApplicationContext());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("API_Response", "errror");
            }
        };
        TumblrAPI api = retrofit.create(TumblrAPI.class);

        api.getAllPostsByUser(user_name, getString(R.string.api_key))
                .enqueue(req);


    }
}

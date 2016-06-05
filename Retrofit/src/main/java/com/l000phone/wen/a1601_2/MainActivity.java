package com.l000phone.wen.a1601_2;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.l000phone.wen.a1601_2.api.ApiServer;
import com.l000phone.wen.a1601_2.entity.BaseEntity;
import com.l000phone.wen.a1601_2.entity.User;
import com.l000phone.wen.a1601_2.utils.ApiConstans;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * 第一步声明APi接口
 * 步骤二 声明方法 声明请求方式
 * MVC
 * MOdel  数据
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private User user;
//    @BindView(R.id.login_user_btn)
//    private Button loginBtn;
//    @BindView(R.id.update_user_btn)
//    private Button updateBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//        loginBtn = (Button) findViewById(R.id.login_user_btn);
//        updateBtn = (Button) findViewById(R.id.update_user_btn);


//        loginBtn.setOnClickListener(this);
//        updateBtn.setOnClickListener(this);
        upload();

//        get();
//        post();
    }

    private void get() {
        //实例化 Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstans.RequestUrl.BASE_URL)//必要参数 baseUrl
                //添加转化器
//                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofit.create(ApiServer.class).headerList(1, 5).enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                Log.e("tag", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }

    /**
     * post请求
     *
     * @query @queryMap
     */
    public void post() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstans.RequestUrl.BASE_URL)//必要参数 baseUrl
                //添加转化器
//                .addConverterFactory(GsonConverterFactory.create())
                .build();

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "hehe");
        map.put("pwd", "123456");

        retrofit.create(ApiServer.class).login(map).enqueue(new Callback<BaseEntity>() {
            @Override
            public void onResponse(Call<BaseEntity> call, Response<BaseEntity> response) {
                BaseEntity entity = response.body();
//                user = entity.getData();
//                Log.e("tag", user.toString());
            }

            @Override
            public void onFailure(Call<BaseEntity> call, Throwable t) {

            }
        });

    }

    /**
     * put请求
     *
     * @body
     */
    public void put() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstans.RequestUrl.BASE_URL)//必要参数 baseUrl
                //添加转化器
//                .addConverterFactory(GsonConverterFactory.create())
                .build();
//        user.setEmail("123456@163.com");

//
//        retrofit.create(ApiServer.class).update(user).enqueue(new Callback<BaseEntity>() {
//            @Override
//            public void onResponse(Call<BaseEntity> call, Response<BaseEntity> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<BaseEntity> call, Throwable t) {
//
//            }
//        });

    }


    public void upload() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstans.RequestUrl.BASE_URL)//必要参数 baseUrl
                //添加转化器
//                .addConverterFactory(GsonConverterFactory.create())
                .build();

        String path = Environment.getExternalStorageDirectory() + File.separator + "Download" + File.separator + "123.jpg";

        File file = new File(path);
        MediaType type = MediaType.parse("image/*");
        RequestBody fileBody = RequestBody.create(type, file);
        MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), fileBody);

        retrofit.create(ApiServer.class).upload("1", body).enqueue(new Callback<Response<String>>() {
            @Override
            public void onResponse(Call<Response<String>> call, Response<Response<String>> response) {
                Log.e("onResponse", "onResponse");
            }

            @Override
            public void onFailure(Call<Response<String>> call, Throwable t) {
                Log.e("onFailure", "onFailure");
            }
        });


    }


    //    @OnClick({R.id.update_user_btn, R.id.login_user_btn})
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.update_user_btn:
//                put();
//                break;
////            case R.id.login_user_btn:
//                post();
//                break;

        }
    }


}
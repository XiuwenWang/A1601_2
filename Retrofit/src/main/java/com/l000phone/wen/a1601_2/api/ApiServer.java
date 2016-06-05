package com.l000phone.wen.a1601_2.api;

import com.l000phone.wen.a1601_2.entity.BaseEntity;
import com.l000phone.wen.a1601_2.entity.User;
import com.l000phone.wen.a1601_2.utils.ApiConstans;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * 项目名称：
 * 类描述：
 * 创建人：a.wen
 * 创建时间：2016/4/27
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public interface ApiServer {

    //    http://10.6.157.85:8080/api/v1.0/account/list/1/5

    @GET("account/list/{page}/{size}")
    Call<List<User>> headerList(@Path("page") int page, @Path("size") int size);

    //    String name, String pwd
    @POST(ApiConstans.RequestUrl.URL_LOGIN_POST)
    Call<BaseEntity> login(@Query("name") String name, @Query("pwd") String password);

    @POST(ApiConstans.RequestUrl.URL_LOGIN_POST)
    Call<BaseEntity> login(@QueryMap Map<String, String> params);

    @PUT(ApiConstans.RequestUrl.URL_UPDATE_POST)
    Call<BaseEntity> update(@Body User user);


    @Multipart
    @POST(ApiConstans.RequestUrl.URL_LOGIN_UPDATE_POST)
    Call<Response<String>> upload(@Part("uid") String id, @Part MultipartBody.Part part);

    @POST()
    @PUT
    @HEAD
    @DELETE
    Call<String> login();

}

package com.v.minio.client;

import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.v.minio.api.R;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author angry_beard
 * @date 2023年08月28日 17:12
 */
@RetrofitClient(baseUrl = "${test.baseUrl}")
public interface HttpApi {

    @GET("")
    R<String> html(@Query("id") Long id);
}

package com.v.minio.controller;

import com.v.minio.api.R;
import com.v.minio.client.HttpApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angry_beard
 * @date 2023年08月28日 17:18
 */
@RestController
@RequestMapping("minio")
@AllArgsConstructor
public class MinioController {

    private final HttpApi httpApi;

    @GetMapping("html")
    public R<String> hello(Long id) {
        return httpApi.html(id);
    }

}

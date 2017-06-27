package com.example.cxfrest.service;

/**
 * Created by liuhaiyang on 2017/5/27.
 *
 * 定义暴漏的接口
 */

import com.example.cxfrest.domain.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

public interface ProductService {


    @GET
    @Produces (MediaType.TEXT_PLAIN)
    @Path("/say/{name}")
    public String say(@PathParam("name")String name);

    @POST
    @Path("/add")
    @Produces (MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    String insert(String vo) ;


}
package com.example.cxfrest.service;

/**
 * Created by liuhaiyang on 2017/5/27.
 *
 * 定义暴漏的接口
 *
    consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
    produces:  指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
 */

import com.example.cxfrest.domain.Product;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

public interface ProductService {


    /**
     * get 通过url占位符传参
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/say/{name}")
    public String say(@PathParam("name") String name);

    /**
     * post 传json串
     */
    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    String insert(String vo);


    /**
     * post 也是穿json串
     * 客户端用post方法在body中传递的是product对象的json格式的字符串，自动将json格式的string转成product对象
     */
    @POST
    @Path("/pro")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    String pro(@RequestBody Product vo);


    /**
     * 客户端收到的是 product对象的json格式的string
     */
    @POST
    @Path("/pro1")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @ResponseBody
    Product pro1(@RequestBody Product vo);


    /**
     * 客户端在pathValue中传递map对象，这里接收的参数格式k1=v1&k2=v2   例：a=gaga&b=xxxx
     */
    @POST
    @Path("/pro2")
    @Produces(MediaType.APPLICATION_JSON)
    public String pro2(String a);




}
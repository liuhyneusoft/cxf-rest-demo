package com.example.cxfrest.service;

/**
 * Created by liuhaiyang on 2017/5/27.
 *
 * 定义暴漏的接口
 */

import com.example.cxfrest.domain.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

public interface ProductService {

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    String test();

    @POST
    @Path("/testPost")
    @Produces(MediaType.APPLICATION_JSON)
    String testPost();


    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> retrieveAllProducts();

    @GET
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product retrieveProductById(@PathParam("id") long id);

    @POST
    @Path("/products")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> retrieveProductsByName(@FormParam("name") String name);

    @POST
    @Path("/product")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Product createProduct(Product product);

    @PUT
    @Path("/product/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Product updateProductById(@PathParam("id") long id, Map<String, Object> fieldMap);

    @DELETE
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product deleteProductById(@PathParam("id") long id);
}
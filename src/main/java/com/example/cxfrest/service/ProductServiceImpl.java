package com.example.cxfrest.service;

import com.example.cxfrest.domain.Product;

import javax.ws.rs.FormParam;
import java.util.List;
import java.util.Map;

/**
 * Created by liuhaiyang on 2017/5/27.
 *
 * 实际提供服务类，暴漏的接口有 ProductService定义
 */
public class ProductServiceImpl implements ProductService {

    public String testPost(){
        return "post";
    }
    public String test(){
        return "ddddd";
    }

    @Override
    public List<Product> retrieveAllProducts() {
        System.err.println("retrieveAllProducts");
        return null;
    }

    @Override
    public Product retrieveProductById(long id) {
        System.err.println("retrieveProductById:"+id);
        return null;
    }

    @Override
    public List<Product> retrieveProductsByName(@FormParam("name") String name) {
        System.err.println("retrieveProductsByName:"+name);
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        System.err.println("createProduct:"+product);
        return null;
    }

    @Override
    public Product updateProductById(long id, Map<String, Object> fieldMap) {
        System.err.println("updateProductById:"+id);
        return null;
    }

    @Override
    public Product deleteProductById(long id) {
        System.err.println("deleteProductById:"+id);
        return null;
    }
}

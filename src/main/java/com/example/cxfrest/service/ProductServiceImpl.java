package com.example.cxfrest.service;

import com.example.cxfrest.domain.Product;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

/**
 * Created by liuhaiyang on 2017/5/27.
 *
 * 实际提供服务类，暴漏的接口有 ProductService定义
 */
public class ProductServiceImpl implements ProductService {

    @Override
    public String say(String name) {
        return name;
    }

    @Override
    public String insert(String vo) {
        return vo;
    }

}

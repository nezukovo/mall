package com.leean.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leean.entity.Product;

import java.util.List;


public interface IProductService extends IService<Product> {

    List<Product> findSwiper(IProductService iProductService);
    List<Product> findHot(IProductService iProductService);
    Product findDetail(IProductService iProductService, Integer id);

}

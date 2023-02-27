package com.leean.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leean.entity.Product;
import com.leean.mapper.ProductMapper;
import com.leean.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("productService")
public class IProductServiceImpl extends ServiceImpl<ProductMapper,Product> implements IProductService {


    @Override
    public List<Product> findSwiper(IProductService iProductService) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper();

        queryWrapper.eq("isSwiper",true);

        queryWrapper.orderByAsc("swiperSort");

        List<Product> list = iProductService.list(queryWrapper);
        return list;
    }

    @Override
    public List<Product> findHot(IProductService iProductService) {
        Page<Product> page = new Page<>(0, 8);

        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("isHot", true).orderByAsc("hotDateTime");
        Page<Product> pageProduct = iProductService.page(page, queryWrapper);

        List<Product> hotProductList = pageProduct.getRecords();

        return hotProductList;
    }
}

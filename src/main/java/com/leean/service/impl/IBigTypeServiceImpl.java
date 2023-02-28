package com.leean.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leean.entity.BigType;
import com.leean.entity.Product;
import com.leean.entity.SmallType;
import com.leean.mapper.BigTypeMapper;
import com.leean.service.IBigTypeService;
import com.leean.service.IProductService;
import com.leean.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBigTypeServiceImpl extends ServiceImpl<BigTypeMapper, BigType> implements IBigTypeService {

    @Autowired
    private ISmallTypeService iSmallTypeService;
    @Autowired
    private IProductService iProductService;

    @Override
    public List<BigType> findAll(IBigTypeService iBigTypeService) {
        List<BigType> list = iBigTypeService.list();
        return list;
    }

    @Override
    public List<BigType> findCategories(IBigTypeService iBigTypeService) {
        // 得到所有商品大类
        List<BigType> bigTypeList = iBigTypeService.list();


        // 第一次循环将商品小类中与大类关联的放到一起
        for (BigType bigType :bigTypeList) {
            QueryWrapper<SmallType> squeryWrapper = new QueryWrapper<>();
            // 得到商品小类列表
            List<SmallType> smallTypeList = iSmallTypeService.list(squeryWrapper.eq("bigTypeId", bigType.getId()));
            bigType.setSmallTypeList(smallTypeList);

            // 第二次循环将商品中与商品小类关联的放在一起
            for (SmallType smallType:smallTypeList) {
                List<Product> productList = iProductService.list(new QueryWrapper<Product>().eq("typeId", smallType.getId()));
                smallType.setProductList(productList);
            }

        }


        return bigTypeList;
    }



}

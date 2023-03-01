package com.leean.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leean.entity.Product;
import com.leean.entity.R;
import com.leean.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("findSwiper")
    public R findSwiper() {
        List<Product> list = iProductService.findSwiper(iProductService);
        Map<String,Object> map = new HashMap<>();
        map.put("message", list);
        return R.ok(map);
    }


    @GetMapping("findHot")
    public R findHot() {
        List<Product> list = iProductService.findHot(iProductService);
        Map<String,Object> map = new HashMap<>();
        map.put("hotProductList", list);
        return R.ok(map);

    }
    /**
     * 查找商品详情
     * **/
    @GetMapping("findDetail")
    public R findDetail(Integer id) {
        Product product = iProductService.findDetail(iProductService, id);
        Map<String,Object> map = new HashMap<>();
        map.put("product", product);
        return R.ok(map);

    }


}

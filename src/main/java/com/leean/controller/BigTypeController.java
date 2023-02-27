package com.leean.controller;


import com.leean.entity.BigType;
import com.leean.entity.R;
import com.leean.service.IBigTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bigType")
public class BigTypeController {


    @Autowired
    private IBigTypeService iBigTypeService;

    @GetMapping("findAll")
    private R findAll() {
        List<BigType> list = iBigTypeService.findAll(iBigTypeService);
        Map<String,Object> map = new HashMap<>();
        map.put("bigTypeList", list);
        return R.ok(map);
    }


    @GetMapping("findCategories")
    private R findCategories() {
        List<BigType> list = iBigTypeService.findCategories(iBigTypeService);
        Map<String,Object> map = new HashMap<>();
        map.put("categoriesList", list);
        return R.ok(map);
    }
}

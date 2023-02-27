package com.leean.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leean.entity.BigType;

import java.util.List;

public interface IBigTypeService extends IService<BigType> {

    List<BigType> findAll(IBigTypeService iBigTypeService);

    List<BigType> findCategories(IBigTypeService iBigTypeService);

}

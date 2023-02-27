package com.leean.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leean.entity.SmallType;

import java.util.List;

public interface ISmallTypeService extends IService<SmallType> {

    List<SmallType> findAll(ISmallTypeService iSmallTypeService);

}

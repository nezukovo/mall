package com.leean.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leean.entity.SmallType;
import com.leean.mapper.SmallTypeMapper;
import com.leean.service.ISmallTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISmallTypeServiceImpl extends ServiceImpl<SmallTypeMapper, SmallType> implements ISmallTypeService {


    @Override
    public List<SmallType> findAll(ISmallTypeService iSmallTypeService) {
        List<SmallType> list = iSmallTypeService.list();
        return list;
    }
}

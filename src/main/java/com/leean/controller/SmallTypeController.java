package com.leean.controller;


import com.leean.entity.SmallType;
import com.leean.entity.R;
import com.leean.service.ISmallTypeService;
import com.leean.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SmallType")
public class SmallTypeController {


    @Autowired
    private ISmallTypeService iSmallTypeService;


}

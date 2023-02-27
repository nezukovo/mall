package com.leean.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("t_bigtype")
@Data
public class BigType {

    private Integer id;

    private String name;

    private String remark;

    private String image = "default.jpg";

    @TableField(select = false)
    private List<SmallType> smallTypeList;  // 有的商品小类
}

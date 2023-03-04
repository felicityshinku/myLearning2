package com.example.learning.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName date_info
 */
@TableName(value ="date_info")
@Data
public class DateInfo implements Serializable {
    private Long id;

    private Long date;

    private Integer value;

    private static final long serialVersionUID = 1L;
}
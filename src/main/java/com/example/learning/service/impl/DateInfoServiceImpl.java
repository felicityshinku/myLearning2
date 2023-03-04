package com.example.learning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.learning.entity.DateInfo;
import com.example.learning.service.DateInfoService;
import com.example.learning.mapper.DateInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【date_info】的数据库操作Service实现
* @createDate 2023-03-04 21:58:49
*/
@Service
public class DateInfoServiceImpl extends ServiceImpl<DateInfoMapper, DateInfo>
    implements DateInfoService{

}





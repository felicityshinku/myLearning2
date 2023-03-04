package com.example.learning.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.learning.entity.UserInfo;
import com.example.learning.service.UserInfoService;
import com.example.learning.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2023-03-04 21:58:49
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}





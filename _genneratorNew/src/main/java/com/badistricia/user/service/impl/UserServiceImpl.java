package com.badistricia.user.service.impl;

import com.badistricia.user.model.entity.User;
import com.badistricia.user.mapper.UserMapper;
import com.badistricia.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author badistricia
 * @since 2022-07-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

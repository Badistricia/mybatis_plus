package com.badistricia.user.mapper;

import com.badistricia.user.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author badistricia
 * @since 2022-07-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

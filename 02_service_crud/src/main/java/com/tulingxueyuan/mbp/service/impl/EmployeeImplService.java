package com.tulingxueyuan.mbp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tulingxueyuan.mbp.mapper.EmployeeMapper;
import com.tulingxueyuan.mbp.pojo.Employee;
import com.tulingxueyuan.mbp.service.EmployeeService;
import org.springframework.stereotype.Service;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 *
 *  service实现类   继承mp提供通用的service基类
 *  ServiceImpl<EmployeeMapper, Employee>
 *      2个泛型 1.EmployeeMapper  Mapper接口
 *              2.Employee  对应Pojo
 */
@Service
public class EmployeeImplService extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}

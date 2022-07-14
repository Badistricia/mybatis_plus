package com.tulingxueyuan.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.AES;
import com.tulingxueyuan.mp.pojo.Employee;
import com.tulingxueyuan.mp.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    EmployeeService employeeService;

    @Test
    void test() {
        Employee employee = new Employee(16, "tuling", "123@qq.com", 1, 18);

        employeeService.saveOrUpdate(employee);

        System.out.println(employee);
    }

    @Test
    void logicDelete(){
        employeeService.removeById(9);
    }

    @Test
    void list(){

        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Employee::getLastName,"Tom");
        System.out.println(employeeService.list(queryWrapper));
    }


    @Test
    void testCAS(){

        // 线程1  age:50  version:1
        Employee employee1 = employeeService.getById(1);

        // 线程2 age:50  version:1
        Employee employee2 = employeeService.getById(1);

        employee1.setAge(100);

        employee2.setAge(80);

        //   update 100  version:2  where  version1 =数据库version1
        if(employeeService.updateById(employee1)){
            System.out.println("更新成功");
        }

        //    update 100  version:2 where version1 =数据库version2
        if(!employeeService.updateById(employee2)){
            System.out.println("更新失败，请重新刷新页面并更新");
        }

    }

}

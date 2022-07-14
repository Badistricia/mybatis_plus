package com.tulingxueyuan.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
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
    void eq() {
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        /*queryWrapper
                .select("last_name","age")
                .eq("last_name","Tom");*/
        queryWrapper.lambda()
                .select(Employee::getLastName,Employee::getLastName)
                .eq(Employee::getLastName,"xushu");

        System.out.println(employeeService.list(queryWrapper));
    }

    @Test
    void between() {

        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper
               .between("age",25,30)
                .or()
                .inSql("id","select 1 from dual");

        System.out.println(employeeService.list(queryWrapper));
    }

    @Test
    void updateWrapper(){
        UpdateWrapper<Employee> updateWrapper = new UpdateWrapper<>();
//        updateWrapper
//                //.set("last_name","xuhu")
//                .setSql("last_name='xushu'")
//                .eq("id",1);
        updateWrapper.lambda()
                .set(Employee::getLastName,"Tom")
                .eq(Employee::getId,1);

        employeeService.update(updateWrapper);
    }

}

package com.tulingxueyuan.mbp;

import com.tulingxueyuan.mbp.mapper.EmployeeMapper;
import com.tulingxueyuan.mbp.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class QuickStartApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void query() {
        System.out.println(employeeMapper.selectById(1));
    }

    @Test
    void add() {
        Employee xushu = new Employee(null, "xushu", "123@qq.com", 1, 18);
        employeeMapper.insert(xushu);

        // 插入后可以立即得到主键
        System.out.println(xushu);
    }

    @Test
    void update() {
        Employee xushu = new Employee(6, "tuling", "123@qq.com", 1, 18);
        employeeMapper.updateById(xushu);

        // 插入后可以立即得到主键
        System.out.println(xushu);
    }

    @Test
    void delete() {
        employeeMapper.deleteById(6);
    }

    @Test
    void list() {
        Map<String, Object> columnMap =new HashMap<>();
        columnMap.put("gender",0);
        List<Employee> employees = employeeMapper.selectByMap(columnMap);
        System.out.println(employees);
    }
}

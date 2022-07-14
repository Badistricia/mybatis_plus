package com.tulingxueyuan.mbp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mbp.mapper.EmployeeMapper;
import com.tulingxueyuan.mbp.pojo.Employee;
import com.tulingxueyuan.mbp.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class QuickStartApplicationTests {

    @Autowired
    EmployeeService service;

    @Autowired
    EmployeeMapper mapper;


    @Test
    public void query(){
        Employee employee = service.getById(1);
        System.out.println(employee);
    }

    @Test
    void saveOrUpdate(){
        // 会根据主键 先查询  如果存在就更新，不存在就插入
        Employee xushu = new Employee(8, "tuling", "123@qq.com", 1, 18);
        service.saveOrUpdate(xushu);
    }

    @Test
    void removeByIds(){
        List<Integer> ids= Arrays.asList(4,8);

        service.removeByIds(ids);
    }

    @Test
    void listByIds(){
        List<Integer> ids= Arrays.asList(1,3);

        service.listByIds(ids);
    }

    @Test
    void page(){
        // 分页信息
        IPage<Employee> iPage=new Page<>(1,2);

        IPage<Employee> page = service.page(iPage);

        List<Employee> records = page.getRecords();

        System.out.println(records);
        System.out.println(page.getPages());
    }

    @Test
    void xmlPage(){
        IPage<Employee> iPage=new Page<>(1,1);

        System.out.println(mapper.getByGender(iPage, 1).getRecords());
    }
}

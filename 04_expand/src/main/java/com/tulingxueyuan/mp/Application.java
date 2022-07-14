package com.tulingxueyuan.mp;

import com.tulingxueyuan.mp.service.EmployeeService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        Application.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // 测试数据安全保护下 部署上线能否正确连接数据库
        System.out.println(employeeService.getById(1));
    }

}

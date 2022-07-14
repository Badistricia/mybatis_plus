package com.tulingxueyuan;

import com.tulingxueyuan.pojo.User;
import org.junit.jupiter.api.Test;

class ApplicationTests {

    @Test
    void contextLoads() {
        User user1 = new User();
        user1.setId(1);
        user1.setName("a");

        User user2 = new User();
        user2.setId(1);
        user1.setName("b");

        System.out.println(user1.equals(user2));
    }

}

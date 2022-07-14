package com.tulingxueyuan.mp;

import com.baomidou.mybatisplus.core.toolkit.AES;
import org.junit.jupiter.api.Test;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class randomKeyTest {

    @Test
    void test(){

        String url = AES.encrypt("jdbc:mysql://localhost:3306/mybatisplus?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&" , "da12166c7db8a58f");
        String uname = AES.encrypt("root" , "da12166c7db8a58f");
        String pwd = AES.encrypt("123456" , "da12166c7db8a58f");

        System.out.println(url);
        System.out.println(uname);
        System.out.println(pwd);
    }
}

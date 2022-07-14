package com.tulingxueyuan.pojo;

import com.sun.istack.internal.NotNull;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode(exclude = "name")   // 加上这个注解会重写equals, 帮助去判断对象的值是否相等， 以前是判断对象的应用地址是否相等
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor  // 为必须的属性（final、@NonNull），生成构造函数
@Data
//@Value   它跟@Data的区别就是会为属性自动改为final
@Slf4j
public class User {
    private  Integer id;
    //@NonNull
    private String name;

    public void mylog(){
        log.error("测试");
    }
}

package com.tulingxueyuan.mp.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {

        // 插入时：创建时间和修改时间
        this.setFieldValByName("createDate",new Date(),metaObject);
        this.setFieldValByName("modifyDate",new Date(),metaObject);


    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("modifyDate",new Date(),metaObject);
    }
}

package com.tulingxueyuan.mbp.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */

//  mp 会默认将pojo类名当表名，如果类名和表名不一致可以使用注解
@TableName("tbl_employee")
public class Employee {
    // mp 会自动识别pojo类中名为id的属性，如果名字叫id就会当做是主键
    // 如果你的注解没有赋值那它会帮你使用ID_WORKER的生成策略， 主要是为了防止你忘记给主键赋值
    // 如果字段是自动增长需要手动改一下生成策略
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("last_name")
    private String lastName;
    private String email;
    private Integer gender;
    private Integer age;
    @TableField(exist = false)
    private String genderName;

    public String getGenderName() {
         if(gender==0){
             return "女";
         }
         else
         {
             return "男";
         }
    }


    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Employee(Integer id, String lastName, String email, Integer gender, Integer age) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + getGenderName()+", age="
                + age + "]";
    }


}

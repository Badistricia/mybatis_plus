package com.tulingxueyuan.mp.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

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
    //@TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("last_name")
    private String lastName;
    private String email;
    private Integer gender;
    private Integer age;
    @TableField(exist = false)
    private String genderName;

    // 1代表有效数据  0代表删除的数据
    // @TableLogic(value="1",delval="0")
    private Integer enabled;

    // 创建时间：希望在添加数据的时候填充：当前时间
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;
    // 修改时间：希望在添加数据、修改数据的时候填充：当前时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyDate;

    @Version
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }


    public String getGenderName() {
         if(gender==null || gender==0){
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

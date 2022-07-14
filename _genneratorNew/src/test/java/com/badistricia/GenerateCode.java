package com.badistricia;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/4 20:22:58
 */
public class GenerateCode {
    public static void main(String[] args) {
        //https://baomidou.com/pages/981406/
        String url = "jdbc:mysql://localhost:3306/mybatispdemo?characterEncoding=utf-8&&serverTimezone=UTC";
        String username = "root";
        String password = "1234567";
        String finalProjectPath = System.getProperty("user.dir")+"/_genneratorNew";
//        Scanner scanner = new Scanner(System.in);

        FastAutoGenerator.create(url,
                        username, password)
                .globalConfig((scanner,builder) -> {
                    builder.author(scanner.apply("请输入作者"))// 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir() //禁止打开输出目录
                            .commentDate("yyyy-MM-dd")//注释日期
                            .outputDir(finalProjectPath + "/src/main/java") // 指定输出目录
                            .fileOverride();//开启覆盖之前生成文件

                })
                .packageConfig((scanner,builder) -> {
                    builder.parent("com.badistricia") // 设置父包名
                            .moduleName("user") // 设置父包模块名
                            .entity("model.entity") //设置entity包名
                            .other("model.dto") // 设置dto包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, finalProjectPath + "/src/main/resources/mapper")); // 设置mapperXml生成路径

                })
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                            .controllerBuilder().enableRestStyle() //controller开启RestController风格
                            .enableHyphenStyle()    //开启驼峰命名
                            .entityBuilder().enableLombok()//开启lombok

                            .addTableFills(
                                    new Column("create_time", FieldFill.INSERT)
                            )
                            .mapperBuilder().enableMapperAnnotation().
                             build())
                /*
       模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
      .templateEngine(new BeetlTemplateEngine())
      .templateEngine(new FreemarkerTemplateEngine())
    */
                .execute();

    }
    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}

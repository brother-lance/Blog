package org.lw.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 项目名称：Blog
 * 类 名 称：applicaiton
 * 类 描 述：
 * 创建时间：2019-12-11 11:10
 * 创 建 人：Lance.WU
 */
@ImportResource(locations={"classpath:spring/*.xml"})
@MapperScan("org.lw.base.mapper")
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

package com.mitumao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.mitumao.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.mitumao", "org.n3r.idworker"})
public class BmsNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsNewApplication.class, args);
	}

}

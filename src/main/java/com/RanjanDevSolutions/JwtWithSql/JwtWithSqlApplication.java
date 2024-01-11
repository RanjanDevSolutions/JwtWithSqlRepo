package com.RanjanDevSolutions.JwtWithSql;

import com.RanjanDevSolutions.JwtWithSql.entity.UserInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class JwtWithSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtWithSqlApplication.class, args);
	}

}

package br.com.slamine.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class ApplicationConfiguration extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

	//Configuração de acesso ao DB
	/*@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
		dataSource.setUsername("root");
		dataSource.setPassword("padtec");
		return dataSource;
	}*/
}

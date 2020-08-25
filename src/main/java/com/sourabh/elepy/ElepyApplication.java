package com.sourabh.elepy;

import com.elepy.Elepy;
import com.elepy.admin.AdminPanel;
import com.elepy.hibernate.HibernateConfiguration;
import com.sourabh.elepy.model.Product;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElepyApplication {

	public static void main(String[] args) {

		//initializing Spring application
		SpringApplication.run(ElepyApplication.class, args);

		//initializing hibernate config
		Configuration  hibernateConfiguration = new Configuration().configure();
		hibernateConfiguration.configure("hibernate.cfg.xml");

		//initializing elepy
		new Elepy()
				.addConfiguration(AdminPanel.newAdminPanel())
				.addConfiguration(HibernateConfiguration.of(hibernateConfiguration))
				.onPort(7777)
				.addModel(Product.class)
				.start();
	}

}

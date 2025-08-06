package com.vn.fs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vn.fs.config.PrototypeBean;
import com.vn.fs.config.SingletonBean;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TodoAppApplication.class, args);

		// ConfigurableApplicationContext context2 = SpringApplication.run(TodoAppApplication.class, args);

		// Test singleton & prototype scope
		context.getBean(SingletonBean.class);
		context.getBean(PrototypeBean.class);

		// PrototypeBean prototypeBean = context2.getBean(PrototypeBean.class);

		// Dọn dẹp thủ công (gọi @PreDestroy)
		// context2.getBeanFactory().destroyBean(prototypeBean);

		// Đóng context để trigger @PreDestroy của singleton beans
		// context2.close();
	}

}

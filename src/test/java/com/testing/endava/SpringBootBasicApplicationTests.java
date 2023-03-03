package com.testing.endava;

import com.testing.endava.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootBasicApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootBasicApplication.class);
		var page = applicationContext.getBean(LoginPage.class);
		page.getPage();
	}

}

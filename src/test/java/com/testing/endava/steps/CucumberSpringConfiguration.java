package com.testing.endava.steps;

import com.testing.endava.SpringBootBasicApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootBasicApplication.class)
public class CucumberSpringConfiguration {
}

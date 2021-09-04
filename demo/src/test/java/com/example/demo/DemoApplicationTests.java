package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	@Value("${demo.test.name}")
	private String name;

	@Value("${demo.test.age}")
	private Integer age;

	@Test
	void loadProperty() {
		assertEquals("testName", name);
		assertEquals(16, age);
	}
}

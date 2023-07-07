package com.isil.springdatajpa;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Java6Assertions.assertThat;



class SpringdatajpaApplicationTests {

	Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
		int n1 = 20;
		int n2 = 30;
		int result = calculator.add(n1,n2);
		assertThat(result).isEqualTo(50);
	}


	class Calculator {
		int add (int a,int b) { return a+b;}
	}

}

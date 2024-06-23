package com.example.JuitTest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class JuitTestApplicationTests {

	private JuitTestApplication sut = Mockito.spy(new JuitTestApplication());

	@Test
	void contextLoads() {
//		Mockito.when(sut.main(any())).thenCallRealMethod();
	}

}

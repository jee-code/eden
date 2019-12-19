package com.example.myserviceunit;

import com.example.myserviceunit.service.AddService;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private AddService addService;

	@Test
	public void testAdd() {
		assertEquals(Integer.valueOf(6), addService.add(2, 4));
	}

	@Test
	void contextLoads() {
	}

}

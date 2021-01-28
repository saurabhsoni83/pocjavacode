package com.netlink.jwtpoc;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
class JwtpocApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;


	public void setUp(){
		//mockMvc= MockMvcBuilders.webAppContextSetup(context).apply(SpringSe)
	}


}

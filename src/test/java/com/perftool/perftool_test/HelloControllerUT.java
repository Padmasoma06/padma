package com.perftool.perftool_test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerUT {

	@LocalServerPort
	private int port;

	private URL localhost8081;

	@Autowired
	private TestRestTemplate template;

	@Before
	public void setUp() throws Exception {
		this.localhost8081 = new URL("http://localhost:" + 8081 + "/welcome");
	}

	@Test
	public void getHello() throws Exception {
		ResponseEntity<String> response = template.getForEntity(localhost8081.toString(), String.class);
		assertThat(response.getBody(), equalTo("welcome to my app-----"));
	}
}

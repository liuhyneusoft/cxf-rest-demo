package com.example.cxfrest;

import com.example.cxfrest.client.WSClient;
import com.example.cxfrest.domain.Product;
import com.example.cxfrest.domain.WSException;
import com.example.cxfrest.param.WSPostParamter;
import com.google.gson.Gson;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CxfRestApplicationTests {

	@Test
	public void testGet() throws IOException, WSException {
		WebClient webClient = WebClient.create("http://localhost:8182/ws/rest").path("/say/xxxxx");
		String str = webClient.accept(MediaType.TEXT_PLAIN).get(String.class);
		System.out.println(str);
	}

	@Test
	public void testPostProduct() throws IOException, WSException {
		WebClient webClient = WebClient.create("http://localhost:8182/ws/rest").path("/add");
		Product p = new Product();
		p.setName("aaaaaaaaa");
		Gson gson = new Gson();
		String str = webClient.accept(MediaType.TEXT_PLAIN).type(MediaType.TEXT_PLAIN).post(gson.toJson(p), String.class);
		System.out.println("*****************"+str);
	}
}

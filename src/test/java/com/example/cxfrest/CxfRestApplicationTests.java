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
import java.util.*;

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
	public void testGet1() throws IOException, WSException {
		WSClient webClient = new WSClient();
		List<String> pathParam =Arrays.asList("aa","bb");
		String str = webClient.get("http://localhost:8182/ws/rest","/get1",pathParam);
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


	/**
	 * 把参数product对象转成json串，然后再body中传递
	 */
	@Test
	public void testPost() throws IOException, WSException {
		Product p = new Product("aaaaaaaaa");
		Gson gson = new Gson();
		WSClient webClient = new WSClient();
		WSPostParamter postParamter = new WSPostParamter();
		postParamter.setBodyParam(gson.toJson(p)); //body中是json格式的字符串
		String str = webClient.post("http://localhost:8182/ws/rest", "/pro",postParamter);
		System.out.println("*****************"+str);
	}

	@Test
	public void testPost1() throws IOException, WSException {
		Product p = new Product("bbbbbbb");
		Gson gson = new Gson();
		WSClient webClient = new WSClient();
		WSPostParamter postParamter = new WSPostParamter();
		postParamter.setBodyParam(gson.toJson(p)); //body中是json格式的字符串
		String str = webClient.post("http://localhost:8182/ws/rest", "/pro1",postParamter);
		System.out.println("!!!!!!!!!!!!!"+str);
	}


	/**
	 * public String form(String hostUrl, String functionPath, List<String> pathValues,
	 Map<String, String> formParam)
	 */
	@Test
	public void testPost2() throws IOException, WSException {
		WSClient webClient = new WSClient();
		Map<String,String> map = new HashMap<>();
		map.put("a","gaga");
		map.put("b","xxxx");
		String str = webClient.form("http://localhost:8182/ws/rest", "/pro2",null,map);
		System.out.println("pro2------"+str);
	}

	/**
	 * 特殊情况，使用form传递map参数，
	 *
	 * 如果服务端是 springMVC，那么会自动从map中根据key匹配参数，
	   @RequestMapping(value = "/get11", method = RequestMethod.POST, produces = "application/json")
		public String getPPLine(@RequestParam(value = "empID", required = false)String empID, @RequestParam(value = "xxxx", required = false) String xxxx){
		return "";
		}
	 如果服务端是cxf的话，
		 @POST
		 @Path("/getPPLine")
		 @Produces(MediaType.APPLICATION_JSON)
		 public String getPPLine(String empID);
	 只有第一个参数有值 格式是a=gaga&b=xxxx
	 */
	@Test
	public void testPost3() throws IOException, WSException {
		Map<String, String> formParam = new HashMap<String, String>();
		formParam.put("empID", "aaaa");
		formParam.put("xxxx", "bbbbbb");
		WSClient wsClient = new WSClient();
		String wsResult = wsClient.form("", "http://localhost:8188/", "/get11", null, formParam);
		System.out.println(wsResult);
	}

}

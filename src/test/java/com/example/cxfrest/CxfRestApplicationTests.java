package com.example.cxfrest;

import com.example.cxfrest.client.WSClient;
import com.example.cxfrest.domain.WSException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CxfRestApplicationTests {

	@Test
	public void testGet() throws IOException, WSException {
		WSClient wc = new WSClient();
		String str = wc.get("http://localhost:8182/ws/rest","/test",new ArrayList<String>());
		System.out.println(str);
	}

	@Test
	public void testPost() throws IOException, WSException {
		WSClient wc = new WSClient();
		String str = wc.post("http://localhost:8182/ws/rest","/testPost",new ArrayList<String>());
		System.out.println(str);
	}

}

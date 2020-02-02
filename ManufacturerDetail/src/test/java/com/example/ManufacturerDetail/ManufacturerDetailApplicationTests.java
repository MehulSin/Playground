package com.example.ManufacturerDetail;

import com.example.ManufacturerDetail.HomeController.HomeController;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManufacturerDetailApplicationTests {

	@Autowired
	HomeController homeController;

	@Test
	void contextLoads() throws JSONException {


	}


	@Test
	void testMsg() throws JSONException {
		//homeController.getMsg("ford","JSON");
	}




}

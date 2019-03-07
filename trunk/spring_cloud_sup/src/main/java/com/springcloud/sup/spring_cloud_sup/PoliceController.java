package com.springcloud.sup.spring_cloud_sup;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoliceController {


	// 能否访问数据库的标识
	public static boolean canVisitDb = true;
	
	@RequestMapping(value = "/db/{can}", method = RequestMethod.GET)
	public void setDb(@PathVariable boolean can) {
		canVisitDb = can;
	}
}

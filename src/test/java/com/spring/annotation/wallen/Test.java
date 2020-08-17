package com.spring.annotation.wallen;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app*.xml"})
public class Test {

	@org.junit.Test
	public void test() {
		Map<String, Object> map = new HashMap<>(3);

		//时间
		map.put("loadDateStr", "2019-05-01 10:00");
		//出发点
		map.put("startAreaID", "320602");
		//目的地
		map.put("endBSelect", "320202");
		try {
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

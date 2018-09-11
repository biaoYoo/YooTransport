package com.yoo.capacity.controller;

import com.yoo.capacity.service.SendSMS;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yub
 * @describe talk something
 * @date 2018/9/8 000814:45
 */
@RestController
public class TestController {

	int i = 0;

	@GetMapping("/getInfo")
	public Object getInfo() {
		sendMsg();
		return "hello world";
	}

	@Scheduled(cron = "59 30 9,14,21 * * *")
	public void sendMsg(){
		SendSMS.getStatusVal(
				SendSMS.sendNoticeSms("13066140310", "服务提醒", "云济健康提醒您：你需要扫描二维码了！"));
	}

}

package com.yoo.capacity.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yub
 * @describe talk something
 * @date 2018/10/12 001214:35
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

	@RabbitHandler
	public void process(String hello) {
		System.out.println("Receiver:" +hello);
	}
}

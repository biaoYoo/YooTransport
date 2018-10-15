package com.yoo.capacity.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yub
 * @describe talk something
 * @date 2018/10/12 001214:33
 */
@Component
public class Sender {

	@Autowired
	private AmqpTemplate amqpTemplate;

	public void send(){
		System.err.println("new Time");
		amqpTemplate.convertAndSend("hello",new Date()+"-new Time");
	}
}

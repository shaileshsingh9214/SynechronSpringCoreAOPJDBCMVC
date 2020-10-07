package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class MyConsumer {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		
		Performer p1=(Performer)springContainer.getBean("Avinash");
		p1.perform();
		System.out.println("================================================");
		Performer p2=(Performer)springContainer.getBean("Nilay");
		p2.perform();
		System.out.println("================================================");
		Performer p3=(Performer)springContainer.getBean("Parag");
		p3.perform();

	}

}

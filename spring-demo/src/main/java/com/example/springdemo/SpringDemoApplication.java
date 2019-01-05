package com.example.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springdemo.library.cards.ICard;
import com.example.springdemo.library.cards.SingleValueCard;
import com.example.springdemo.library.enums.SuitType;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		
		context.getBean(GameManager.class).start();
		
		
		ArrayList<ICard> arrayList = new ArrayList<>();
		arrayList.add(new SingleValueCard(1, SuitType.Club));
		arrayList.add(new SingleValueCard(2, SuitType.Diamond));
		List<ICard> list = arrayList;
		
	}

}


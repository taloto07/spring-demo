package com.example.springdemo.library.configurations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springdemo.library.cards.ICard;
import com.example.springdemo.library.cards.SingleValueCard;
import com.example.springdemo.library.cards.TwoValueCard;
import com.example.springdemo.library.decks.OusYetDeck;
import com.example.springdemo.library.decks.TienLenDeck;
import com.example.springdemo.library.enums.SuitType;

@Configuration

public class CollectionConfig {
	
	@Bean
	public TienLenDeck getTienLenDeck() {
		List<ICard> cards = new ArrayList<>();
		for (int i = 1; i <= 13; i++) {
			for (SuitType type: SuitType.values()) {
				cards.add(new SingleValueCard(i, type));
			}
		}
		
		System.out.print("in CollectionConfig in getTienLenDeck");
		
		return new TienLenDeck(cards);
	}
	
	@Bean
	public OusYetDeck getOusYetDeck() {
		List<ICard> cards = new ArrayList<>();
		for (int i = 1; i <= 13; i++) {
			for (SuitType type: SuitType.values()) {
				if (i == 1) 
					cards.add(new TwoValueCard(i, 11, type));
				else 
					cards.add(new SingleValueCard(i, type));
			}
		}
		
		System.out.print("in CollectionConfig in getTienLenDeck");
		
		return new OusYetDeck(cards);
	}
}

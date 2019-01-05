package com.example.springdemo.library.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springdemo.library.decks.IDeck;

@Component("TienLenGame")
public class TienLenGame extends BaseGame{
	
	public TienLenGame(@Qualifier("getTienLenDeck") IDeck deck) {
		super(deck);
	}

	

}

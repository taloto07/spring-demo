package com.example.springdemo.library.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.example.springdemo.library.decks.IDeck;

@Component("OusYetGameGame")
public class OusYetGame extends BaseGame {

	public OusYetGame(@Qualifier("getOusYetDeck") IDeck deck) {
		super(deck);
	}

}

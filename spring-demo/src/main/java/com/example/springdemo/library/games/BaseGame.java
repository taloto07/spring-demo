package com.example.springdemo.library.games;

import com.example.springdemo.library.decks.IDeck;

public abstract class BaseGame implements IGame {
	private IDeck _deck;
	
	public BaseGame(IDeck deck) {
		_deck = deck;
	}
	
	@Override
	public void play() {
		this._deck.display();
		this._deck.shuffle();
		this._deck.display();
	}

	@Override
	public void start() {
		
	}

	@Override
	public void end() {
		
	}
}

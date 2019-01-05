package com.example.springdemo.library.decks;

import java.util.List;

import com.example.springdemo.library.cards.ICard;

public interface IDeck {
	public void loadCards(List<ICard> cards);
	public void shuffle();
	public ICard deal();
	public void display();
}

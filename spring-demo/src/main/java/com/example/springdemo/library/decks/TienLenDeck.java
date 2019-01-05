package com.example.springdemo.library.decks;

import java.util.List;

import com.example.springdemo.library.cards.ICard;

public class TienLenDeck extends BaseDeck{

	
	public TienLenDeck(List<ICard> cards) {
		super(cards);
	}

	@Override
	public void display() {
		for (ICard card: this._cards) {
			System.out.print(card.getValue() + "" + card.getSuitType() + " ");
		}
		System.out.println();
	}
}

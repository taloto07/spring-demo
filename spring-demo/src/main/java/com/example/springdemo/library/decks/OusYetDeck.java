package com.example.springdemo.library.decks;

import java.util.List;

import com.example.springdemo.library.cards.ICard;

public class OusYetDeck extends BaseDeck{

	public OusYetDeck(List<ICard> cards) {
		super(cards);
	}

	@Override
	public void display() {
		for (ICard card: this._cards) {
			List<Integer> values = card.getValues();
			String value;
			if (values.size() == 1) {
				value = "" + values.get(0);
			} else {
				value = "" + values.get(0) + "/" + values.get(1);
			}
			System.out.print(value + "" + card.getSuitType() + " ");
		}
		System.out.println();
	}

}

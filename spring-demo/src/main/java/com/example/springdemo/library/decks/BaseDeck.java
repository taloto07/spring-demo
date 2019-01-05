package com.example.springdemo.library.decks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.example.springdemo.library.cards.ICard;

public abstract class BaseDeck implements IDeck {
	protected List<ICard> _cards;
	protected int _position = 0;
	
	public BaseDeck(List<ICard> cards) {
		_cards = cards;
	}
	
	@Override
	public void shuffle() {
		int max = this._cards.size();
		for (int i = 0; i < max - 1; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(i + 1, max);
			ICard temp = _cards.get(randomNum);
			_cards.set(randomNum, _cards.get(i));
			_cards.set(i, temp);
		}
	}
	
	@Override
	public void loadCards(List<ICard> cards) {
		_cards = new ArrayList<ICard>(cards);
	}
	
	@Override
	public ICard deal() {
		if (_position == _cards.size())
			return null;
		return _cards.get(_position++);
	}
}

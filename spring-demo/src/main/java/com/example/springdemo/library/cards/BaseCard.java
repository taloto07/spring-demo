package com.example.springdemo.library.cards;

import com.example.springdemo.library.enums.SuitType;

public abstract class BaseCard implements ICard{
	protected int _value;
	protected SuitType _suit;
	
	public BaseCard(int value, SuitType type) {
		_value = value;
		_suit = type;
	}
	
	@Override
	public int getValue() {
		return _value;
	}
	
	public SuitType getSuitType() {
		return _suit;
	}

}

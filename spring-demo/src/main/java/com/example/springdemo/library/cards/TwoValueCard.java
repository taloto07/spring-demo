package com.example.springdemo.library.cards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springdemo.library.enums.SuitType;

@Component("TwoValueCard")
public class TwoValueCard extends BaseCard implements ISecondValueCard{
	protected int _secondValue;
	
	public TwoValueCard(
			@Value("${app.twovaluecard.value}") int value, 
			@Value("${app.twovaluecard.value}") int secondValue, 
			@Value("${app.twovaluecard.suit}") SuitType type
			) 
	{
		super(value, type);
		_secondValue = secondValue;
	}
	
	@Autowired
	public TwoValueCard(
			@Value("${app.twovaluecard.value}") int value, 
			@Value("${app.twovaluecard.suit}") SuitType type
			) 
	{
		this(value, -1, type);
	}

	@Override
	public int getSecondValue() {
		return _secondValue;
	}

	@Override
	public List<Integer> getValues() {
		List<Integer> values = new ArrayList<>();
		values.add(_value);
		
		if (_secondValue != -1)
			values.add(_secondValue);
		
		return values;
	}
}

package com.example.springdemo.library.cards;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import com.example.springdemo.library.enums.SuitType;

public class SingleValueCard extends BaseCard{
	
	public SingleValueCard(
			@Value("${app.singlevaluecard.value}") int value, 
			@Value("${app.singlevaluecard.suit}") SuitType type
			) 
	{
		super(value, type);
	}

	@Override
	public List<Integer> getValues() {
		return Arrays.asList(this.getValue());
	}
}

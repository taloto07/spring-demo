package com.example.springdemo.library.cards;

import java.util.List;

import com.example.springdemo.library.enums.SuitType;

public interface ICard {
	public int getValue();
	public SuitType getSuitType();
	public List<Integer> getValues();
}

package com.example.springdemo.library;

import org.springframework.stereotype.Component;

@Component("NormalWriter")
public class NormalWriter implements IWriter{

	@Override
	public String write(String content) {
		return content;
	}

}

package com.example.springdemo.library;

import org.springframework.stereotype.Component;

@Component("PrettyWriter")
public class PrettyWriter implements IWriter {

	@Override
	public String write(String content) {
		return "*** " + content + " ***";
	}

}

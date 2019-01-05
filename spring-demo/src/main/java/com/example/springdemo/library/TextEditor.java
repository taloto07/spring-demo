package com.example.springdemo.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	@Autowired
	@Qualifier(value = "PrettyWriter")
	private IWriter writer;
	private String content;
	
	public String write() {
		return writer.write(this.content);
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

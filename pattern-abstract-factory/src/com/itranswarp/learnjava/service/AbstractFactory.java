package com.itranswarp.learnjava.service;

public interface AbstractFactory {

	HtmlDocument createHtml(String md);

	WordDocument createWord(String md);

}

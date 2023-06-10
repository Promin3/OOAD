package com.itranswarp.learnjava.goodfactory;

import com.itranswarp.learnjava.service.AbstractFactory;
import com.itranswarp.learnjava.service.HtmlDocument;
import com.itranswarp.learnjava.service.WordDocument;

public class GoodFactory implements AbstractFactory {

	@Override
	public HtmlDocument createHtml(String md) {
		return new GoodHtmlDocument(md);
	}

	@Override
	public WordDocument createWord(String md) {
		return new GoodWordDocument(md);
	}
}

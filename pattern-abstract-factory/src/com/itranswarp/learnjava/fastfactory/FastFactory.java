package com.itranswarp.learnjava.fastfactory;

import com.itranswarp.learnjava.service.AbstractFactory;
import com.itranswarp.learnjava.service.HtmlDocument;
import com.itranswarp.learnjava.service.WordDocument;

public class FastFactory implements AbstractFactory {

	@Override
	public HtmlDocument createHtml(String md) {
		return new FastHtmlDocument(md);
	}

	@Override
	public WordDocument createWord(String md) {
		return new FastWordDocument(md);
	}
}

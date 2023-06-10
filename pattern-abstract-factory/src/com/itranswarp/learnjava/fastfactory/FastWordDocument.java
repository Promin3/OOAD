package com.itranswarp.learnjava.fastfactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.itranswarp.learnjava.service.WordDocument;

public class FastWordDocument implements WordDocument {

	private String md;

	public FastWordDocument(String md) {
		this.md = md;
	}

	@Override
	public void save(Path path) throws IOException {
		String doc = "{\\rtf1\\ansi\n{\\fonttbl\\f0\\fswiss\\fcharset0 Helvetica-Bold;\\f1\\fswiss\\fcharset0 Helvetica;}\n";
		String body = md.lines().map(s -> {
			if (s.startsWith("#")) {
				return String.format("\\f0\\b\\fs24 \\cf0%s\\par\n", s.substring(1));
			}
			return String.format("\\f1\\b0%s\\par\n", s);
		}).reduce("", (acc, s) -> acc + s);
		String content = doc + body + "}";
		Files.write(path, content.getBytes("UTF-8"));
	}
}

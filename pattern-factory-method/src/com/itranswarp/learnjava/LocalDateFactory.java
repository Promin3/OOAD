package com.itranswarp.learnjava;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LocalDateFactory {

	private static Map<Integer, LocalDate> cache = new HashMap<>();

	public static LocalDate fromInt(int yyyyMMdd) {
		if (yyyyMMdd >= 20200101 && yyyyMMdd <= 20301231) {
			LocalDate result = cache.get(yyyyMMdd);
			if (result == null) {
				result = create(yyyyMMdd);
				cache.put(yyyyMMdd, result);
			}
			return result;
		}
		return create(yyyyMMdd);
	}

	private static LocalDate create(int yyyyMMdd) {
		return LocalDate.of(yyyyMMdd / 10000, yyyyMMdd / 100 % 100, yyyyMMdd % 100);
	}
}

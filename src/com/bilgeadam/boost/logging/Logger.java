package com.bilgeadam.boost.logging;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Logger {
	private static Logger instance;
	private org.apache.logging.log4j.Logger logger;  // full qualified class name
	public static Logger getInstance() {
		if (Logger.instance == null) {
			Logger.instance = new Logger();
		}
		return Logger.instance;
	}
	
	
}

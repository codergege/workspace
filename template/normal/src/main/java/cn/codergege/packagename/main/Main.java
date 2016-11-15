package cn.codergege.packagename.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(Main.class);
		log.info("Hello, world!");
		log.debug("Hello, debug!");
		try {
			int i = 1/0;
		} catch(Exception e) {
			log.error(e.getMessage());
		}
	}
}

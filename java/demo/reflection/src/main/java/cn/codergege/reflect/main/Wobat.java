package cn.codergege.reflect.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wobat {
	final Logger log = LoggerFactory.getLogger(Wobat.class);
	private String name = "wobat";

	public void sayHello() {
		log.info("Hello, wobat");
	}

}

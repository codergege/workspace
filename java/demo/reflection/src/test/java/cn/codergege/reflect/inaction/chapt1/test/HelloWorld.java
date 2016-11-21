package cn.codergege.reflect.inaction.chapt1.test;

import org.junit.Test;

public class HelloWorld {
	@Test
	public void printName() {
		System.out.println(this.getClass().getName());
	}
}



package cn.codergege.reflect.inaction.chapt1.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Container {
	final Logger log = LoggerFactory.getLogger(Container.class);

	@Test
	public void print() {
		HelloWorld x = new HelloWorld();
		x.printName();
	}
	
	@Test
	public void setColor() {
		HeaderFrame header = new HeaderFrame();
		FooterFrame footer = new FooterFrame();
		log.info("before set:");
		header.showColor();
		footer.showColor();
		Setter.setObjectColor(header, "red");
		Setter.setObjectColor(footer, "blue");
		log.info("after set:");
		header.showColor();
		footer.showColor();

	}
	
	@Test
	public void addTest() {
		HeaderFrame header = new HeaderFrame();
		Class cls = HeaderFrame.class;
		try {
			Method method = cls.getMethod("add", int.class, int.class);
			int result = ((Integer)method.invoke(header, 2, 5)).intValue();
			log.info(result + "");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
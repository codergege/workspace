package cn.codergege.reflect.inaction.chapt1.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.codergege.util.reflection.ReflectionUtil;

public class Setter {
	final static Logger log = LoggerFactory.getLogger(Setter.class);

	public static void setObjectColor(Object obj, String color) {
		Class cls = obj.getClass();

		try {
//			Method method = cls.getMethod("setColor", String.class);
			Method method = ReflectionUtil.getSupportedMethod(cls, "setColor", new Class[] { String.class });
			method.invoke(obj, color);
		} catch (NoSuchMethodException e) {
			log.debug(e.getLocalizedMessage());
			e.printStackTrace();
		} catch (SecurityException e) {
			log.debug(e.getLocalizedMessage());
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			log.debug(e.getLocalizedMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			log.debug(e.getLocalizedMessage());
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			log.debug(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}

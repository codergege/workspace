package cn.codergege.util.reflection;

import java.lang.reflect.Method;

public class ReflectionUtil {
	/**
	 * 支持继承的非 public 方法
	 * @param cls 目标类对象
	 * @param name 方法名称
	 * @param paramTypes 方法参数类型数组
	 * @return
	 * @throws NoSuchMethodException
	 */
	public static Method getSupportedMethod(Class cls, String name, Class... paramTypes) throws NoSuchMethodException {
		if (cls == null) {
			throw new NoSuchMethodException();
		}
		try {
			return cls.getDeclaredMethod(name, paramTypes);
		} catch (NoSuchMethodException ex) {
			return getSupportedMethod(cls.getSuperclass(), name, paramTypes);
		}
	}
}

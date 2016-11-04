package cn.codergege.demo;

import java.util.ArrayList;
import java.util.List;

public class NewFeaturesTester {
	final static String HELLO = "Hello, ";
	interface MathOper {
		int operation(int a, int b);
	}

	interface GreetingService {
		void greeting(String message);
	}

	private int operate(int a, int b, MathOper mathOper) {
		return mathOper.operation(a, b);
	}

	public static void main(String[] args) {
		NewFeaturesTester tester = new NewFeaturesTester();
		
		// 带有类型声明的 lambda
		MathOper addition = (int a, int b) -> a + b;

		// 不带类型声明的 lambda
		MathOper subtraction = (a, b) -> a - b;

		// 带 return 的 lambda
		MathOper multiplication = (a, b) -> { return a * b; };

		// 输出结果
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
		
		// 没有()的 lambda
		GreetingService greetingService = message -> System.out.println(message);

		// 调用函数式接口的方法
		greetingService.greeting("Hello, codergege");
		
		GreetingService greetingService2 = message -> System.out.println(HELLO + message);

		greetingService2.greeting("赵波");

		// 方法引用的例子
		List<String> names = new ArrayList<String>();
		names.add("Peter");
		names.add("赵波");
		names.add("djh");
		names.add("Jack");
		//对象的引用
		//names.forEach(System.out::println);
		//下面是错误的用法
		//names.forEach(System.out.println);
		//如果用 lambda, 可以经过一些处理
		PrintMember<String> printMember = member -> System.out.println(" --> " + member);
		names.forEach(printMember::print);

	}

		interface PrintMember<T> {
			void print(T member);
		}

}

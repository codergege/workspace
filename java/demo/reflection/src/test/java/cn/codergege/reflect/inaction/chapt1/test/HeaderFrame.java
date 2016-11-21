package cn.codergege.reflect.inaction.chapt1.test;

public class HeaderFrame {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println(this.getClass().getSimpleName() + ": " + color);
	}
	
	public int add(int x, int y) {
		return x + y;
	}
}

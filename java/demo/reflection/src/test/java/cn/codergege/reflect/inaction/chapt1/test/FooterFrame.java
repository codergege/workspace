package cn.codergege.reflect.inaction.chapt1.test;

public class FooterFrame {
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
	
}

package designpatterns.creations.prototype;


public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Retangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Retangle::draw() method.");
	}

}

package designpatterns.creations.prototype;

public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("0");
		System.out.println("Shape: " + clonedShape.getType());
		
		
		clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape.getType());

		
		clonedShape = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape.getType());
		
		clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape.getType());
		
	}

}

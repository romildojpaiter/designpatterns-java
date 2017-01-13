package designpatterns.creations.prototype;

import java.util.Hashtable;

public class ShapeCache {
	
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("" + shapeMap.size());
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("" + shapeMap.size());
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("" + shapeMap.size());
		shapeMap.put(rectangle.getId(), rectangle);
	}

}

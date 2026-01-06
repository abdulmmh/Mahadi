
package Abstract;


public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoObejct1 = new Circle(5);
        GeometricObject geoObejct2 = new Rectangle(5, 3);
        
        System.out.println("The two objects have the same area? " + equalArea(geoObejct1, geoObejct2));
        
        displayGeometricObject(geoObejct1);
        displayGeometricObject(geoObejct2);
    }
    
    
    public static boolean  equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }
    
    public static  void  displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is  " + object.getPerimeter());
    }
    
}

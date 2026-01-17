package Jan16And17.monthlyevidencepractice.OOPProblems.question05;


 class Shape {
    void draw(){
        System.out.println("Draw a shape.");
    }
}

class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws RadiusIsNegative{
        if (radius <= 0) {
            throw new RadiusIsNegative("Radius should be greater than 0");
        } else {
            this.radius = radius;            
        }
    }
    
    @Override
    void draw() {
        System.out.println("Draw a circle with " + radius + " radius"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class RadiusIsNegative extends Exception{

    public RadiusIsNegative(String message) {
        super(message);
    }
}

class Main{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        
        Circle c = new Circle();
        
        
        try {
            c.setRadius(4.53);
            c.draw();
            
            c.setRadius(-2.43);
            c.draw();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
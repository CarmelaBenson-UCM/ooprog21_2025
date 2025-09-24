public class DebugCircle {
  
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;
    
    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public int getDiameter() {
        return diameter;
    }
    
    public double getArea() {
        return area;
    }
        
    public static void main(String[] args) {
        DebugCircle c1 = new DebugCircle(5); 
        System.out.println("Radius: " + c1.getRadius() +
                           "\nDiameter: " + c1.getDiameter() +
                           "\nArea: " + c1.getArea());
    }
}

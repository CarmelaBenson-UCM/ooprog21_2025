public class DebugCircle {
    private int radius;
    private int diameter;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return Math.PI * radius * radius; 
    }
    
    public static void main(String[] args) {
        DebugCircle c1 = new DebugCircle(5);
        System.out.println("Radius: " + c1.getRadius() +
                           "\nDiameter: " + c1.getDiameter() +
                           "\nArea: " + c1.getArea());
    }
}

public class Polygon3Sides implements Shape {
    private String color;
    private double sides;
    private double sideLength;
    private double apothem;
    public Polygon3Sides (double theSideLength, String theColor) {
        this.sides = 3;
        this.color = theColor;
        this.sideLength = theSideLength;
    }
    
    public double getArea() {
        double angle = Math.toRadians(60);
        apothem = (sideLength / 2) * Math.tan(angle);
        return 0.5 * sideLength * apothem;
    }
    
    public double getPerimeter() {
        return sideLength * sides;
    }
    
    public String getColor() {
        return this.color;
    }
}
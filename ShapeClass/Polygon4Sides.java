public class Polygon4Sides implements Shape {
    private String color;
    private double sides;
    private double sideLength;
    public Polygon4Sides (double theSideLength, String theColor) {
        this.sides = 4;
        this.color = theColor;
        this.sideLength = theSideLength;
    }
    
    public double getArea() {
        return sideLength * sideLength;
    }
    
    public double getPerimeter() {
        return sideLength * sides;
    }
    
    public String getColor() {
        return this.color;
    }
}
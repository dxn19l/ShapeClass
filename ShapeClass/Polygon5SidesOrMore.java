public class Polygon5SidesOrMore implements Shape {
    private String color;
    private double sides;
    private double apothem;
    private double sideLength;
    private double angle;
    public Polygon5SidesOrMore (double theSideLength, String theColor, int numberOfSides ) {
        this.sides = numberOfSides;
        this.color = theColor;
        this.sideLength = theSideLength;
        this.angle = Math.toRadians(180 - (((360 / sides) / 2) + 90));
        this.apothem = (sideLength / 2) * Math.tan(angle);
    }
    
    public double getArea() {
        return 0.5 * sideLength * apothem * sides;
    }
    
    public double getPerimeter() {
        return sideLength * sides;
    }
    
    public String getColor() {
        return this.color;
    }
}
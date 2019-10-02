public class Circle {
    private double radius = 1.0;
    private String color = "Pink";
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(){
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", Area = "
                + getArea()
                + ", color is : "
                + getColor();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.0);
        System.out.println(circle);

        circle = new Circle(5.0, "Red");
        System.out.println(circle);
    }
}

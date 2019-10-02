public class Cylinder extends Circle{
    private double height = 5.0;
    public Cylinder(){}
    public Cylinder(double height, double radius2){
        super(radius2);
        this.height = height;
    }
    public Cylinder(double height, double radius2, String color){
        super(radius2, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }

    public double getRadius2(){
        return getRadius();
    }
    public void setRadius2(double radius){
        setRadius(radius);
    }
    public double getVolume(){
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = "
                + getRadius2()
                + ", height = "
                + getHeight()
                + ", Volume = "
                + getVolume()
                + ", Which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(6.0, 2.8);
        System.out.println(cylinder);

        cylinder = new Cylinder(7.0, 3.0, "yellow");
        System.out.println(cylinder);
    }
}

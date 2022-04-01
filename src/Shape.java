public class Shape
{
    private String name;

    public Shape(String shapeName){
        this.name = shapeName;
    }
    public Shape(){}

    public String getShapeName(){
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }


}


class Circle extends Shape {
    
private int length;
private int area;


public Circle(){
    length = 1;
    area = 1;
}

}

class Cylinder extends Circle{
    public Cylinder(String shapeName){
        super();
    }
}

class Sphere extends Circle{
}

class Cone extends Circle{



public static void main(String[] args, String name){
    Circle c = new Circle();
    Cylinder c2 = new Cylinder(name);
    Sphere s = new Sphere();
    Cone c3 = new Cone();

    System.out.println("Is a circle a shape?");
    System.out.println(c instanceof Circle);
    System.out.println("Is a cylinder a cicle?");
    System.out.println(c2.getShapeName());
    System.out.println(c2 instanceof Cylinder);
    System.out.println("Is a sphere a circle?");
    System.out.println(s instanceof Sphere);
    System.out.println("Is a cone a circle?");
    System.out.println(c3 instanceof Cone);


    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(3);
        Cylinder cylinder = new Cylinder(4, 5);
        Cone cone = new Cone(2, 3);
        ArrayList<Shape> shapeArray = new ArrayList<>();
        shapeArray.add(sphere);
        shapeArray.add(cylinder);
        shapeArray.add(cone);
        for (int i = 0; i < shapeArray.size(); i++) {
            System.out.println("Shape " + (i + 1) + ":\n" + shapeArray.get(i).toString());
        }
    }
}
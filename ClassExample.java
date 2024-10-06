public class ClassExample {
    public static void main(String[] args) {
        Area vl = new Area(); // declaring area as an object
        // vl.height = 5;
        // vl.length = 6;
        // vl.width = 7;
        double v = vl.Volume();
        System.out.println(v);
    }
}

class Area {
    public double height, length, width; // member variable
    Area(){ // making a constructor
        height = 5;
        width= 7;
        length = 6;
    }
    double Volume(){ // member method
        return height*length*width;
    }
}

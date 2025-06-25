class Circles {
    double radius;

    //Default Constructor
    Circles(){
        radius = 0.0;
    }

    // Parameterized Constructor
    Circles(double radius) {
        this.radius = radius;
    }

    //Method too display circle radius
    void showRadius() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args){
        // Creating an object using default constructor
        Circles c1 = new Circles();
        c1.showRadius();
        // Creating an object using paramerized constructor
        Circles c2 = new Circles(5.0);
        c2.showRadius();
    }
}
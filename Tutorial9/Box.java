package Tutorial9;

class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box(Box ob) {
        // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class OverLoadConstructor {
    public static void main(String args[]) {
        // create boxes using the various constructors
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box cube = new Box(7);
        Box clone1 = new Box(box1);
        double vol;
        // get volume of first box
        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);
        // get volume of second box
        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);
        // get volume of cube
        vol = cube.volume();
        System.out.println("Volume of cube is " + vol);
        // get volume of clone1
        vol = clone1.volume();
        System.out.println("Volume of clone1 is " + vol);
        box2.width = 5; /* width,height,depth are default mumbers */
        box2.height = 10;
        box2.depth = 15;
        Box clone2 = new Box(box2);
        // get volume of clone1
        vol = clone2.volume();
        System.out.println("Volume of clone2 is " + vol);
    }
}

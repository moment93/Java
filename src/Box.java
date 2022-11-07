class Box{
    double width;
    double height;
    double depth;

    //Notice this constructor. It takes an object of type Box.
    Box(Box ob){//Pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //This is the constructor for box
    Box(double w, double h, double d){
        System.out.println("Constructing box");
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = -1; //use -1 to indicate uninitialized box
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    //compute and return volume
    double volume(){
        return width * height * depth;
    }

    //sets dimensions of a box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
class Box{
    double width;
    double height;
    double depth;

    //This is the constructor for box
    Box(double w, double h, double d){
        System.out.println("Constructing box");
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = 10;
        height = 10;
        depth = 10;
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
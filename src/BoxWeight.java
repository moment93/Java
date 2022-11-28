class BoxWeight extends Box {

    double weight; //Weight of Box

    //construct clone of an object
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    //constructor used when cube is created
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);//call superclass constructor
        weight = m;
    }

    //default constructor
    BoxWeight(){
        super();
        weight = -1;
    }
}

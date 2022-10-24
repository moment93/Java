//This class declares an object of type box
class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        //Assign values to mybox instance
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        //Compute volume of box
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume is " + vol);
    }
}
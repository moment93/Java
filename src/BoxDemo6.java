
class BoxDemo6{
    public static void main(String[] args) {
        //Declare, allocate and initialize box
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of box1 is: " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of second box is: " + vol);
    }
}
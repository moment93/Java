class BoxDemo7{
    public static void main(String[] args) {
        //Declare allocate and initialize box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of first box is: " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of second box is: " + vol);
    }
}
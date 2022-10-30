class BoxDemo3{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //Assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //Assign different values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Display volume of first box
        System.out.println("Volume of mybox1 is: " + mybox1.volume());

        //Display volume of second box
        System.out.println("Volume of mybox2 is: " + mybox2.volume());
    }
}
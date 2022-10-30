class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;


        //Call all versions of test
        ob.test();
        ob.test(10, 20);
        ob.test(i); //This will invoke test double
        ob.test(123.2); //This will invoke test double
    }
}
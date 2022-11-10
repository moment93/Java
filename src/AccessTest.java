class AccessTest{
    public static void main(String[] args) {
        Test ob = new Test();

        //These are ok a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        //This is not ok and will cause an error
        // ob.c = 100; //Error

        //You must access c through its methods.
        ob.setc(100); //OK
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}


//lft off p145 Stack example
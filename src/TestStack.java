class TestStack{
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push some number onto the stack
        for(int i = 0; i < 10; i++) mystack1.push(i);
        for(int i = 10; i < 20; i++) mystack2.push(i);

        //pop those numbers of the stack
        System.out.println("Stack in mystack1: ");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        /*These stack statements are not legal
        mystack1.tos = -2'
        mystack2.stck[3] = 100;
         */

    }
}
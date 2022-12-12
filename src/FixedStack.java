//An implementation of IntStack that uses fixed storage.
public class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    //Allocate and initialize stack
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    //push an item onto the stack
    public void push(int item) {
        if(tos==stck.length-1)//use length member
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}

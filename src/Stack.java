

class Stack{
    private int stck[];
    private int tos;

    //Initialize top of stack
    Stack(){
        tos = -1;
    }

    //allocate and initialize a stack
    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item){
        if(tos == 9)
            System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    //Pop an item from the stack
    int pop(){
        if(tos < 0){
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
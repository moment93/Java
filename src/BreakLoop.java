//Using break to exit a loop
class BreakLoop{
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(i ==10) break; //terminate the loop if its 10
            System.out.println("i: " + i);
        }
        System.out.println("loop complete!");
    }
}
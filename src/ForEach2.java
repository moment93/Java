//Use break with for each style for

class ForEach2{
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        //Use for to display and and sum values
        for(int x : nums){
            System.out.println("Value is " + x);
            sum += x;
            if(x == 5) break; //Stop the loop when 5 is obtained
        }
        System.out.println("Summation first 5 elements: " + sum);
    }
}
//Use a string to control switch statement

class StringSwitch{
    public static void main(String[] args) {
        String str = "two";

        switch(str){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("Three");
                break;
            default:
                System.out.println("No Match");
                break;
        }
    }
}
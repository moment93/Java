class Light{
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approx speed of light in miles/s
        lightspeed = 186000;
        days = 1000; // Specify number of days here.
        seconds = days * 24 * 60 * 60; // Convert to seconds
        distance = lightspeed * seconds; // Compute the distance

        System.out.println("In " + days);
        System.out.println(" days light will travel about");
        System.out.println(distance + "miles. ");

    }
}
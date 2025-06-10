public class display_system_time {
    public static void main(String[] args) {
        // get the current system time in milliseconds
        Long currentTimeMillis = System.currentTimeMillis();
        // now convert millisecond to seconds
        Long currentSeconds = currentTimeMillis / 1000;
        // now convert second to minutes
        Long currentMinutes  = currentSeconds / 60;
        // now convert minutes to hours
        Long currenthours =  currentSeconds / 3600;

        // Print the value to use the variable
        System.out.println("Minutes: " + currentMinutes);
        System.out.println("Hours:" +currenthours);
    }
}

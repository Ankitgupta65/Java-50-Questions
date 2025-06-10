public class swap_variable {
    public static void main(String[] args) {
        // input two numbers to be swapped
        int a = 10;
        int b = 20;
        System.out.println( "Before swapping: a ="+a+", b="+b+"");
        // now swapping logic for this
         int temp =a;
         a =b;
         b = temp;
         System.out.println("After swapping: a="+a+",b="+b+"");

    }
}

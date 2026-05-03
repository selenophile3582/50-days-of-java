
import java.util.Scanner;

public class Day04_Tempeature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius :");

        float cel = sc.nextFloat();
        float fahrenheit = ((cel * 9) / 5) + 32;
        System.out.println(cel + "degree Celcius = " + fahrenheit + " Fahrenheit ");
        sc.close();
    }
}

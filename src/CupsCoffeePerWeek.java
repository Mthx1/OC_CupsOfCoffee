import java.util.Arrays;

public class CupsCoffeePerWeek
{
    public static void main(String[] args)
    {

        int[] cupsOfCoffeePerDayOfTheWeek;

        cupsOfCoffeePerDayOfTheWeek=new int[]{1,2,3,4,5,6,7};

        cupsOfCoffeePerDayOfTheWeek[4]=3;

        System.out.println(Arrays.toString(cupsOfCoffeePerDayOfTheWeek));


    }

}
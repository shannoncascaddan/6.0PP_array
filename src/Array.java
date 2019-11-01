import java.util.Scanner;
public class Array
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the length of your array: ");
        int LIMIT = keyboard.nextInt();
        int[] array = new int[LIMIT];
        int i = 0;
        int j = 0;

        System.out.print("Please enter a number: ");

        while(i<LIMIT)
        {
            array[i] = keyboard.nextInt();
            i++;
        }//end for
        while (j<array.length)
        {
            System.out.print(array[j] + " ");
            j++;
        }//end while to print
    }//end main method
}//end array class

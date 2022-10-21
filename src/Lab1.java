import java.util.Scanner;

public class Lab1 {
    public static void reverseDisplay(int value)
    {
        if(value!=0){
            System.out.print(value%10);
            reverseDisplay(value/10);
        }
        else{
            System.out.print("\n");
        }
    }
    public static int largest(int[] list)
    {
        return largest(list,list.length-1);
    }
    public static int largest(int[] list,int high)
    {
        if(high==0)return list[0];
        list[0] = Math.max(list[0], list[high]);
        return largest(list,high-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        System.out.print("The reversal of " + i + " is ");
        reverseDisplay(i);
        System.out.print("Enter 8 integers: ");
        int[] list = new int[8];
        for (i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        System.out.println("The largest element is " + largest(list));
        input.close();
    }
}

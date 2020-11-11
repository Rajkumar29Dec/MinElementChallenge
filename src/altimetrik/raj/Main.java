package altimetrik.raj;



/*-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
*/

import java.util.Scanner;

public class Main {
        public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter the size of an Array... ");
        count=s.nextInt();
        int[] ArrayIntegers=readIntegers(count);
        System.out.println("The Readed Arrays are ....");
        printArray(ArrayIntegers);
        System.out.println("The Minimum Element in the Array is..");
        findMin(ArrayIntegers);

    }

    private static void findMin(int[] arrayIntegers) {
        int minElement=0;
        int temp=0;
        for (int i=0;i<arrayIntegers.length;i++){
            for (int j=i+1;j<arrayIntegers.length;j++){
                if (arrayIntegers[i]>arrayIntegers[j]){
                   temp=arrayIntegers[j];
                   arrayIntegers[j]=arrayIntegers[i];
                   arrayIntegers[i]=temp;
                }
            }
            minElement=arrayIntegers[0];
        }
        System.out.println("Minimum Element is :"+minElement);
    }

    private static void printArray(int[] arrayIntegers) {
        for (int i=0;i<arrayIntegers.length;i++){
            System.out.println(arrayIntegers[i]);
        }
    }

    private static int[] readIntegers(int count) {
        int[] ReadArray=new int[count];
        for (int i=0;i<count;i++){
            ReadArray[i]=s.nextInt();
        }
        return ReadArray;
    }
}

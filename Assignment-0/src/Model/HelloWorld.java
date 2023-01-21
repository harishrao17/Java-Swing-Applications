/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class HelloWorld {

    public static void main(String[] args) throws Exception {
        int x = 5; // int
        double y = 3.12; // double
        float z = 11.234f; // float
        String name = "Harish"; // string
        boolean bool = true; // boolean
        char c = 'T'; // char
        int n = 20;
        int[] nums = new int[n]; // Initializing an integer array with the size of n
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        
        // Conditional if else..(in Assignment Learning Objectives)
        if (x>y){
            System.out.println(x + " is greater than " + y);
        }
        else if (x==y) {
            System.out.println(x +" is equal to " + y);
        }
        else {
            System.out.println(y + " is greater than " + x);
        }
        // Displaying the outputs....
        System.out.println("Integer Val: " + x);
        System.out.println("Double val: " + y);
        System.out.println("Float val: " + z);
        System.out.println("String val: " + name);
        System.out.println("Boolean val: " + bool);
        System.out.println("Char val: " + c);
        System.out.println("Integer Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        
        
    }
}

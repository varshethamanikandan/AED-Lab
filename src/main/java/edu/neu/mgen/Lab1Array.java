package edu.neu.mgen;

public class Lab1Array {

   
        public static void main(String[] args) {
            // Initialize arrays x and y
            int[] x = {23, 56, 12, 87, 45};
            int[] y = {34, 68, 90, 21, 77};
    
            // Create array z containing the maximum of respective elements of x and y
            int[] z = new int[5];
            for (int i = 0; i < 5; i++) {
                z[i] = Math.max(x[i], y[i]);
            }
    
            // Format output
            String output_x = arrayToString(x);
            String output_y = arrayToString(y);
            String output_z = arrayToString(z);
    
            // Print formatted output
            System.out.println("Array x = {" + output_x + "}");
            System.out.println("Array y = {" + output_y + "}");
            System.out.println("Array z = x + y = {" + output_z + "}");
        }
    
        // Utility method to convert an array to a string
        public static String arrayToString(int[] arr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if (i < arr.length - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }
    }
    

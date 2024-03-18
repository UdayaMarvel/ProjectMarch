package com.amazon;



public class DhivyaTask {
    public static void main(String[] args) {
        int[] a = {10, 50, 60, 40, 90, 60};
        int c;

        // Sorting in ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        
        

        System.out.println("Ascending Order:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Sorting in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }

        System.out.println("Descending Order:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    
    
        
    
    }
}

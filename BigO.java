/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author int320
 */
public class BigO {

    public static void main(String[] args) {
       
 int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        //random
        int a[] = new int[n];
        int b[] = new int[n];
        Random rm = new Random();
        for (int i = 0; i < n; i++) 
        {
            a[i] = rm.nextInt(n);
        }
        System.arraycopy(a,0, b, 0,n);
        // keep
        long begin = System.currentTimeMillis();
        
        //sorting a O(n!)
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
          }
        }
        //usedTime
        long usedTime=System.currentTimeMillis()-begin;
 
        //sorting b O(nlogn)
        long begin2 = System.currentTimeMillis();
        Arrays.sort(b);
        
         long usedTime2=System.currentTimeMillis()-begin2;
 
        System.out.println("input : "+n+"   "+"Your Program : "+usedTime+" ms"+"   "+"Arrays sort : "+usedTime2+" ms");
//        System.out.println(usedTime*0.001+"\t"+usedTime2*0.001);  seconds

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Arrays;

/**
 *
 * @author WIG180022
 */
public  class Queue {

   
        
       public static void selectionSortSmallest(double[] list){
          for (int i=0;i< list.length-1;i++){
              double currentMin = list[i];
              int currentMinIndex= i;
              for(int j=i+1;j<list.length; j++){
                  if(currentMin> list[j]){
                      currentMin = list[j];
                      currentMinIndex = j;
                  }
              }
          
          if (currentMinIndex !=i){
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }  
          }
       }

         public static void selectionSortBiggest(double[] list){
          for (int i=0;i<list.length-1;i++){
              double currentMax = list[i];
              int currentMaxIndex= i;
              for(int j=i+1;j<list.length; j++){
                  if(currentMax< list[j]){
                      currentMax = list[j];
                      currentMaxIndex = j;
                  }
              }
          
          if (currentMaxIndex !=i){
            list[currentMaxIndex] = list[i];
            list[i] = currentMax;
          }
          }
          
         }
         public static void print(double [] arr){
             System.out.print("list: ");
             for(int i = 0;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
             }
         }
       
    public static void main(String[] args) {
        // TODO code application logic here
   double [] arr = new double[] {45,7,2,8,19,3};     
   selectionSortSmallest(arr); 
   print(arr);
        System.out.println("");
  // System.out.println("List of array: "+Arrays.toString(arr));
   selectionSortBiggest(arr);
   print(arr);
  // System.out.println("List of array: "+Arrays.toString(arr));   
       
   
        

        
    }
    }
    


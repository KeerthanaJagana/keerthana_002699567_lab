/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program2;

import java.util.Arrays;

/**
 *
 * @author keerthanajagana
 */
public class ArrayProgram {
    public static void main(String [] args){
        int arr[]=new int[4];   
        arr[0]=2;  
        arr[1]=4;    
        arr[2]=6;    
        arr[3]=8;  
    
    
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            arr[i] *=2;
        }else {
        arr[i] *= 3;

        } 
    }
    
    System.out.println("array after updation -> " + Arrays.toString(arr));
    }
    
    
}

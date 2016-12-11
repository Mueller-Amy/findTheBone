/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheBone.control;
import citbyui.cit260.findTheBone.view.ErrorView;
import java.util.Scanner;
/**
 *
 * @author Amy Mueller
 */
public class ItemsWithinControl {
    
    public static void main(String[] args){
        
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Number of names");
        n=s.nextInt();
        String names[] =  new String[n];
        Scanner s1 = new Scanner(System.in);
       System.out.println("Enter all names");
        // this.console.println("Enter all names");
        for(int i =0; i <n; i++){
            names[i]= s1.nextLine();
        }
        for (int i=0; i<n; i++) {
            for(int j = i +1; j<n; j++) {
                if (names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
                }
            }
        System.out.print("Names Alphabetical Order");
        //this.console.print("Names Alphabetical Order");
        for(int i=0; i<n-1; i++){
            System.out.print(names[i]+ ",");
        }
        System.out.print(names[n-1]);
        }
    }


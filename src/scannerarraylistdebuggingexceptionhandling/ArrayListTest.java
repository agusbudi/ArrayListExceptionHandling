/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scannerarraylistdebuggingexceptionhandling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agus budi
 */
public class ArrayListTest {
    public void StaticArray(){
        int jmlMhs = 5;
        String [] mhsOOP = new String[jmlMhs];    //deklarasi array static
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan " + jmlMhs + " nama mahasiswa:");
        for(int i=0;i<jmlMhs;i++){
            mhsOOP[i] = input.nextLine();
        }
        System.out.println(mhsOOP[3]);
        input.close();
        
        int usia[] = {1,2,3,4,5};   //deklarasi array static
    }
    
    public void DynamicArray(){
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++){   //test: 19 32 45 89
            ages.add(input.nextInt());
            //System.out.println(ages.size()-1);  //debugging manual
        }
        
        ages.add(1, 18);
        input.close();       
        for(int age : ages)
            System.out.println(age);
//        
        //conversion casting
        int x = Integer.parseInt("5");
        String lima = Integer.toString(x);
        System.out.println(Integer.MAX_VALUE);
    }
}

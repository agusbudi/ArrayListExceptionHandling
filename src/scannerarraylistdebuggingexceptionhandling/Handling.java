/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scannerarraylistdebuggingexceptionhandling;

/**
 *
 * @author agus budi
 */
public class Handling {
    public void handleException(int index){ // throws Exception{
        int usia[] = {101,12,23,54,59}; //size : 5 , index [0,4]
        
        try {
            System.out.println(usia[index]);
            index = index/0;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("0x812933 indeks lebih dari ukuran array: " + e);
        } catch (ArithmeticException e){
            System.out.println("0x812934 rumus salah: " + e);
        } catch (Exception e){
            System.out.println("0x812935 error selain aritmatika dan indeks array : " + e);
        }
        
        System.out.println("oke");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author acer
 */
public class GanijlGenap {
    public static void main(String[] args) {
      int i = 1;
      do{
        if(i%2 == 0){
          System.out.println(i + " genap");
        }else{
          System.out.println(i + " ganjil");
        }
        i++;
      }while(i<=20);
    }
}

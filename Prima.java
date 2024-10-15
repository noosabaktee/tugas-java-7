/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author acer
 */
public class Prima {
    public static void main(String[] args) {
    int i=1;
    while(i<=20){
      if(i%2 != 0 && i%3 != 0 && i>1 || i == 2 || i == 3){
        System.out.println(i + " prima");
      }else{
        System.out.println(i + " bukan");
      }
      i++;
    }
  }
}

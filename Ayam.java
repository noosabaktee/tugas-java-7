/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author acer
 */
public class Ayam {
    public static void main(String[] args) {
      for(int i=10;i>=1;i--){
        if(i-1 == 0){
            System.out.println("Anak ayam turun " + i + " mati 1 tinggal induknya");
            return;
        }
        System.out.println("Anak ayam turun " + i + " mati 1 tinggal " + (i-1));
      }
    }
}

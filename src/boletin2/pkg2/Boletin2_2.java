/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg2;

import java.util.Scanner;

public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float lado;
      Scanner obx = new Scanner(System.in);
      System.out.println("teclea lado :") ;
      lado = obx.nextFloat();
      System.out.println("area = " +lado*lado);
    }
    
}

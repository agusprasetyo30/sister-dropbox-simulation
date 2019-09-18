/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author gokpraz
 */
public class Test {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) 
   {
      menu();
   }
   
   private static void menu()
   {
      System.out.println("=== Dropbox Simulation in Command Line ===");
      System.out.println("Pilih layanan penyimpanan Drop Box :");
    
      System.out.println("1. Free");
      System.out.println("2. Premium");
     
      File agus = new File("Melkan", "melkan@gmail.com", "08144822848");
      agus.setLayanan("FREE");
      
      System.out.println(agus.getNama() + " | " + agus.getEmail() + " | " + agus.getTelepon());
      System.out.println(agus.getUkuran());
      
      System.out.println("-----------------------------------------------");
      
      agus.setFile("File1", 100);
      agus.setFile("File2", 200);
      agus.setFile("File3", 300);
      
      for (int i = 0; i < agus.getNamaFile().size(); i++) {
         System.out.println(agus.getNamaFile().get(i) + " | " + agus.getUkuranFile().get(i));
      }
      
      System.out.println("Total => " + agus.hitungTotalUkuran());
      System.out.println("Sisa => " + agus.hitungSisaUkuran());
   }
   
}

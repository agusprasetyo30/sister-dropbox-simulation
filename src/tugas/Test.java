/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;

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
       String nama, email, telepon;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("=== Dropbox Simulation in Command Line ===");
        System.out.println("Masukkan biodata");
        
        System.out.print("Nama  \t: ");
        nama = sc.nextLine();
        
        System.out.print("Email \t: ");
        email = sc.nextLine();
        
        System.out.print("Telepon : ");
        telepon = sc.nextLine();
        
        File pengguna = new File(nama, email, telepon);
       
        System.out.println("\n");
        pilihLayanan(pengguna);
        
        System.out.println("\n");
        menuFile(pengguna);
//        Scanner sc = new Scanner(System.in);
       int menu;
       do{
       menuFile(pengguna);
       
       System.out.print("Pilih Menu : ");  
       menu = sc.nextInt();
       
       switch(menu){
            case 1 :
               System.out.println("\nTotal Kapasitas Penyimpanan : " + pengguna.getUkuran());
               System.out.println("Total penyimpanan yang digunakan : " + pengguna.hitungTotalUkuran());
               System.out.println("Sisa penyimpanan : " + pengguna.hitungSisaUkuran() + "\n");
            break;
            
            case 2 :
                System.out.println("\nBiodata : ");
                System.out.println("Nama :  " + pengguna.getNama());
                System.out.println("Email : " + pengguna.getEmail());
                System.out.println("Telepon : " + pengguna.getTelepon() +"\n");
            break;
            case 3 :
                
            break;
            case 4 :
            break;
         
       }
       }while(menu != 4);
   }
   
   private static void inputBiodata(){
       
        
   }
   
   private static void pilihLayanan(File file)
   {
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Pilih layanan penyimpanan Drop Box :");
      System.out.println("1. Free");
      System.out.println("2. Premium");
       System.out.print("Pilih berdasarkan nomor : ");
      int pilih = sc2.nextInt();
      
       if (pilih ==  1) {
           file.setLayanan("FREE");
       }else if (pilih ==  2){
           file.setLayanan("PREMIUM");
       }
     
   }
   private static void menuFile(File file){
       System.out.println("Selamat Datang [ " + file.getNama() + " ]");
       System.out.println("Layanan [ " + file.getLayanan() + " ]\n");
       System.out.println("Fitur yang dapat dipilih : ");
       System.out.println("1. Jumlah Kapasitas");
       System.out.println("2. Lihat Biodata");
       System.out.println("3. Input File");
       System.out.println("4. Keluar\n");
       
            
//       System.out.println("Fitur yang dapat dipilih : ");
   }
   
}

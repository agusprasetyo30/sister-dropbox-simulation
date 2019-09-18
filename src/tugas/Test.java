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
      Scanner sc = new Scanner(System.in);
      Scanner sc1 = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in);
      
      String nama, email, telepon;
      String inisial;
      int menu;
       
      System.out.println("=== Dropbox Simulation in Command Line ===");
      System.out.println("Masukkan biodata");

      System.out.print("Nama  \t: ");
      nama = sc.nextLine();

      System.out.print("Email \t: ");
      email = sc.nextLine();

      System.out.print("Telepon : ");
      telepon = sc.nextLine();

      File obj = new File(nama, email, telepon);

      System.out.println("\n");
      pilihLayanan(obj);
        
      do {
       
         menuFile(obj);

         System.out.print("Pilih Menu : ");  
         menu = sc1.nextInt();

            switch(menu){
               // Memilih menu (1) Jumlah kapasitas
                 case 1 :
                    System.out.println("\nTotal Kapasitas Penyimpanan : " + obj.getUkuran() + " mb");
                    System.out.println("Total penyimpanan yang digunakan : " + obj.hitungTotalUkuran() + " mb");
                    System.out.println("Sisa penyimpanan : " + obj.hitungSisaUkuran() + " mb\n");
                 break;

                 // Memilih menu (2) Lihat Biodata
                 case 2 :
                    System.out.println("\n====== Biodata Pengguna ======");
                    System.out.println("Nama \t: " + obj.getNama());
                    System.out.println("Email\t: " + obj.getEmail());
                    System.out.println("Telepon : " + obj.getTelepon());
                    System.out.println("==============================\n");
                 break;

                 // Memilih menu (3) Input File
                 case 3 :
                     do {                    
                          String namaFile;
                          int ukuranFile;

                          System.out.print("Masukan Nama File = ");
                          namaFile = sc.nextLine();

                          System.out.print("Masukan Ukuran File (mb) = ");
                          ukuranFile = sc1.nextInt();

                          // Menghitung jika output lebih dari kapasitas
                          if (obj.hitungTotalUkuran() + ukuranFile <= obj.getUkuran() ) {
                             obj.setFile(namaFile, ukuranFile); 
                          } else {
                             System.out.println("Data yang anda inputkan melebihi kapasitas . . .");
                          }


                          System.out.print("Klik [ ENTER ] untuk menambah file, Klik [ Y ] untuk keluar . . . ");
                          inisial = sc2.nextLine();
                          System.out.println("");

                     } while (inisial.equalsIgnoreCase(""));

                 break;

                 // Memilih menu (4) Tampilkan data file
                 case 4 :
                    System.out.println("===============================");
                    System.out.println("NO\t" + "Nama File\t" + "Ukuran");
                    System.out.println("===============================");
                    for (int i = 0; i < obj.getNamaFile().size(); i++) {
                       int nomer = i + 1;
                       System.out.println(nomer + ". \t" + obj.getNamaFile().get(i) + "\t\t" + obj.getUkuranFile().get(i) + " mb");
                    }
                    System.out.println("===============================");
                    System.out.println("Kapasitas yang digunakan = " + obj.hitungTotalUkuran() + " mb\n");
                 break;

                 // Memilih menu (5) Keluar
                 case 5 :
                    System.out.println("Anda keluar . . .");
                 break;
            }
         
      } while(menu != 5);
   }
   

   private static void pilihLayanan(File file)
   {
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Pilih layanan penyimpanan Drop Box :");
      System.out.println("1. Free");
      System.out.println("2. Premium");
      
      System.out.print("Pilih berdasarkan nomor : ");
      int pilih = sc2.nextInt();
      System.out.println("");
      
      if (pilih ==  1) {
         file.setLayanan("FREE");
      } else if (pilih ==  2) {
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
       System.out.println("4. Tampilkan Data File");
       System.out.println("5. Keluar\n");
   }
   
}

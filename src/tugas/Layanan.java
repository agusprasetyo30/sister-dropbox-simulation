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
public class Layanan extends User
{

   private int ukuran = 0;
   private String layanan;
   
   public Layanan(String nama, String email, String telepon) 
   {
      super(nama, email, telepon);
   }

   public String getLayanan() 
   {
      return layanan;
   }
   
   public void setLayanan(String layanan)
   {
      this.layanan = layanan;
      // 2000000 MB = 2000 GB
      
      if (layanan.equalsIgnoreCase("FREE")) {
         this.ukuran = 2000; // 2 GB
         
      } else if (layanan.equalsIgnoreCase("PREMIUM")) {
         this.ukuran = 2000000; // 2000 GB
      }
   }
   
   public int getUkuran()
   {
      return this.ukuran;
   }
   
   public void setUkuran(int ukuran)
   {
      this.ukuran = ukuran;
   }
   
   
}

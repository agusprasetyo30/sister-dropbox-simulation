/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.ArrayList;

/**
 *
 * @author gokpraz
 */
public class File extends Layanan{
   private ArrayList namaFile = new ArrayList();
   private ArrayList ukuranFile = new ArrayList();
   
   public File(String nama, String email, String telepon) {
      super(nama, email, telepon);
   }
   
   // Menambahkan file nama dan ukuran
   public void setFile(String namaFile, int ukuranFile)
   {
      this.namaFile.add(namaFile);
      this.ukuranFile.add(ukuranFile);
   }
   
   // Mengambil data arrayList nama
   public ArrayList getNamaFile()
   {
      return namaFile;
   }

   // Mengambil data arrayList ukuran
   public ArrayList getUkuranFile()
   {
      return ukuranFile;
   }
   
   public int hitungTotalUkuran()
   {
      int total = 0;
      
      for (int i = 0; i < this.getUkuranFile().size(); i++) {
         total = total + Integer.parseInt(getUkuranFile().get(i).toString());
      }
      
      return total;
   }
   
   public int hitungSisaUkuran()
   {
      int ukuranAwal = this.getUkuran();
      int sisa;
      
      sisa = ukuranAwal - this.hitungTotalUkuran();
      
      return sisa;
   }
   
}

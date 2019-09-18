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
public class User 
{
   private String nama;
   private String email;
   private String telepon;

   public User(String nama, String email, String telepon) 
   {
      this.nama = nama;
      this.email = email;
      this.telepon = telepon;
   }

   
   public String getNama() 
   {
      return nama;
   }

   public void setNama(String nama) 
   {
      this.nama = nama;
   }

   public String getEmail() 
   {
      return email;
   }

   public void setEmail(String email) 
   {
      this.email = email;
   }

   public String getTelepon() 
   {
      return telepon;
   }

   public void setTelepon(String telepon) 
   {
      this.telepon = telepon;
   }
   
}

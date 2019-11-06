/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan59.detectiveconan;

/**
 *
 * @author user
 */
public class DetectiveConan {
   protected String nama;
   protected String posisi;
   protected String ciri2;
   
   public DetectiveConan(String nama, String posisi, String ciri2){
       this.nama = nama;
       this.posisi = posisi;
       this.ciri2 = ciri2;
   }
   public void tampil(){
       System.out.println("Nama : "+nama);
       System.out.println("Ciri-ciri : "+ciri2);
       System.out.println("Posisi digambar : "+posisi);
       System.out.println("");
   }
}

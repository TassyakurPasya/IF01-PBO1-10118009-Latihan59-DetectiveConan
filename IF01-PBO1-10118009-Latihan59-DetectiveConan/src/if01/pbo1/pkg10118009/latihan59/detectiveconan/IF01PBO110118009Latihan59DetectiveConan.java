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
public class IF01PBO110118009Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Daftar Nama Tokoh Detective Conan ===");
        System.out.println("");
        shiniciKudo sk = new shiniciKudo("Shiniki Kudo / Conan Edogawa", "Tengah Bawah", "Menggunakan jaz biru dan kacamata");
        sk.tampil();
        ranMouri rm = new ranMouri("Ran Mouri", "ke 4 dari kiri atas", "Menggunakan jaz biru dan Rambut Jambul");
        rm.tampil();
        mitsuhikoTsuburaya mt = new mitsuhikoTsuburaya("Mitsuhiko Tsuburaya", "ke 2 dari kiri bawah", "Menggunakan kaos kuning kerah biru");
        mt.tampil();
        kogoroMuori km = new kogoroMuori("Kogoro Mouri", "ke 3 dari kanan atas", "Menggunakan jaz biru tua dan berkumis");
        km.tampil();
        kazuhaToyama kt= new kazuhaToyama("Kazuha Toyama", "ke 1 dari kiri atas", "Menggunakan baju orange");
        kt.tampil();
        gentaKojima gk = new gentaKojima("Genta Kojima", "ke 1 dari kiri bawah", "Menggunakan kaos putih merah");
        gk.tampil();
        eriKisaki ek = new eriKisaki("Eri Kisaki", "ke 2 dari kanan atas", "Menggunakan jaz cream");
        ek.tampil();
        ayumiYoshida ay = new ayumiYoshida("Ayumi Yoshida", "ke 1 dari kanan bawah", "Menggunakan baju warna pink");
        ay.tampil();
        aiHaibara ah = new aiHaibara("Ai Haibara", "ke 2 dari kanan bawah", "Menggunakan baju hijau");
        ah.tampil();
        agasaHiroshi ahi = new agasaHiroshi("Agasa Hiroshi", "ke 1 dari kanan atas", "Menggunakan jaz putih");
        ahi.tampil();
        SonokoSuzuki ss = new SonokoSuzuki("Sonoko Suzuki", "ke 3 dari kiri atas", "Menggunakan jaz biru dan rambut agak kekuningan");
        ss.tampil();
        HeijiHattori hh = new HeijiHattori("Heiji Hattori", "ke 2 dari atas kiri", "Menggunakan kemeja abu2");
        hh.tampil();
    }   
    
}

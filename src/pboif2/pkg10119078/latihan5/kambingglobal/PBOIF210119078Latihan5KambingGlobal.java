/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan hasil penjumlahan variabel
 *
 */
package pboif2.pkg10119078.latihan5.kambingglobal;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan5KambingGlobal {
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119078Latihan5KambingGlobal kambingSusu = new PBOIF210119078Latihan5KambingGlobal ();
        
        //menampilkan jumlah kambing yang ada saat pertama kali
        kambingSusu.getJumlahKambing ();
        
        //menambah lima kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}

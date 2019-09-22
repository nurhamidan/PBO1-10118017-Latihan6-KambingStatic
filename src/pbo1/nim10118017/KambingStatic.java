package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mengakses dan mengisi nilai variabel jumlahKambing yang sifatnya static di class Mamalia.
 *                        Menampilkan nilai konstanta NAMA_KAMBING yang sifatnya static.
 * 
 */
public class KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta.
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}

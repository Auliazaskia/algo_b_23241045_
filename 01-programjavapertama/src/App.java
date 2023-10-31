public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        // Deklarasi variable
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

       // mengisi variable
       nama = "Aulia";
       nim = "23241045";
       tgl_lahir = "29 0kt0ber 2005";
       alamat = "Bima No. 01";
       berat_badan = 40f;
       tinggi_badan = 144.5f;

       // cetak Biodata
       System.out.println("=====================================");
       System.out.println("Nama : " + nama);
       System.out.println("Nim : " + nim);
       System.out.println("Tanggal Lahir :" + tgl_lahir);
       System.out.println("Alamat :" + alamat);
       System.out.println("Berat Badan : " + berat_badan);
       System.out.println("Tinggi Badan : " + tinggi_badan);
       System.out.println("=====================================");

    }
}
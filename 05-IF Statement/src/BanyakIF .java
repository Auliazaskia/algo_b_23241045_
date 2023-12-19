import java.util.Scanner;

class BanyakIF  {
    public static void main(String[] args) {

    
    // Data member 
    int nilai;
    String garde;

    // INPUT SCANNER 
    Scanner scan = new Scanner (System.in);
     
    // Masukkan input
    System.out.print("Masukkan Nilai : ");
    nilai = scan.nextInt();

    // IF Statement 
    if (nilai >= 80 && nilai <= 89) {
        garde = "A";
    } else if (nilai >= 70 && nilai <=79 ) {
        garde = "B";
    } else if (nilai >= 60 && nilai <= 69 ) {
        garde = "C";
    } else if (nilai >= 50 && nilai <= 59 ) {
        garde = "D";
    } else {
        garde = "E";
    }
    System.out.println("nilai: " + nilai);
    System.out.println("garde:" + garde);

    }
    
}



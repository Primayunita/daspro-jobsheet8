import java.util.Scanner;

public class Porseni16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = input.nextInt();
        input.nextLine(); 

        String[] caborList = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("Data Politeknik ke-" + i + ":");
            System.out.print("Masukkan nama politeknik: ");
            String namaPoliteknik = input.nextLine();

            System.out.println("Politeknik: " + namaPoliteknik);

            for (String cabor : caborList) {
                System.out.println("Cabang Olahraga: " + cabor);
                System.out.println("Nama Atlet:");
                
                for (int j = 1; j <= 5; j++) {
                    System.out.print("Nama atlet ke-" + j + ": ");
                    String namaAtlet = input.nextLine();
                    System.out.println(" - " + namaAtlet);
                }
            }
        }
    }
}

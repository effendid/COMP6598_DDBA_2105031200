import java.util.Random;
import java.util.Scanner;
public class TK4 {
    static Scanner input = new Scanner(System.in);
    static int data[];
    static Random rand = new Random();
    public static void main(String[] args) {
        try{

            System.out.print("Masukan banyaknya data:");
            int x = Integer.parseInt(input.nextLine());
            data = new int[x];
            for(int i = 0; i<x;i++){
                data[i] = rand.nextInt(20);
            }
            menuUtama();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    static void menuUtama() {
        String pilihan = "";
        System.out.println("====== Menu ======");
        System.out.println("1. Lihat Angka");
        System.out.println("2. Acak Angka");
        System.out.println("3. Sorting Angka Ascending");
        System.out.println("4. Sorting Angka Descending");
        System.out.println("5. Keluar");

        System.out.print("Masukkan pilihan > ");
        pilihan = input.nextLine();
        switch (pilihan) {
            case "1":
                lihatAngka();
                break;
            case "2":
                acakAngka();
                break;
            case "3":
                ascAngka();
                break;
            case "4":
                descAngka();
                break;
            case "5":
                break;
            default:
                menuUtama();
                break;
        }
    }

    private static void descAngka() {
        for(int i = data.length-1; i>=0;i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    swap(j,j+1);
                }
            }
        }
        System.out.println("Data telah disorting secara Descending");
        menuUtama();
    }

    private static void ascAngka() {
        for(int i = data.length-1; i>=0;i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(j,j+1);
                }
            }
        }
        System.out.println("Data telah disorting secara Ascending");
        menuUtama();
    }

    private static void acakAngka() {
        for (int i = data.length - 1; i > 0; i--)
        {
            int index = rand.nextInt(i + 1);
            swap(index,i);
        }
        System.out.println("Angka telah diacak kembali");
        menuUtama();
    }

    private static void lihatAngka() {
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        menuUtama();
    }

    private static void swap(int index, int flag){
        int a = data[index];
        data[index] = data[flag];
        data[flag] = a;
    }
}

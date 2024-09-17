public class handson3 {
    public static void main(String[] args) {
        // Menggunakan for loop
        System.out.println("Menggunakan for loop:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
        }

        // Menggunakan while loop 
        System.out.println("Menggunakan while loop:");
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) {
                i++;
                continue; // Lewati angka yang habis dibagi 3
            }
            if (i > 15) {
                break; //
            }
            System.out.println(i);
            i++;
        }

        // Menggunakan do-while loop
        System.out.println("Menggunakan do-while loop:");
        i = 1; // Reset nilai i
        do {
            if (i % 3 == 0) {
                i++;
                continue; // Lewati angka yang habis dibagi 3
            }
            if (i > 15) {
                break; // Berhenti jika angka lebih dari 15
            }
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}
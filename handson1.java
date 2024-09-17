import java.sql.SQLOutput;

public class handson1 {
    public static void main(String[] args){
        String[] buah = {"apel", "pisang", "mangga", "jeruk"};

        //menggunakan for loop
        System.out.println("Menggunakan for loop:");
        for (int i = 0; i < buah.length; i++){
            System.out.println(buah[i]);
        }

        //menggunakan for-each loop
        System.out.println("Menggunakan for-each loop:");
        for (String item : buah){
            System.out.println(item);
        }

        //menggunakan while loop
        System.out.println("menggunakan while loop");
        int i = 0;
        while (i< buah.length){
            System.out.println(buah[i]);
            i++;
        }

        //menggunakan do-while loop
        System.out.println("Menggunakan do-while loop:");
        i = 0;
        do {
            System.out.println(buah[i]);
            i++;
        } while (i < buah.length);


    }
}

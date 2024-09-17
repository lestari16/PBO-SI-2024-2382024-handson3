public class handson2 {
    public static void main(String[] args){
        //menggunakan for loop
        System.out.println("Menggunakan for loop:");
        for (int i=2; i<= 20; i +=2){
            System.out.println(i);
        }
        //menggunakan for-each loop
        System.out.println("Menggunakan for-each loop");
        int[] genap = {2,4,6,8,10,12,14,16,18,20};
        for(int number : genap){
            System.out.println(number);
        }
        //menggunakan while loop
        System.out.println("Menggunakan while loop:");
        int i = 2;
        while (i <= 20){
            System.out.println(i);
            i+=2;
        }
        //menggunakan do-while loop
        System.out.println("Menggunakan do-while loop:");
        i = 2;
        do {
            System.out.println(i);
        } while(1<=20);
    }
}

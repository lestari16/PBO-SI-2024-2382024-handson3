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
        int j = 2;
        while (j <= 20){
            System.out.println(j);
            j+=2;
        }
        //menggunakan do-while loop
        System.out.println("Menggunakan do-while loop:");
        int K = 2;
        do {
            System.out.println(K);
            K += 2;
        } while(K <=20);
    }
}

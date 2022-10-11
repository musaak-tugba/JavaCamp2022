public class Main {
    public static void main(String[] args) {

        int  number = 97;


        boolean isPrime = false;

        if(number<97){
            System.out.println("Geçersiz sayı.");
            return;
        }

        for(int i = 1; i<number; i++){
            if(number%2 == 0){
                isPrime = true;
            }
        }

        if(isPrime){
            System.out.println("Sayı asal değildir ");

        }else{
            System.out.println("Sayı asaldır");
        }

    }
}
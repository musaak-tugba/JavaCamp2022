public class Main {
    public static void main(String[] args) {


        char harf='A';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Girilen harf kalın büyük ünlü harftir.");
                break;

            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Girilen harf kalın küçük ünlü harftir.");
                break;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Girilen harf ince büyük ünlü harftir.");
                break;

            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Girilen harf ince küçük ünlü harftir.");
                break;
        }

    }
}
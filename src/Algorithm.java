import java.util.Random;

public class Algorithm {


    public static void main(String[] args) {

        Random random = new Random();
        int min = 11;
        int max = 100_011;
        int sum = 0;

        int num = random.nextInt(max - min) + min;
        System.out.println("Випадкове число: " + num);

        System.out.println("Сума розрядів числа: ");
       while(num>0) {
               sum += num % 10;
               num /= 10;
           }
        System.out.println(sum);
            }
        }




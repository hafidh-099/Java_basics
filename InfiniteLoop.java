import java.util.Random;
import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random numb = new Random();

        int secretNumb = numb.nextInt(100);
        System.out.println("init "+secretNumb);
        int data;

        System.out.println("welcome to gassing number game");
        while (true) {
            System.out.println("Pls inter your gassing number (0-99) ");
            data = inp.nextInt();
            if (secretNumb == data) {
                System.out.println("correct guess congradulation " + secretNumb);
                break;
            }else if(data < secretNumb) {
                System.out.println("you a too low. try again");
            }else {
                System.out.println("you a too high. try again");
            }
        }
    }
}

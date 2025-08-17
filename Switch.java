import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("pls inter your choice ");
        int data = inpt.nextInt();
        switch (data){
            case 1:
                System.out.println("hello welcome");
                break;
            case 2:
                System.out.println("pls get out of here");
                break;
            default:
            System.out.println("invalid choice");
            break;
        }
    }
}

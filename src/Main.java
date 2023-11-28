import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("******* Menu ************");
        System.out.println("*  1-Creat              *");
        System.out.println("*  2-Active task list   *");
        System.out.println("*  3-Finished task list *");
        System.out.println("*  4-Update (by id)     *");
        System.out.println("*  5-Delete by id:      *");
        System.out.println("*  6-Mark as Done:      *");
        System.out.println("*************************1");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n==1) {
                System.out.println("1-Creat");
            }
            else if (n==2) {
                System.out.println("2-Active task list");
            }
            else if (n==3) {
                System.out.println("3-Finished task list");
            }
            else if (n==4) {
                System.out.println("4-Update (by id)");
            }
            else if (n==5) {
                System.out.println("5-Delete by id:");
            }
            else if (n==6) {
                System.out.println("6-Mark as Done:");
            }
            else {break;}
        }

    }
}
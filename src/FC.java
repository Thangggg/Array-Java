import java.util.Scanner;

public class FC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F;
        int number ;

        do {
            System.out.println("Menu");
            System.out.println("1. Độ F -> Độ C");
            System.out.println("2. Độ C -> Độ F");
            System.out.println("3. Exit ");
            number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Nhập vào số độ F :");
                    F = input.nextDouble();
                    System.out.println(F + " Độ F " + " = " + doC(F) + " Độ C");
                    break;
                case 2:
                    System.out.println("Nhập vào số độ C : ");
                    C = input.nextDouble();
                    System.out.println(C + " Độ C " + " = " + doF(C) + " Độ F ");
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Nhập 1-3 thôi");

            }

        }while (number != 3);


    }


    public static double doF (double C){
        double F = (9.0 / 5) * C + 32;
        return F;
    }


    public static double doC (double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}

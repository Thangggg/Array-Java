import java.util.Scanner;

public class Push {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr [] = new int[10];

        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Nhập số cần thêm: ");
        int number = input.nextInt();
        System.out.println("Nhập vị trí đưa số vào: 1 - 9 ");
        int index = input.nextInt();


        for (int i = arr.length -1 ; i > index ; i--) {
                arr[i] = arr[i - 1];
        }
        arr[index] = number;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    


}

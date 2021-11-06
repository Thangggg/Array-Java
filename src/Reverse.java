import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Nhập vào độ dài của mảng");
            size = input.nextInt();
            if (size > 20){
                System.out.println("Kích thước không vượt quá 20");
            }
        }while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phẩn tử thứ " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        System.out.println("Các phần tử trong mảng gồm : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Mảng đảo chiều : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }


    }
}

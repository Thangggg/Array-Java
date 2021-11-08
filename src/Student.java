import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài mảng :");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Không quá 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập số điểm của học sinh thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Mảng gồm : ");
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("Số học sinh lớn hơn 5 điểm : " + count);
    }
}

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng : ");
        int size = input.nextInt();
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ : " + ( i + 1) );
            array[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Mảng bạn vừa nhập gồm : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
    }
}

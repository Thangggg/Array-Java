import java.util.Scanner;

public class NoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử mảng 1: ");
        int size1 = input.nextInt();
        int arr1 [] = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.println("Nhập phần tử thứ : " + (i + 1));
            arr1[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Nhập vào số lượng phần tử mảng 2 : ");
        int size2 = input.nextInt();
        int arr2 [] = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.println("Nhập phần tử thứ : " + (i + 1));
            arr2[i] = input.nextInt();
        }

        System.out.println("Mảng 1 gồm các phần tử : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Mảng 2 gồm các phần tử : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        int arr3 [] = new int[size1 + size2];
        System.out.println();
        System.out.println("Gộp 2 mảng lại ta có mảng : ");
        int  count = 0;
//        for(int element : arr1){
//            arr3[i] = element;
//            i++;
//        }
//        for (int element : arr2){
//            arr3[i] = element;
//            i++;
//        }
//
//        for (int j = 0; j < arr3.length; j++) {
//            System.out.print(arr3[j] + " ");
//        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            count++;
        }
        for ( int i = 0; i < arr2.length ; i++) {
            arr3[count] = arr2[i];
            count++;
        }

        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + " ");
        }









    }
}

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số lượng các tỉ phú");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Nhập từ 1-20 thôi mậy");
            }
        }while (size > 20);


        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập số tiền các tỉ phú có ");
            arr[i] = input.nextInt();
        }

        System.out.println("Danh sách tiền của các tỉ phú :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Số tiền lớn nhất trong các tỉ phú là : " + max + " vị trí trong mảng : " + index);
    }
}

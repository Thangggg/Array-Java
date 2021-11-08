import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhập vào vị trí muốn xóa :");
        int index = input.nextInt();

        int [] arr2 = new int[arr.length -1];

        for (int i = arr.length -1; i >= 0; i--) {
            if (i > index){
                arr2[i -1] = arr[i];
            }else {
                if (i != index){
                    arr2[i] = arr[i];
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

////        // cách 2 :
//        for (int i = 0; i < index; i++) {
//            arr2[i] = arr[i];
//        }
//
//        for (int i = index; i < arr.length -1; i++) {
//            arr2[i] = arr[i + 1];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }











//        int size = arr.length;
//        size = delete(arr, number, size);
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//
//    }
//
//
//    public static int findIndex ( int [] arr, int number){
//        for (int i = 0; i < arr.length; i++) {
//            if (number == arr[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//    public static int delete ( int [] arr, int number, int size){
//        int pos = findIndex(arr, number);
//        if (pos == -1) {
//            System.out.println("Không tìm thấy phần tử cần xóa!");
//        }else {
//            for (int i = pos; i < arr.length - 1 ; i++) {
//                arr[i] = arr[i + 1];
//            }
//        }
//        return size - 1;
    }
}

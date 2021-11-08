public class Min {
    public static void main(String[] args) {
        int [] arr = {7,3,4,6,2,6,9,6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);



    }

//    public static int minValue ( int [] array) {
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[index]){
//                index = i;
//            }
//        }
//        return index;
//    }
}

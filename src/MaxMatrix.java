import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng 2 chiều : ");
        System.out.println("Nhập vào số cột của mảng 2 chiều : ");

        int row = input.nextInt(); // dòng
        int col = input.nextInt(); // cột

        int [] [] array = new int[row] [col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử thứ [" + i + " , " + j + "]:");
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Mảng 2 chiều bạn vừa nhập : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là :");
        int max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println(max);
        System.out.println("Ở vị trí : " + indexRow + indexCol);
    }
}

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String [] students = {"Trang", "Huệ", "Nhi", "Lan", "Hương", "Quỳnh"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên bạn gái cần tìm : ");
        String name = input.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Bạn gái bạn ở vị trí thứ " + i);
                check = true;
                break;
            }
        }if (check == false){
            System.out.println("Ra chỗ khác tìm bạn gái nhé");
        }
    }
}

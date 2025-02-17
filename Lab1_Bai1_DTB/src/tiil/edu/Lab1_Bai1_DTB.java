package tiil.edu;

import java.util.Scanner;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        while (!scanner.hasNextDouble()) { // Kiểm tra nếu không nhập đúng số thực
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next(); // Bỏ qua dữ liệu nhập sai
        }
        double diemTB = scanner.nextDouble();
        
        // Xuất kết quả ra màn hình
        System.out.printf("%s %.2f điểm%n", hoTen, diemTB);

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}

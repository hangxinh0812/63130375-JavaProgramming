package tiil.edu;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        while (!scanner.hasNextDouble() || (scanner.hasNextDouble() && scanner.nextDouble() <= 0)) {
            System.out.println("Vui lòng nhập một số hợp lệ (lớn hơn 0)!");
            scanner.next();
        }
        double canh = scanner.nextDouble();

        // Tính thể tích theo công thức V = a^3
        double theTich = Math.pow(canh, 3);

        // Xuất kết quả
        System.out.printf("Thể tích của khối lập phương: %.2f%n", theTich);

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}

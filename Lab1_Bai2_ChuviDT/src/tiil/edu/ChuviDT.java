package tiil.edu;

import java.util.Scanner;

public class ChuviDT {
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập hai cạnh của hình chữ nhật
        System.out.print("Nhập cạnh thứ nhất: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ hai: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        double b = scanner.nextDouble();

        // Tính chu vi, diện tích, cạnh nhỏ nhất
        double chuVi = 2 * (a + b);
        double dienTich = a * b;
        double canhNho = Math.min(a, b);

        // Xuất kết quả
        System.out.println("\nKết quả:");
        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f%n", canhNho);

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}

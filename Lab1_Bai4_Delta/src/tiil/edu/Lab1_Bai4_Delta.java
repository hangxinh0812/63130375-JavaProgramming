package tiil.edu;

import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a
        System.out.print("Nhập hệ số a: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        double a = scanner.nextDouble();

        // Nhập hệ số b
        System.out.print("Nhập hệ số b: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        double b = scanner.nextDouble();

        // Nhập hệ số c
        System.out.print("Nhập hệ số c: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập một số hợp lệ!");
            scanner.next();
        }
        double c = scanner.nextDouble();

        // Tính Delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Tính căn Delta (nếu Delta >= 0)
        double canDelta = (delta >= 0) ? Math.sqrt(delta) : Double.NaN;

        // Xuất kết quả
        System.out.printf("Delta: %.2f%n", delta);
        if (!Double.isNaN(canDelta)) {
            System.out.printf("Căn Delta: %.2f%n", canDelta);
        } else {
            System.out.println("Delta âm, không thể tính căn Delta!");
        }

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}

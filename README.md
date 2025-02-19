/**
 * Chương trình nhập họ tên sinh viên và điểm trung bình, sau đó xuất ra màn hình.
 */
package tiil.edu;

import java.util.Scanner;

/**
 * @author GAMING-PC
 */
public class DTB {
    
    /**
     * Phương thức main() - Điểm vào của chương trình
     * @param args
     */
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất kết quả ra màn hình
        System.out.printf("%s %.2f điểm\n", hoTen, diemTB);

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
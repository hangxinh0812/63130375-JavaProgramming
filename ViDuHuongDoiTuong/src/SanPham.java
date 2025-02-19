public class SanPham {
    // Định nghĩa các thuộc tính
    int maSP;
    String tenSP;
    String loaiSP;
    String anhSP; // Tên file ảnh

    // Hàm tạo mặc định
    public SanPham() {
        // Khởi tạo giá trị ban đầu cho các thuộc tính nếu có
    }

    // Hàm tạo có tham số
    public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.anhSP = anhSP;
    }

    // Getter và Setter
    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    
    }
    @Override
    public String toString() {
        return "Mã SP: " + maSP + "\nTên SP: " + tenSP + "\nLoại SP: " + loaiSP + "\nẢnh SP: " + anhSP + "\n";
    }
}
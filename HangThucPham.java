import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public HangThucPham(String maHang) throws Exception {
        if (maHang.trim().equals("")) {
            throw new Exception("Lỗi: Mã hàng rỗng!");
        }
        this.maHang = maHang;
        this.tenHang = "xxx";
        this.donGia = 0.0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = ngaySanXuat;
    }

    private HangThucPham() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (!tenHang.trim().equals("")) {
            this.tenHang = tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        }
    }

    // Phương thức kiểm tra hàng thực phẩm đã hết hạn chưa
    public boolean hetHan() {
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
}

// Phương thức toString trả về thông tin của hàng thực phẩm
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngaySanXuatStr = dtf.format(ngaySanXuat);
        String ngayHetHanStr = dtf.format(ngayHetHan);
        String donGiaStr = df.format(donGia);
        String ketQua = "Mã hàng: " + maHang + "\n";
        ketQua += "Tên hàng: " + tenHang + "\n";
        ketQua += "Đơn giá: " + donGiaStr + "\n";
        ketQua += "Ngày sản xuất: " + ngaySanXuatStr + "\n";
        ketQua += "Ngày hết hạn: " + ngayHetHanStr + "\n";
        ketQua += hetHan() ? "Đã hết hạn\n" : "Chưa hết hạn\n";

        return ketQua;
    }
    
    public class TestHangThucPham {
    public static void main(String[] args) {
        HangThucPham hang1 = new HangThucPham();
        HangThucPham hang2 = new HangThucPham();
        HangThucPham hang3 = new HangThucPham();

        System.out.println(hang1.toString());
        System.out.println(hang2.toString());
        System.out.println(hang3.toString());
    }
  }
}

package buoith1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1a{
    private String tenChuXe;
    private String loaiXe;
    private int dungTichXYLanh;
    private double triGia;

    public Bai1a(String tenChuXe, String loaiXe, int dungTichXYLanh, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTichXYLanh = dungTichXYLanh;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTichXYLanh() {
        return dungTichXYLanh;
    }

    public void setDungTichXYLanh(int dungTichXYLanh) {
        this.dungTichXYLanh = dungTichXYLanh;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    
    public double tinhthuePhaiNop() {
    double thuePhaiNop = 0;
    if (dungTichXYLanh < 100) {
        thuePhaiNop = triGia * 0.01;
    } else if (dungTichXYLanh >= 100 && dungTichXYLanh <= 200) {
        thuePhaiNop = triGia * 0.03;
    } else if (dungTichXYLanh > 200) {
        thuePhaiNop = triGia * 0.05;
    }
    return thuePhaiNop;
    
}
    
    
        public void hienThiThongTinpt() {
        System.out.printf("Tên chủ xe: %s; Loại xe: %s; Dung tích: %d; Trị giá: %.2f; Thuế phải nộp: %.2f\n",
                tenChuXe, loaiXe, dungTichXYLanh, triGia, tinhthuePhaiNop());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Vehicle xe1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000.00);
        Vehicle xe2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000.00);
        Vehicle xe3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000.00);
        
        int choice;
        do {
            System.out.println("Chọn công việc:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập thông tin cho xe 1:");
                scanner.nextLine();
                System.out.print("Tên chủ xe: ");
                xe1.settenChuXe(scanner.nextLine());
                System.out.print("Loại xe: ");
                xe1.setloaiXe(scanner.nextLine());
                System.out.print("Dung tích: ");
                xe1.setdungTichXYLanh(scanner.nextInt());

                System.out.println("Nhập thông tin cho xe 2:");
                scanner.nextLine();
                System.out.print("Tên chủ xe: ");
                xe2.settenChuXe(scanner.nextLine());
                System.out.print("Loại xe: ");
                xe2.setloaiXe(scanner.nextLine());
                System.out.print("Dung tích: ");
                xe2.setdungTichXYlanh(scanner.nextInt());

                System.out.println("Nhập thông tin cho xe 3:");
                scanner.nextLine();
                System.out.print("Tên chủ xe: ");
                xe3.settenChuXe(scanner.nextLine());
                System.out.print("Loại xe: ");
                xe3.setloaiXe(scanner.nextLine());
                System.out.print("Dung tích: ");
                xe3.setdungTichXYLanh(scanner.nextInt());
                break;
            case 2:
                System.out.println("Bảng kê khai tiền thuế trước bạ của các xe:");
                xe1.hienThiThongTinpt();
                xe2.hienThiThongTinpt();
                xe3.hienThiThongTinpt();
                break;
            case 3:
                System.out.println("Kết thúc chương trình!");
                break;
            default:
                System.out.println("Sai lựa chọn, vui lòng chọn lại.");
                break;
        }
    } while (choice != 3);
        
        scanner.close();
    }
}
        

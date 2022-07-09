package exercise.oop.bai1;

import java.util.Scanner;

public class SinhVien {

    private String maSV;
    private String tenSV;
    private String diaChi;
    private String soDienThoai;
    private float diemToan;
    private float diemHoa;
    private float diemLy;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String diaChi, String soDienThoai, float diemToan, float diemHoa, float diemLy) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemLy = diemLy;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        if (diemToan < 0 || diemToan > 10) {
            diemToan = 0;
        }
        this.diemToan = diemToan;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        if (diemHoa < 0 || diemHoa > 10) {
            diemHoa = 0;
        }
        this.diemHoa = diemHoa;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        if (diemLy < 0 || diemLy > 10) {
            diemLy = 0;
        }
        this.diemLy = diemLy;
    }

    public void xuat() {
        System.out.println("SinhVien{" +
                "maSV='" + getMaSV() + '\'' +
                ", tenSV='" + getTenSV() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", soDienThoai='" + getSoDienThoai() + '\'' +
                ", diemToan='" + getDiemToan() + '\'' +
                ", diemHoa='" + getDiemHoa() + '\'' +
                ", diemLy='" + getDiemLy() + '\'' +
                '}');
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        setMaSV(scanner.nextLine());
        System.out.println("Nhập tên sinh viên: ");
        setTenSV(scanner.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        setDiaChi(scanner.nextLine());
        System.out.println("Nhập số điện thoại sinh viên: ");
        setSoDienThoai(scanner.nextLine());
        System.out.println("Nhập diểm toán sinh viên: ");
        setDiemToan(scanner.nextFloat());
        System.out.println("Nhập điểm hoá sinh viên: ");
        setDiemHoa(scanner.nextFloat());
        System.out.println("Nhập diểm lí sinh viên: ");
        setDiemLy(scanner.nextFloat());
    }

    public float diemTrungBinh() {
        return (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }

    public String xepLoai() {
        float dtb = diemTrungBinh();
        if (dtb >= 9) {
            return ("Xuat Sac");
        } else if (dtb > 9 && dtb <= 8) {
            return ("Gioi");
        } else if (dtb > 8 && dtb <= 7) {
            return ("Kha");
        } else if (dtb > 7 && dtb <= 6) {
            return ("TB Kha");
        } else if (dtb > 6 && dtb <= 5) {
            return ("TB");
        } else {
            return ("Yeu");
        }
    }
}

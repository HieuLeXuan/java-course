package exercise.oop.bai1.main;

import exercise.oop.bai1.SinhVien;

public class Main {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
        System.out.println("Điểm trung bình của sinh viên: " + sv.diemTrungBinh());
        System.out.println("Sinh viên này xếp hạng: " + sv.xepLoai());
    }

}

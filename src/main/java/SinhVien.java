import java.util.Scanner;

public class SinhVien extends Person {
    String typeSV;

    public SinhVien(String name, String gioiTinh, String address, String typeSV) {
        super(name, gioiTinh, address);
        this.typeSV = typeSV;
    }

    public SinhVien() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập loại sv:");
        typeSV = scanner.nextLine();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("loại sv" + typeSV);
    }
}

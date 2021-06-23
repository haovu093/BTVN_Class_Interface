import java.util.Scanner;

public class NhanVien extends Person {
    String typeNV;

    public NhanVien(String name, String gioiTinh, String address, String typeNV) {
        super(name, gioiTinh, address);
        this.typeNV = typeNV;
    }

    public NhanVien() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập loại nv:");
        typeNV = scanner.nextLine();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("loại nv" + typeNV);
    }
}

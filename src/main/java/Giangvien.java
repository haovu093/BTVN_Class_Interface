import java.util.Scanner;

public class Giangvien extends Person {

    String typeGV;

    public Giangvien(String name, String gioiTinh, String address, String typeGV) {
        super(name, gioiTinh, address);
        this.typeGV = typeGV;
    }

    public Giangvien() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập loại giảng vên: ");
        typeGV = scanner.nextLine();

    }

    @Override
    public void show() {
        super.show();
        System.out.println("Loại gv" + typeGV);
    }
}


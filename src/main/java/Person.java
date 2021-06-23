import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    String name;
    String gioiTinh;
    String address;
    Scanner scanner = new Scanner(System.in);

    public Person(String name, String gioiTinh, String address) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.address = address;
    }

    public Person(){
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void nhap() {
        System.out.print("Nhập họ tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        address = scanner.nextLine();
    }

    public void show() {
        System.out.println("Họ tên: " + name);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Quê quán: " + address);
    }
}

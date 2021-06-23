import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public  static  void  main(String args[]){
        ArrayList<Person> arrayList= new ArrayList<>();
        Person ps=null;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng Giảng viên:");
        n = sc.nextInt();
        for ( int i =0; i<n ;i++)
        {
            System.out.println("Nhập thông tin Gv thứ "+ i);
            ps=new Giangvien();
            ps.nhap();
            arrayList.add(ps);
        }
        System.out.println("Nhập số lượng sinh viên");
        n = sc.nextInt();
        for ( int i =0; i<n ;i++)
        {
            System.out.println("Nhập thông tin sv thứ "+ i);
            ps=new SinhVien();
            ps.nhap();
            arrayList.add(ps);
        }
        System.out.println("Nhập số lượng nhân viên");
        n = sc.nextInt();
        for ( int i =0; i<n ;i++)
        {
            System.out.println("Nhập thông tin nv thứ "+ i);
            ps=new NhanVien();
            ps.nhap();
            arrayList.add(ps);
        }

        System.out.println("Hiển thị danh sách cán cán bộ trong trường: ");
        for (Person cb : arrayList) {
            System.out.println(cb.toString());
        }
    }
}

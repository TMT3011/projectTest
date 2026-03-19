import java.util.Scanner;

public class testgit{
    public static void main(String arg[]){
        System.out.println("Hello GIT");
        int a, b;
        Scanner kb=new Scanner(System.in);
        System.out.println("Nhap vao a:");
        a=kb.nextInt();
        System.out.println("Nhap vao b:");
        b=kb.nextInt();
        System.out.println("Tong a va b la: "+(a+b));
    }
}
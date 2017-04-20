
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lekimloitcu
 */
public class giaiptbac1 {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất:");
        Scanner sc=new Scanner(System.in);
   int a=0, b=0;
   System.out.println("nhập a:");
   a=sc.nextInt();
   System.out.println("nhập b:");
   b=sc.nextInt();
        String kq="";
        if (a==0) {
           if (b==0) kq="PT vô số nghiệm";
           else kq="PT vô nghiêm";
        }
        else{
        double x=-b*1.0/a;
        kq="PT có nghiệm x=" +x;
        }
        System.out.println("Phương trình "+a +".x+"+b+"=0");
        System.out.println(kq);
        
        
    }
    
}

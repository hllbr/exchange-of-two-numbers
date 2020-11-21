
package change;

import java.util.Scanner;


public class change {
    public static void main(String[] args) {
        //kullanıcıdan aldığımız 2 sayının değerini değiştirme
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Birinci sayıyı giriniz :");
        int a = scn.nextInt();
        
        System.out.println("ikinci sayıyı giriniz : ");
        int b = scn.nextInt();
        System.out.println("sayılıarınız yer değiştiriliyor......");
        int c = a;
        a = b ;
        b = c ; 
        System.out.println("ilk sayımızın yeni değeri : "+a);
        System.out.println("ikinci sayımızın yeni değeri : " +b);
    }
    
}

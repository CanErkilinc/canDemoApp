package denklem;

import java.util.Scanner;

public class DenklemOdev {
    public void denklemDemoApp() {

        // x > 0 , y < 0 ise f(x,y) = 4x +2y +4
        // x > 0 , y =0 ise f(x,y) = 2x - y - 3
        // x < 0 , y > 0 ise f(x,y) = 3x + 4y +3

        Scanner scanner=new Scanner(System.in);
        System.out.println("x degerini giriniz:   ");
        int x= scanner.nextInt();

        System.out.println("y degerini giriniz:   ");
        Scanner scanner=new Scanner(System.in);
        int y= scanner.nextInt();
        int sonuc=0;

        if (x>0 && y<0) {
            sonuc=(4*x)+(2*y)+4;
            System.out.println("f(x,y)= "+sonuc);
        }
        else if (x>0 && y==0)
        {
            sonuc=(2*x)-y-3;
            System.out.println("f(x,y)= "+sonuc);
        }
        else if (x<0 && y>0)
        {
            sonuc=(3*x)+(4*y)+3;
            System.out.println("f(x,y)= "+sonuc);
        }

    }


}

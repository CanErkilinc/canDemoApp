package nothesapp;

import java.util.Scanner;

public class SwitchCase {
    public void switchCase(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int not = scanner.nextInt();

        switch (not/10)
        {

            case 10:
                System.out.println("Notunuz: AA");
                break;

            case 9:
                System.out.println("Notunuz: AA");
                break;

            case 8:
                System.out.println("Notunuz: BA");
                break;

            case 7:
                System.out.println("Notunuz: BB");
                break;

            case 6:
                System.out.println("Notunuz: CB");
                break;

            case 5:
                System.out.println("Notunuz: CC");
                break;

            case 4:
                System.out.println("Notunuz: DC");
                break;

            case 3:
                System.out.println("Notunuz: DD");
                break;

            case 2:
                System.out.println("Notunuz: FD");
                break;

            case 1:
                System.out.println("Notunuz: FF");
                break;

        }

    }
}

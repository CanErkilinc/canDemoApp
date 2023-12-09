package nothesap;

import java.util.Scanner;

      public class ElseIf {
            public void elseifDepoApp(){

                //90 ve üzeri AA
                // 80-90 arası BA
                // 70-79 arası BB
                // 60-69 arası CB
                // 50-59 arası CC
                // 50 den kücük FF

                Scanner s= new Scanner(System.in);
                System.out.println("Notunuzu Giriniz: ");

                int i = s.nextInt();
                if (i>=90){
                    System.out.println("Notunuz: AA");
                }
                else if (i>=80 && i<90){
                    System.out.println("Notunuz: BA");
                }
                else if (i>=70 && i<80){
                    System.out.println("Notunuz: BB");
                }
                else if (i>=60 && i<70) {
                    System.out.println("Notunuz : CB");
                }
                else if (i>=50 && i<60) {
                    System.out.println("Notunuz : CC");
                }
                else if (i<50 && i>=0) {
                    System.out.println("Notunuz : FF");
                }


            }

          }

package fordongusuu;

public class ForDongusuDemo {
    public ForDongusuDemo(){
    }
    public void forOzellikleri() {
        System.out.println("\n\n");

        /*

        for (baslangıc ; durum ; arttirma) { //kodlar  }

         */

        // okunuşu: int türünde i adı altında başlangıcı 1 olan bir değişken tanımla
        // i<5 olduğu sürece her döngü sonunda i'yi 1 arttır.

        // i++ = önce i'yi işlemde kullan sonra bir arttır demektir

        for (int i=1; i<5; i++) {

            System.out.println(i);
        }

        System.out.println("\n\n");


        // okunuşu:


        int k = 1;
        System.out.println(++k);

        for (int o=1; o<=10; ++o){
            System.out.println(o);

        }




    }
}



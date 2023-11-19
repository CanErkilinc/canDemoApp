package degiskenler;

public class TumDegiskenler {
    public void degiskenOzellikleri() {

    // değişkenleri öğrenelim
        /* değişkenler: bir veri için bellekte ayırdığımız alandır
        yani bellekte bir veriyi tutmak için bir alan oluşturmaktır */


    // int ingilizcede tam sayı demektir.
    // -2 üssü 31 ile +2 üssü 31 arası bütün sayıları tutar.
    // Bellekte 4 byte yer açar.

    int sayi = 12; // şuan bellekte bir alan oluşturduk
        System.out.println(sayi); //yazdırırken parantez içine çift tırnak değişkenleerde kullanılmaz !


    // Diğer verimiz "String" veri tipi
    // Metinsel ifadeleri tutmak için kullanılır harf, sayı, paragraf tarzı şeyler.

    String yazi = "Merhaba, ben Can"; // String çift tırnak içinde kullanılır
        System.out.println(yazi);

    String TCkimlik = "12345678910";
        System.out.println(TCkimlik);


    // Değişkenler bir nevi bellekte tasarruflu olunması için kullanılıyor.



    // bir diğer değişkenimiz "byte"
    // -128 ile +127 sayılarını tutabiliyor
    // Bellekte 1 byte yer açıyor
    // Yazılımda türkçe karakter kullanmamaya dikkat et!

    byte kucukSayi = 120;  // şuanda bellekte 1bytlık küçükSayi isminde yer açıp içine 120 verisini attık
        System.out.println(kucukSayi);




    //şimdi de "short"
    // byte dan biraz daha büyük bir yer açan veri tabanı
    // -32768 ile +32767 arasında değerleri tutar
    // Bellekte 2 byte lık yer ayırır

    short buyukSayi = 32000;
        System.out.println(buyukSayi);



    // şimdi de en çok kullanacağımız veri tipi "int"
    // - 2 milyar küsür ile +2 milyar küsür sayı verisi tutar.
    // Bellekte 4byte yer tutar.

    int genelsayi = 123345;
        System.out.println(genelsayi);



    // int de yetersiz kalırsa "long" değeri kullanılır
    // -2 üssü 63 ile +2 üssü 63 arası sayılar tutar bellekte 8 byte yer tutar

    long cokbuyuksayi = 454;
        System.out.println(cokbuyuksayi);  // herhangi birinde sınır aşılırsa hata verir !



    // bu veriler tam sayı için şimdi de kesirli sayılar ondalıklı sayılar için kullanılan veriye bakalım.

    // "double" ondalıklı kesirli sayılarda kullanılır.

    double oran = 14.3;
        System.out.println(oran);



    // herhangi bir karakteri tutmak için de "char" yani karakter verisi kullanılır.

    char karakter = '?';               // string gibi metinsel olmuyor bunda 1 şey yapabilirsin
        System.out.println(karakter);

    // bunlar java programlama dilinde ilkel değişkenlerdir.

        System.out.println("caliskan");

}
    }


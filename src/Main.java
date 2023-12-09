import carpim.CarpimTablosu;
import degiskenler.TumDegiskenler;
import denklem.FonksiyonDenklem;
import fibonacci.FibonacciSerisi;
import fordongusuu.ForDongusuDemo;
import nothesap.ElseIf;
import nothesapp.SwitchCase;


public class Main {

    public static void main(String[] args) {
        TumDegiskenler tumDegiskenler=new TumDegiskenler();
        tumDegiskenler.degiskenOzellikleri();
        FibonacciSerisi fibonacciSerisi=new FibonacciSerisi();
        fibonacciSerisi.fibonacciOzellikleri();
        ForDongusuDemo forDongusuu=new ForDongusuDemo();
        forDongusuu.forOzellikleri();
        CarpimTablosu carpimTablosu=new CarpimTablosu();
        carpimTablosu.carpimtablosuOzellikleri();
        ElseIf elseIF=new ElseIf();
        elseIF.elseifDepoApp();
        FonksiyonDenklem denklemOdev=new FonksiyonDenklem();
        denklemOdev.denklemDemoApp();
        SwitchCase notHesap=new SwitchCase();
        notHesap.switchCase();

}}

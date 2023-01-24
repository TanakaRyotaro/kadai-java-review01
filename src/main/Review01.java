package main;
public class Review01 {
    public static void main(String[] args) {
        int a=1500;
        int gokei;
        int zei = tax(a);
        gokei=a+zei;

        System.out.println(a + "円の商品の税込価格は"+gokei+"円（消費税は"+(int)zei+"円）です。");
    }
    public static int tax(int a) {
        double zei =  a*0.1;
        return(int) zei;
    }
}
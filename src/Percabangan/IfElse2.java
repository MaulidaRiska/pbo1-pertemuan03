package Percabangan;

public class IfElse2 {
    public static void main(String[] args) {
        double TotalBelanja = 976200;
        double YangDiBayar  = 1000000;

        if(YangDiBayar<TotalBelanja){
            System.out.println("Uang Anda Kurang, Kurangi Belanjaan Anda");
        }else if(YangDiBayar>TotalBelanja){
            double angsul = YangDiBayar-TotalBelanja;
            System.out.println("Uang Anda Cukup, Angsul: "+angsul);
        }else{
            System.out.println("Uang Anda Pas Yey!!!");

        }
    }
}

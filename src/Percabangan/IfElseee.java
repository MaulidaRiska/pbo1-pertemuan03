package Percabangan;

public class IfElseee {
        public static void main(String[] args) {
            double TotalBelanja = 976200;
            double YangDiBayar  = 972000;

            if (YangDiBayar < TotalBelanja) {
                System.out.println("Uang Anda Kurang, Inget Nabung Ya Kak");
            } else if (YangDiBayar > TotalBelanja) {
                double angsul = YangDiBayar - TotalBelanja;
                System.out.println("Uang Anda Cukup, Angsul: " + angsul);
            } else {
                System.out.println("Uang Anda Pas, Trimakasuh Udah Belanja!!!");

            }
        }
}

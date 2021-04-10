package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    // i tadinya 0 di tambah 1 sehingga i = 1
        System.out.println(i);  // i nilainya 1
        i++;                    // Karna i tadi sudah bernilai 1 sekarang di tambah 1 lagi jadi bernilai 2
        System.out.println(i);  // i nilainya 2
        i=i+1;                  // Bisa di lihat i++ sama dengan i=i+1
        System.out.println(i);  // i di tambah 1 lagi jadi bernilai 3

        //Berlaku juga untuk penambahan angka lain danoperator aritmatika lain
        i+=3; //sama dengan i = i+3
        System.out.println(i);

        i+=3; //sama dengan i = i+3
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

    }
}

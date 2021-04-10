package Percabangan;

public class SwitchCaseChar {
    public static void main(String[] args) {
        char Kelas='B';
        switch (Kelas){
            case 'A':
                System.out.println("Selamat Datang Di Musium Lukisan");
                System.out.println("Silahkan Berkeliling Musium ");
                break;
            case 'B':
                System.out.println("Selamat Datang Di Musium Kemerdekaan");
                System.out.println("Silahkan Berkeliling Musium ");
                break;
            case 'C':
                System.out.println("Selamat Datang Di Musium Lagu");
                System.out.println("Silahkan Berkeliling Musium ");
                break;
            case 'D':
                System.out.println("Selamat Datang Di Musium Makanan");
                System.out.println("Silahkan Berkeliling Musium ");
                break;
            default:
                System.out.println("Yuk Kak Beli Tiket Ke Musium Online ");
                System.out.println("Nikmati Waktu Libur Mu");
                break;

        }
    }
}


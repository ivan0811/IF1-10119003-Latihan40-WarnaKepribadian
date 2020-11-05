package com.ivanfaathirza.warnakepribadian;

import java.util.Scanner;

public class User {
    Scanner scan = new Scanner(System.in);
    private String namaUser, warnaUser;

    public void masukkanNama(){
        System.out.print("NAMA KAMU : ");
        namaUser = scan.next();
    }

    public void masukkanWarna(){
        Warna warna = new Warna();
        String foreground = warna.foreground;
        String background = warna.background;
        String netral = warna.netral;
        String merah = warna.merah;
        String hijau = warna.hijau;
        String kuning = warna.kuning;
        String cyan = warna.cyan;
        String ungu = warna.ungu;
        String biru = warna.biru;
        String putih = warna.putih;
        Scanner scan = new Scanner(System.in);
        System.out.println(foreground.concat(merah).concat("YUK ")
                .concat(foreground).concat(hijau).concat("CEK ")
                .concat(foreground).concat(kuning).concat("KEPRIBADIANMU ")
                .concat(foreground).concat(cyan).concat("DARI ")
                .concat(foreground).concat(ungu).concat("WARNA ")
                .concat(foreground).concat(biru).concat("FAVORITMU\n"));

        System.out.println(background.concat(merah).concat("\t\t").concat(foreground)
                .concat(putih).concat("MERAH").concat("\t\t").concat(netral));
        System.out.println(background.concat(hijau).concat("\t\t")
                .concat(foreground).concat(putih).concat("HIJAU").concat("\t\t").concat(netral));
        System.out.println(background.concat(kuning).concat("\t\t")
                .concat(foreground).concat(putih).concat("KUNING").concat("\t\t").concat(netral));
        System.out.println(background.concat(biru).concat("\t\t")
                .concat(foreground).concat(putih).concat("BIRU").concat("\t\t").concat(netral));
        System.out.println(background.concat(ungu).concat("\t\t")
                .concat(foreground).concat(putih).concat("UNGU").concat("\t\t").concat(netral));

        System.out.print("\nPILIH WARNA FAVORITMU : ");
        warnaUser = scan.next().toUpperCase();
    }

    public void menentukanKepribadian(){
        Kepribadian kepribadian = new Kepribadian();
        kepribadian.mencariKepribadian(warnaUser, namaUser);
    }
}

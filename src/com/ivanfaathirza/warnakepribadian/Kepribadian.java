package com.ivanfaathirza.warnakepribadian;

public class Kepribadian {
    private final String kepribadianMerah = "1. Periang,\n" +
                                "2. Pemberani,\n" +
                                "3. Berani mengambil risiko dalam setiap langkah,\n" +
                                "4. Menyukai tantangan,\n" +
                                "5. Kurang sabar,\n" +
                                "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,\n" +
                                "7. memiliki energi kehangatan dan cinta.";
    private final String kepribadianBiru = "1. Menyenangkan,\n" +
                                "2. Bijaksana,\n" +
                                "3. Pembawaan diri tenang saat menghadapi masalah,\n" +
                                "4. Dinamis,\n" +
                                "5. Senang berbagi,\n" +
                                "6. Bersahabat,\n" +
                                "7. Tidak terlalu suka menjadi sorotan banyak orang,\n" +
                                "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.";
    private final String KepribadianKuning = "1. Optimis,\n" +
                                "2. Suka bergaul,\n" +
                                "3. Periang,\n" +
                                "4. Senang menolong,\n" +
                                "5. Lincah dan aktif,\n" +
                                "6. Tidak suka meremehkan kekurangan orang lain,\n" +
                                "7. Loyal,\n" +
                                "8. Hangat,\n" +
                                "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n" +
                                "10. Cenderung penakut.";
    private final String kepribadianUngu = "1. Optimis,\n" +
                                "2. Tidak pernah ragu,\n" +
                                "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,\n" +
                                "4. Memiliki ambisi yang benar,\n" +
                                "5. Memiliki empati yang besar,\n" +
                                "6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,\n" +
                                "7. Terkadang bersikap keras kepala dan angkuh.";
    private final String kepribadianHijau =  "1. Romantis,\n" +
                                "2. Menyukai hal yang berbau alami dan keindahan,\n" +
                                "3. Teguh pada prinsip,\n" +
                                "4. Menginginkan kesempurnaan,\n" +
                                "5. Mudah cemburu,\n" +
                                "6. Mudah merasa iri,\n" +
                                "7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan.";

    public void mencariKepribadian(String warnaUser, String namaUser){
        Warna objWarna = new Warna();
        String foreground = objWarna.foreground;
        String netral = objWarna.netral;
        String merah = objWarna.merah;
        String hijau = objWarna.hijau;
        String kuning = objWarna.kuning;
        String ungu = objWarna.ungu;
        String biru = objWarna.biru;

        String hasilWarna = "Warna Favoritmu adalah ".concat(foreground);
        switch (warnaUser) {
            case "MERAH" -> hasilWarna += String.join("", merah, "MERAH", netral.concat("\n"), kepribadianMerah);
            case "BIRU" -> hasilWarna += String.join("", biru, "BIRU", netral.concat("\n"), kepribadianBiru);
            case "HIJAU" -> hasilWarna += String.join("", hijau, "HIJAU", netral.concat("\n"), kepribadianHijau);
            case "KUNING" -> hasilWarna += String.join("", kuning, "KUNING", netral.concat("\n"), KepribadianKuning);
            case "UNGU" -> hasilWarna += String.join("", ungu, "UNGU", netral.concat("\n"), kepribadianUngu);
            default -> hasilWarna = "Oops.. Belum teridentifikasi";
        }
        tampilKepribadian(hasilWarna, namaUser);
    }

    public void tampilKepribadian(String warna, String nama){
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
        System.out.println(warna);
    }
}

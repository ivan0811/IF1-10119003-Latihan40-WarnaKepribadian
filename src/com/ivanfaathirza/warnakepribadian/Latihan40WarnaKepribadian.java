package com.ivanfaathirza.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk mencari kepribadian berdasarkan warna dari masukkan user, berbasis objek dengan 
 * instansiasi objek user
 */

public class Latihan40WarnaKepribadian {
    public static void main(String[] args) {
        User user = new User();
        user.masukkanWarna();
        user.masukkanNama();
        user.menentukanKepribadian();
        System.out.println("Developed by : Ivan Faathirza");
    }
}

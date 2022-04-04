package com.uts.prakrplbo;

public class Apel extends Buah {
    private static final int harga = 3000;

    public Apel(){
        super("Apel", harga);
    }

    public static int getHarga(){
        return harga;
    }

}

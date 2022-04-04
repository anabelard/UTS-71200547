package com.uts.prakrplbo;

public class Mangga extends Buah {
    private static final int harga = 2000;

    public Mangga(){
        super("Mangga", harga);
    }

    public static int getHarga(){
        return harga;
    }

}

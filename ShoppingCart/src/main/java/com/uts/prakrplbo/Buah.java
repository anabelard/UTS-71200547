package com.uts.prakrplbo;

public class Buah {
    private String nama;
    private final int jumlah = 1;
    private int harga;

    public Buah(){
        this.nama = "";
        this.harga = 0;
    }

    public Buah(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }


}

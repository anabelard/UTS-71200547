package com.rplbo.utstokosedia;

public class Produk {
    private String namaProduk;
    private long harga;

    public Produk(String namaProduk, long harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public long getHarga(){
        return this.harga;
    }

    public String getNamaProduk(){
        return this.namaProduk;
    }
}

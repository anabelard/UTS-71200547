package com.rplbo.utstokosedia;

public class Member {
    private String alamat;
    private String nama;
    private Dompet dompet;

    public Member(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void cekSaldo(){

    }

    public void bayar(long harga){

    }

    public String getNama(){
        return this.nama;
    }

    public void topUp(long ){

    }
}

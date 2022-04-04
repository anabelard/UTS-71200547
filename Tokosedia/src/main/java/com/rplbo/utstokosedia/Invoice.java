package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public Invoice(){

    }

    public void printInvoice(){

    }

    public long getTagihan(){
        return this.tagihan;
    }

    public void buatInvoice(Produk produk, int jumlah, Member member){
        this.produk = produk;
        this.jumlah = jumlah;
        this.member = member;
    }
}

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

    public void bayar(long tagihan){
        if(tagihan>0){
            dompet.setSaldo(dompet.getSaldo()+tagihan);
            System.out.println("Top up sukses");
        }
        else{
            System.out.println("Top up gagal");
        }

    }

    public String getNama(){
        return this.nama;
    }

    public void topUp(long nominal){
        if(nominal>0){
            dompet.setSaldo(dompet.getSaldo()+nominal);
            System.out.println("Top up sukses");
        }
        else{
            System.out.println("Top up gagal");
        }
    }

}

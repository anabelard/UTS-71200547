package com.uts.prakrplbo;

import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah;

    public void tambahProduk(Buah buah){
        this.daftarBuah.add(buah);
        System.out.println(this.daftarBuah);
    }

    public void hapusProduk(Buah buah){
        this.daftarBuah.remove(buah);
    }

    public void getKeranjang(){

    }
}

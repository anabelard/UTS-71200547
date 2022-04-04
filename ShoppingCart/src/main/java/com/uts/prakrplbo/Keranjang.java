package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah = new ArrayList<Buah>();

    public void tambahProduk(Buah buah){
        this.daftarBuah.add(buah);
        System.out.println(buah.getNama()+" berhasil ditambahkan ke dalam keranjang!");
    }

    public void hapusProduk(Buah buah){
        if(daftarBuah.contains(buah)){
            this.daftarBuah.remove(buah);
            System.out.println(buah.getNama()+" berhasil dikeluarkan dari dalam keranjang!");
        }
        else{
            System.out.println(buah.getNama()+" sudah tidak ada di dalam keranjang!");
        }
    }

    public void getKeranjang(){
        int jumlahmangga = Collections.frequency(daftarBuah, "Mangga");
        int jumlahapel = Collections.frequency(daftarBuah, "Apel");

        for (int i = 0; i < daftarBuah.size(); i++){
            String nama = daftarBuah.get(i).getNama();
            if(nama == "Mangga"){
                jumlahmangga+=1;
            }
            else if(nama == "Apel"){
                jumlahapel+=1;
            }
        }
        if(jumlahmangga > 0){
            System.out.println("Mangga ["+Mangga.getHarga()+"] x"+jumlahmangga);
        }
        if(jumlahapel > 0){
            System.out.println("Apel ["+Apel.getHarga()+"] x"+jumlahapel);
        }
        int Total = (jumlahapel*Apel.getHarga())+(jumlahmangga*Mangga.getHarga());
        System.out.println("Total : "+Total);
    }
}

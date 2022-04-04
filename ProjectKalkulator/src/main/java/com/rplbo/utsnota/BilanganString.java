package com.rplbo.utsnota;

public class BilanganString {
    private String bilanganString;
    private int bilangan;

    public BilanganString(String bilanganString){
        int bilanganInt = Integer.parseInt(bilanganString);
        this.bilangan = bilanganInt;
    }

    public int getBilangan(){
        return this.bilangan;
    }

    public boolean apakahDuaDigit(){

    }

    public boolean apakahLebihDari10(){

    }
}

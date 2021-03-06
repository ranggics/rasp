package com.cun.rasp.model;

public class DetailSapi {
    public static final String TABLE_NAME = "detail_sapi";
    public static final String COLUMN_ID = "kode";
    public static final String COLUMN_SAPI = "sapi";
    public static final String COLUMN_LEMAK_SUSU = "lemak_susu";
    public static final String COLUMN_perBB = "perBB";

    private int kode;
    private int sapi;
    private int lemak_susu;
    private int perBB;

    // Create table SQL query
    public static final String CREATE_TABLE_DETAIL_SAPI =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_SAPI + " INTEGER,"
                    + COLUMN_LEMAK_SUSU + " INTEGER,"
                    + COLUMN_perBB + " INTEGER,"
                    + "FOREIGN KEY (" + COLUMN_SAPI + ") REFERENCES " + "sapi" + "(kode),"
                    + "FOREIGN KEY (" + COLUMN_LEMAK_SUSU + ") REFERENCES " + "lemak_susu" + "(kode),"
                    + "FOREIGN KEY (" + COLUMN_perBB + ") REFERENCES " + "perBB" + "(kode)"
                    + ")";


    public DetailSapi() {
    }

    public DetailSapi(int kode, int sapi, int lemak_susu, int perBB) {
        this.kode = kode;
        this.sapi = sapi;
        this.lemak_susu = lemak_susu;
        this.perBB = perBB;
    }

    //getter
    public int getId() {
        return kode;
    }

    public int getSapi() {
        return sapi;
    }

    public int getLemakSusu() {
        return lemak_susu;
    }

    public int getperBB() {
        return perBB;
    }

    //setter
    public void setId(int kode) {
        this.kode = kode;
    }

    public void setSapi(int sapi) {
        this.sapi = sapi;
    }

    public void setLemakSusu(int lemak_susu) {
        this.lemak_susu = lemak_susu;
    }

    public void setperBB(int perBB) {
        this.perBB = perBB;
    }


}

package com.example.tugasakb;

import android.os.Parcel;
import android.os.Parcelable;


// Nama : Farhan Firman Firdaus
 // Kelas : IF 7
 // NIM : 10117235
 // tgl pengerjaan : 7 agustus - 12 agustus 2020

public class wisata implements Parcelable {
    //private String id;
     String judul;
     String alamat;
     int wisataImage;

    public wisata (String judul, String alamat, String detail_alamat){
        this.judul = judul;
        this.alamat = alamat;
        this.detail_alamat = detail_alamat;


    }
    protected wisata(Parcel in) {
        judul = in.readString();
        alamat = in.readString();
        detail_alamat = in.readString();

    }
    public static final Creator<wisata> CREATOR = new Creator<wisata>() {
        @Override
        public wisata createFromParcel(Parcel in) {
            return new wisata(in);
        }

        @Override
        public wisata[] newArray(int size) {
            return new wisata[size];
        }
    };

    public String getdetail_alamat() {
        return detail_alamat;
    }

    public void setDetail_alamat(String detail_alamat) {
        this.detail_alamat = detail_alamat;
    }

    private String detail_alamat;
    //private byte[] wisataImage;

    public int getWisataImage() {
        return wisataImage;
    }

    public void  setWisataImage(int wisataImage) {
        this.wisataImage = wisataImage;

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judul);
        dest.writeString(alamat);
        dest.writeString(detail_alamat);
    }
}

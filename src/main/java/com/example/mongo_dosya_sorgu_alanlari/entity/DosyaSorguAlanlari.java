package com.example.mongo_dosya_sorgu_alanlari.entity;

import jakarta.persistence.*;

@Entity
public class DosyaSorguAlanlari {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "kimlik_numarasi")
    private String kimlikNumarasi;

    @Column(name = "pasaport_numarasi")
    private String pasaportNumarasi;

    @Column(name = "vkn")
    private String vkn;

    @Column(name = "evtel")
    private String evTel;

    @Column(name = "ilkodu")
    private String ilKodu;

    public DosyaSorguAlanlari() {}

    public DosyaSorguAlanlari(Long id, String kimlikNumarasi, String pasaportNumarasi, String vkn, String evTel, String ilKodu) {
        this.id = id;
        this.kimlikNumarasi = kimlikNumarasi;
        this.pasaportNumarasi = pasaportNumarasi;
        this.vkn = vkn;
        this.evTel = evTel;
        this.ilKodu = ilKodu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public String getPasaportNumarasi() {
        return pasaportNumarasi;
    }

    public void setPasaportNumarasi(String pasaportNumarasi) {
        this.pasaportNumarasi = pasaportNumarasi;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public String getEvTel() {
        return evTel;
    }

    public void setEvTel(String evTel) {
        this.evTel = evTel;
    }

    public String getIlKodu() {
        return ilKodu;
    }

    public void setIlKodu(String ilKodu) {
        this.ilKodu = ilKodu;
    }
}

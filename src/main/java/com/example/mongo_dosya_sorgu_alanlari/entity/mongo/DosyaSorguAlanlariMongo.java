package com.example.mongo_dosya_sorgu_alanlari.entity.mongo;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class DosyaSorguAlanlariMongo {
    @Id
    private Long id;
    @Field
    private String kimlikNumarasi;
    @Field
    private String pasaportNumarasi;
    @Field
    private String vkn;
    @Field
    private String evTel;
    @Field
    private String ilKodu;

    public DosyaSorguAlanlariMongo() {
    }

    public DosyaSorguAlanlariMongo(Long id, String kimlikNumarasi, String pasaportNumarasi, String vkn, String evTel, String ilKodu) {
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

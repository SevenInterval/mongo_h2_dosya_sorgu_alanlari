package com.example.mongo_dosya_sorgu_alanlari.entity.mongo;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DosyaSorguAlanlariMongo {
    @Id
    private Long id;
    private String kimlikNumarasi;
    private String pasaportNumarasi;
    private String vkn;
    private String evTel;
    private String ilKodu;

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

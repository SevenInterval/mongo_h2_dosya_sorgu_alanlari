package com.example.mongo_dosya_sorgu_alanlari;

import com.example.mongo_dosya_sorgu_alanlari.entity.DosyaSorguAlanlari;
import com.example.mongo_dosya_sorgu_alanlari.repository.IDosyaSorguAlanlariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MongoDosyaSorguAlanlariApplication implements CommandLineRunner {

    @Autowired
    IDosyaSorguAlanlariRepository dosyaSorguAlanlariRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongoDosyaSorguAlanlariApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DosyaSorguAlanlari dosyaSorguAlanlari1 = new DosyaSorguAlanlari(1234L, "16034012326", "121415", "6431231231", "2122121212", "034");
        DosyaSorguAlanlari dosyaSorguAlanlari2 = new DosyaSorguAlanlari(1235L, "16034012327", "121416", "6431231232", "2122121213", "034");
        DosyaSorguAlanlari dosyaSorguAlanlari3 = new DosyaSorguAlanlari(1236L, "16034012328", "121417", "6431231233", "2122121214", "034");
        DosyaSorguAlanlari dosyaSorguAlanlari4 = new DosyaSorguAlanlari(1237L, "16034012329", "121418", "6431231234", "2122121215", "034");
        DosyaSorguAlanlari dosyaSorguAlanlari5 = new DosyaSorguAlanlari(1238L, "16034012330", "121419", "6431231235", "2122121216", "033");
        DosyaSorguAlanlari dosyaSorguAlanlari6 = new DosyaSorguAlanlari(1239L, "16034012331", "121415", "6431231232", "2122121214", "039");
        DosyaSorguAlanlari dosyaSorguAlanlari7 = new DosyaSorguAlanlari(1230L, "16034012332", "121414", "6431231232", "2122121213", "038");
        DosyaSorguAlanlari dosyaSorguAlanlari8 = new DosyaSorguAlanlari(1231L, "16034012326", "121416", "6431231234", "2122121214", "037");
        DosyaSorguAlanlari dosyaSorguAlanlari9 = new DosyaSorguAlanlari(1232L, "16034012327", "121417", "6431231236", "2122121217", "036");
        DosyaSorguAlanlari dosyaSorguAlanlari10 = new DosyaSorguAlanlari(1233L, "16034012328", "121418", "6431231235", "2122121218", "035");
        List<DosyaSorguAlanlari> dosyaSorguAlanlariList = new ArrayList<>();
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari1);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari2);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari3);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari4);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari5);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari6);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari7);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari8);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari9);
        dosyaSorguAlanlariList.add(dosyaSorguAlanlari10);

        dosyaSorguAlanlariList.forEach(dosyaSorguAlanlari -> {
            dosyaSorguAlanlariRepository.save(dosyaSorguAlanlari);
        });

    }
}

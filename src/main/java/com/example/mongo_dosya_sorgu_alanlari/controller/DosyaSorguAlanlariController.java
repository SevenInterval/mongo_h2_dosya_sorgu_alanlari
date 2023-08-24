package com.example.mongo_dosya_sorgu_alanlari.controller;

import com.example.mongo_dosya_sorgu_alanlari.service.IDosyaSorguAlanlariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/dosyasorgualanlari")
public class DosyaSorguAlanlariController {

    @Autowired
    IDosyaSorguAlanlariService dosyaSorguAlanlariService;


    @GetMapping
    public ResponseEntity<?> saveJsonFile(){
        dosyaSorguAlanlariService.saveJsonFile();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/mongo/insert")
    public ResponseEntity<?> mongoInsertFromJson() {
        dosyaSorguAlanlariService.mongoInsertFromJson();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

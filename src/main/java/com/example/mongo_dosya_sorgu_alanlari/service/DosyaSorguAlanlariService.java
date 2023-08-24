package com.example.mongo_dosya_sorgu_alanlari.service;

import com.example.mongo_dosya_sorgu_alanlari.entity.DosyaSorguAlanlari;
import com.example.mongo_dosya_sorgu_alanlari.entity.mongo.DosyaSorguAlanlariMongo;
import com.example.mongo_dosya_sorgu_alanlari.repository.IDosyaSorguAlanlariRepository;
import com.example.mongo_dosya_sorgu_alanlari.repository.mongo.IDosyaSorguAlanlariMongoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.List;

@Service
public class DosyaSorguAlanlariService implements IDosyaSorguAlanlariService{

    private static final String fileName = "external.json";
    private static final String filePath = "C:\\Users\\ridva\\IdeaProjects\\graphql-demo (1)\\mongo_dosya_sorgu_alanlari\\src\\main\\resources\\" + fileName;

    @Autowired
    IDosyaSorguAlanlariRepository repository;

    @Autowired
    IDosyaSorguAlanlariMongoRepository dosyaSorguAlanlariMongoRepository;

    @Autowired
    private MongoTemplate mongo;

    @Override
    public void saveJsonFile() {
        List<DosyaSorguAlanlari> dosyaSorguAlanlariList = repository.findAll();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(Paths.get(filePath).toFile(), dosyaSorguAlanlariList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void mongoInsertFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<DosyaSorguAlanlariMongo>> typeReference = new TypeReference<List<DosyaSorguAlanlariMongo>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/" + fileName);
        try {
            List<DosyaSorguAlanlariMongo> dosyaList = objectMapper.readValue(inputStream, typeReference);
            dosyaSorguAlanlariMongoRepository.saveAll(dosyaList);
            System.out.println("Dosya List saved");
        } catch (IOException e) {
            System.out.println("Unable to save dosya List" + e.getMessage());
        }

    }
}

package com.example.mongo_dosya_sorgu_alanlari.repository.mongo;

import com.example.mongo_dosya_sorgu_alanlari.entity.mongo.DosyaSorguAlanlariMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDosyaSorguAlanlariMongoRepository extends MongoRepository<DosyaSorguAlanlariMongo, Long> {
}

package com.example.mongo_dosya_sorgu_alanlari.repository;

import com.example.mongo_dosya_sorgu_alanlari.entity.DosyaSorguAlanlari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDosyaSorguAlanlariRepository extends JpaRepository<DosyaSorguAlanlari, Long> {
}

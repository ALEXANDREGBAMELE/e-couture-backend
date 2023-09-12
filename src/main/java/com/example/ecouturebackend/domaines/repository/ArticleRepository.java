package com.example.ecouturebackend.domaines.repository;

import com.example.ecouturebackend.domaines.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}

package com.example.ecouturebackend.applications.services;

import com.example.ecouturebackend.domaines.entities.Article;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    ResponseEntity<String> addArticle(Article article);

    List<Article> getArticle();

    Optional<Article> getArticleById(Long articleId);

    ResponseEntity<?> updateArticle(Article article, Long articleId);

    ResponseEntity<?> deleteArticle(Long articleId);
}

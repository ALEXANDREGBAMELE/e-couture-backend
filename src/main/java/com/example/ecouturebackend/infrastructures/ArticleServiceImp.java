package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.ArticleService;
import com.example.ecouturebackend.domaines.entities.Article;
import com.example.ecouturebackend.domaines.entities.User;
import com.example.ecouturebackend.domaines.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class ArticleServiceImp implements ArticleService {
    private final ArticleRepository articleRepository;
    @Override
    public ResponseEntity<String> addArticle(Article article) {
        articleRepository.save(article);
        return ResponseEntity.ok("artice saved successfully");
    }

    @Override
    public List<Article> getArticle() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> getArticleById(Long articleId) {
        return articleRepository.findById(articleId);
    }

    @Override
    public ResponseEntity<?> updateArticle(Article article, Long articleId) {
        Optional<Article> article1 = articleRepository.findById(articleId);
        if (article1.isPresent()){
            Article article2 = article1.get();
            article2.setLibelle(article.getLibelle());
            article2.setPrix(article.getPrix());
            article2.setDescription(article.getDescription());
            article2.setCouleur(article.getCouleur());
            article2.setTaille(article.getTaille());
            article2.setDateDeCreation(article1.get().getDateDeCreation());
            article2.setImgUrl(article.getImgUrl());
            return ResponseEntity.ok("Article enregistré avec succès");

        }
        return ResponseEntity.badRequest().body("L'article n'existe pas");
    }
    @Override
    public ResponseEntity<?> deleteArticle(Long articleId) {
        Optional<Article> article1 = articleRepository.findById(articleId);
        if (article1.isPresent()) {
            articleRepository.delete(article1.get());
            return ResponseEntity.ok("Article deleted successfully");
        }
        return ResponseEntity.badRequest().body("Article not exist");
    }
}

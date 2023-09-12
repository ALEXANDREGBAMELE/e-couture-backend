package com.example.ecouturebackend.controllers;

import com.example.ecouturebackend.domaines.entities.Article;
import com.example.ecouturebackend.domaines.entities.User;
import com.example.ecouturebackend.infrastructures.ArticleServiceImp;
import com.example.ecouturebackend.infrastructures.UserServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("api/article")
public class ArticleController {
    private final ArticleServiceImp articleServiceImp;

    public ArticleController(ArticleServiceImp articleServiceImp) {
        this.articleServiceImp = articleServiceImp;
    }

    @PostMapping("/add/{token}")
    public ResponseEntity<?> addUser(@RequestBody Article article, @PathVariable String token){
        if (token.contains("1234"))
            return articleServiceImp.addArticle(article);
        return ResponseEntity.badRequest().body("Tocken is not correct");
    }

    @GetMapping("/get")
    public List<Article> getArticleAll()
    {
        return articleServiceImp.getArticle();
    }

    @GetMapping("/get/{articleId}")
    public Optional<Article> getArticleById(@PathVariable("articleId") Long articleId)
    {
        return articleServiceImp.getArticleById(articleId);
    }

    @PutMapping ("/update")
    public ResponseEntity<?> updateArticle(@RequestBody Article article, Long articleId) {
        return articleServiceImp.updateArticle(article, articleId);
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity<?> supprimerUtilisateur(@PathVariable("userId") Long articleId)
    {
        return articleServiceImp.deleteArticle(articleId);
    }
}

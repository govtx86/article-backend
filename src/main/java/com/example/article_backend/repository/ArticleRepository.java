package com.example.article_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.article_backend.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}

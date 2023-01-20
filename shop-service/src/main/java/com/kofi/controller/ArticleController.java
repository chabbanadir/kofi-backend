package com.kofi.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.kofi.models.Article;

import com.kofi.service.ArticleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@PostMapping()
	public Article createarticle(@RequestBody Article article) {
	
		return articleService.createArticle(article);
	}
	
	@PutMapping
	public Article updatearticle(@RequestBody Article article) {
		return articleService.updateArticle(article);
	}
	
	@GetMapping("/{id}")
	public Article getArticle(@PathVariable Long id ) {
		return articleService.getArtcile(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteArticle(@PathVariable Long id) {
		articleService.deleteArticle(id);
	}
	
	@GetMapping
	public Iterable<Article> getAllArticle(){
		return articleService.getAllArticles();
	}
}

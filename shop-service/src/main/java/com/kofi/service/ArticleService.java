package com.kofi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kofi.models.Article;
import com.kofi.models.Shop;
import com.kofi.repository.ArticleRepository;
import com.kofi.repository.ShopRepository;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private ShopRepository shopRepo ;
	
	public Article createArticle (Article article) {
	Shop shop = shopRepo.findById(article.getShopid()).orElse(null); 
	article.setShop(shop);
	System.out.println(article.getShop().getName());
		return articleRepository.save(article);
	}
	
	public Article updateArticle (Article article) {
		return articleRepository.save(article);
	}
	
	public Article getArtcile(long id) {
		return articleRepository.findById(id).orElse(null);
	}
	
	public void deleteArticle (Long id) {
		articleRepository.deleteById(id);
	}
	
	public Iterable<Article> getAllArticles(){
		return articleRepository.findAll();
	}

}

package com.kofi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kofi.models.Article;
import com.kofi.models.Shop;
import com.kofi.service.ShopService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/shops")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping()
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @PutMapping
    public Shop updateShop(@RequestBody Shop shop) {
        return shopService.updateShop(shop) ;
    }

    @GetMapping("/{id}")
    public Shop getShop(@PathVariable Long id) {
        return shopService.getShop(id);
    }
    @GetMapping("/{id}/article")
    public List<Article> getShopArticles(@PathVariable Long id) {
        return shopService.getShop(id).getArticles();
    }

    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable Long id) {
    	shopService.deleteShop(id);
    }

    @GetMapping
    public Iterable<Shop> getAllShop() {
        return shopService.getAllShops();
    }
}

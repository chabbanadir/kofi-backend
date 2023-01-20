package com.kofi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kofi.models.Shop;

import com.kofi.repository.ShopRepository;

@Service
public class ShopService {
	
    @Autowired
    private ShopRepository shopRepository;

    
    public Shop createShop(Shop shop) {
        return shopRepository.save(shop);
    }
    public Shop updateShop(Shop shop) {
    	return shopRepository.save(shop);
    }
    public Shop getShop(Long id) {
    	return shopRepository.findById(id).orElse(null);
    }
    public void deleteShop( Long id ) {
    	shopRepository.deleteById(id);
    }
    public Iterable<Shop> getAllShops(){
        return shopRepository.findAll();
    }
    
  
}

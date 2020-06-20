package com.example.microservice.itemcatalog.controller;

import com.example.microservice.itemcatalog.model.Item;
import com.example.microservice.itemcatalog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/display")
public class ItemController {

    private ItemRepository itemRepository;

    ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @GetMapping("/item/{itemNo}")
    public Item getItem(@PathVariable long itemNo){
        return itemRepository.getOne(itemNo);
    }

    @GetMapping("/display")
    public String displayMessage(){
        return "Hello World";
    }
}

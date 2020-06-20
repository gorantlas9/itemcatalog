package com.example.microservice.itemcatalog;

import com.example.microservice.itemcatalog.model.Item;
import com.example.microservice.itemcatalog.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ItemInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public ItemInitializer(ItemRepository repository) {
        this.itemRepository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
         //       .forEach(item -> itemRepository.save(new Item(item)));

        itemRepository.findAll().forEach(System.out::println);
    }
}

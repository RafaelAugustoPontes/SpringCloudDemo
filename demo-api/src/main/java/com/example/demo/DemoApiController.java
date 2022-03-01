package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demos")
public class DemoApiController {

    @Autowired
    private InventoryClient inventoryClient;

    @GetMapping("/greetings")
    public String greeting() {
        System.out.println("Hey");
        final var product = inventoryClient.findProduct();
        System.out.println("Produto obtido do estoque" + product.getId() + " - " + product.getDescription());
        return "Hello world!";
    }

}

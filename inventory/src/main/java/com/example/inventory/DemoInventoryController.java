package com.example.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventories")
public class DemoInventoryController {

    @GetMapping("/products")
    public ProductRespGet findProduct(){
        System.out.println("Estoque sendo utilizado");
        return new ProductRespGet(1, "Notebook");
    }

}

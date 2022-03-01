package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "demo-inventory", path = "/inventories")
public interface InventoryClient {
    @GetMapping(path = "/products")
    ProductRespGet findProduct();
}

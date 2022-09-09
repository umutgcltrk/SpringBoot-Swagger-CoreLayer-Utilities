package com.example.camping.api.controllers;

import com.example.camping.business.abstracts.ProductService;
import com.example.camping.core.utilities.results.DataResult;
import com.example.camping.core.utilities.results.Result;
import com.example.camping.core.utilities.results.SuccessResult;
import com.example.camping.entity.concretes.Products;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
Api katmanı ve controller doğrudan veriye ulaşmıyor.(DataAccess veya Entity)
Business katmanı veriye ulaşıyor(DataAcces'e , Entity'e değil!) ve servislerle controller'a gönderiyor.
 */
@RestController
@RequestMapping("/api")//Not "endpoint" istekte bulunulan yer demek.
public class ProductsController {
    //Sahte kod aslında ,kalıtım sayesinde ProductManager'e ulaşıyor. İnterface olmadığı için de newlenemiyor.
    private ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Products>> getAll(){
        return this.productService.getAll();
    }
    @PostMapping("/add-product")
    public Result addProduct(@RequestBody Products products){
        this.productService.add(products);
        return new SuccessResult("Product eklendi");
    }
}

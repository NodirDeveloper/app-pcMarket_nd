package uz.pdp.apppcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.payload.ApiResponse;
import uz.pdp.apppcmarket.payload.ProductDto;
import uz.pdp.apppcmarket.service.CompanyService;
import uz.pdp.apppcmarket.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public HttpEntity<?> getProducts() {
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public HttpEntity<?> getProduct(@PathVariable Integer id) {
        Product product = productService.getProduct(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public HttpEntity<?> addProduct(@RequestBody ProductDto productDto) {
        ApiResponse apiResponse = productService.addProduct(productDto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editProduct(@PathVariable Integer id,@RequestBody ProductDto productDto){
        ApiResponse apiResponse = productService.editProduct(id, productDto);
        return ResponseEntity.status(apiResponse.isSuccess()?202:409).body(apiResponse);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteProduct(@PathVariable Integer id){
        ApiResponse apiResponse = productService.deleteProduct(id);
        return ResponseEntity.status(apiResponse.isSuccess()?204:409).body(apiResponse);
    }
}

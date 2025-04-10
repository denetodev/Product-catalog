package com.neto.productcatalog.service;

import com.neto.productcatalog.dto.ProductDTO;
import com.neto.productcatalog.entity.Product;
import com.neto.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // Conversões DTO ↔ Entity
    private ProductDTO toDTO(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }

    private Product toEntity(ProductDTO dto) {
        return new Product(dto.getId(), dto.getName(), dto.getDescription(), dto.getPrice());
    }

    // CRUD

    public List<ProductDTO> findAll() {
        return repository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return toDTO(product);
    }

    public ProductDTO create(ProductDTO dto) {
        Product saved = repository.save(toEntity(dto));
        return toDTO(saved);
    }

    public ProductDTO update(Long id, ProductDTO dto) {
        Optional<Product> opt = repository.findById(id);
        if (opt.isEmpty()) throw new RuntimeException("Produto não encontrado");

        Product existing = opt.get();
        existing.setName(dto.getName());
        existing.setDescription(dto.getDescription());
        existing.setPrice(dto.getPrice());

        return toDTO(repository.save(existing));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}

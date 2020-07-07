package com.bjutstudent.store.service;

import java.util.List;

import com.bjutstudent.store.entity.ProductEntity;

public interface ProductService {
	public int insertProduct(ProductEntity product);
	public List<ProductEntity> findAllProducts();
	public ProductEntity findProductByCode(String code);
	public int updateProduct(ProductEntity product);
	public int removeProduct(String code);
}

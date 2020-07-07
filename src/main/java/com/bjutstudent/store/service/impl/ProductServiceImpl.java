package com.bjutstudent.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjutstudent.store.entity.ProductEntity;
import com.bjutstudent.store.mapper.ProductMapper;
import com.bjutstudent.store.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductMapper productMapper;
	@Override
	public int insertProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		return productMapper.insertProduct(product);
	}
	@Override
	public List<ProductEntity> findAllProducts(){
		return productMapper.findAllProducts();
	}
	@Override
	public ProductEntity findProductByCode(String code) {
		// TODO Auto-generated method stub
		return productMapper.findProductByCode(code);
	}
	@Override
	public int updateProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		return productMapper.updateProduct(product);
	}
	@Override
	public int removeProduct(String code) {
		// TODO Auto-generated method stub
		return productMapper.removeProduct(code);
	}
}

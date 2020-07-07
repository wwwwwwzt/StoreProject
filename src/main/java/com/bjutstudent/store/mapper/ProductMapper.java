package com.bjutstudent.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjutstudent.store.entity.ProductEntity;

@Mapper
public interface ProductMapper {
	@Insert("insert into product values(#{code}, #{name}, #{summary})")
	public int insertProduct(ProductEntity product);
	
	@Select("select * from product")
	public List<ProductEntity> findAllProducts();
	
	@Select("select * from product where code=#{code}")
	public ProductEntity findProductByCode(String code);
	
	@Update("update product set name=#{name}, summary=#{summary} where code=#{code}")
	public int updateProduct(ProductEntity product);
	
	@Delete("delete from product where code=#{code}")
	public int removeProduct(String code);
}

package com.locaplace.host.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.locaplace.host.product.dto.ProductDto;

@Mapper
public interface ProductMapper {
	Integer insertProduct(ProductDto productDto);
	ProductDto selectProduct(int productNid);
	List<ProductDto> selectProductList(ProductDto productDto);
}

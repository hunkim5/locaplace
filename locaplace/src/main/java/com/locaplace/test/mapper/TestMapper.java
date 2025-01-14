package com.locaplace.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.locaplace.test.dto.TestDto;

@Mapper
public interface TestMapper {
	List<TestDto> selectTestList();
	int insertTest(TestDto testDto);
	int updateTest(TestDto testDto);
}

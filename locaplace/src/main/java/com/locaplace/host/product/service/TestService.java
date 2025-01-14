package com.locaplace.host.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.locaplace.test.dto.TestDto;
import com.locaplace.test.mapper.TestMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {
	private final TestMapper testMapper;
	
	public List<TestDto> selectTestList() {
		List<TestDto> list =testMapper.selectTestList();
		return list;
	}
	public Integer insertTest(TestDto dto) {
		return testMapper.insertTest(dto);
	}
	public Integer updateTest(TestDto dto) {
		return testMapper.updateTest(dto);
	}
}

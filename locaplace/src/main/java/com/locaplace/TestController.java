package com.locaplace;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locaplace.host.product.service.TestService;
import com.locaplace.test.dto.TestDto;
import com.locaplace.test.mapper.TestMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Tag(name="testController",description = "Test")
@RequiredArgsConstructor
@Slf4j
@RequestMapping(value = "/test")
public class TestController {
	
	private final TestService testService;
	
	@Operation(summary = "select Test",description = "test desc")
	@GetMapping("")
    public ResponseEntity<List<TestDto>> selectTestList() {
		List<TestDto> list =testService.selectTestList();
		log.debug(">>>>list:{}",list.get(0).getStr());
        return ResponseEntity.ok(list);   
    }
	@Operation(summary = "insert test",description = "test desc")
	@PostMapping("")
    public ResponseEntity<Integer> insertTest(@RequestBody TestDto dto) {
		log.debug(">>>dto:{}",dto.getStr());
        return ResponseEntity.ok(testService.insertTest(dto));   
    }
	@Operation(summary = "update test",description = "test desc")
	@PutMapping("")
    public ResponseEntity<Integer> updateTest(@RequestBody TestDto dto) {
		log.debug(">>>dto:{}",dto.getStr());
        return ResponseEntity.ok(testService.updateTest(dto));   
    }
	
}

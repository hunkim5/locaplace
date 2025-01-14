package com.locaplace.test.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDto {
	@Schema(description = "테스트 str")
	private String str;
	@Schema(description = "테스트 int")
	private int num;
}

package com.bjutstudent.store.form;

import javax.validation.constraints.NotEmpty;

public class ProductForm {
	@NotEmpty(message="{id.valid}")
	private String code;
	@NotEmpty(message="{name.valid}")
	private String name;
	@NotEmpty(message="{summary.valid}")
	private String summary;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}

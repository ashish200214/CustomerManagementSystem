package com.asent.customerDetails.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDTO {

	private Integer id;
	private String name;
	private String address;
	private String whatappNo;
	private String requirements;
	
}


package com.example.demo.showValidations;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVO {

	@JsonProperty
	@NotBlank(message = "Field 'name' is missing or null in the request")
	private String name;

	@JsonProperty
	@Email(message = "Please enter valid email", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")

	@NotNull(message = "Field 'email' is missing or null in the request")
	private String email;

	@JsonProperty
	@NotNull(message = "Field 'password' is missing or null in the request")
	@Size(min = 8, message = "Password must be at least 8 characters")
	@Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d][A-Za-z\\d!@#$%^&*()_+]{8,19}$", message = "Password must contain at least 1 number and 1 symbol")
	private String password;

}

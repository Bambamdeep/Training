package com.example.handson4;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidateIntType implements ConstraintValidator<IntValidator,Integer>{

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value!=0 && value!=null;
	}

}

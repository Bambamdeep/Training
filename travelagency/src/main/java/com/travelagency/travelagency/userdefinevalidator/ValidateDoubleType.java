package com.travelagency.travelagency.userdefinevalidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidateDoubleType implements ConstraintValidator<doubleValidate,Double>{

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value !=0 && value != null;
	}

}

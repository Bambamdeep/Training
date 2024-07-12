package com.example.handson4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=ValidateIntType.class)
public @interface IntValidator {
  
	String message() default "id should not be 0 and null";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};
	
}

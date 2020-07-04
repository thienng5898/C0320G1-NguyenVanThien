package com.codegym.blog.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameAuThorValidator implements ConstraintValidator<NameAuthorConstraint, String> {
    @Override
    public void initialize(NameAuthorConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s!=null && s.matches("(^[A-Za-z0-9]*$)")
                &&(s.length() > 10) && (s.length() < 12);
    }
}

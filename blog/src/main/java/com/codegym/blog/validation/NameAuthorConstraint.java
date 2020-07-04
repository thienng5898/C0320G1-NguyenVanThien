package com.codegym.blog.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NameAuThorValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NameAuthorConstraint {
    String message() default "Invalid Name Author";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

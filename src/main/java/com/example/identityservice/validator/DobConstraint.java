package com.example.identityservice.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})    // Annotation chỉ sử dụng cho field. Ngoài ra còn có METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE, TYPE_PARAMETER, TYPE_USE
@Retention(RetentionPolicy.RUNTIME)     // Annotation sẽ tồn tại ở runtime
@Constraint(validatedBy = {DobValidator.class}) // Validator class, ở đây có thể là nhiều class cách nhau bởi dấu phẩy
public @interface DobConstraint {
    String message() default "Invalid date of birth"; // Message măc định khi validate fail

    int min(); // Đây là một field trong annotation bổ sung cho annotation

    Class<?>[] groups() default {}; // Group mặc định, dùng để phân loại các annotation

    Class<? extends Payload>[] payload() default {}; // Payload để đính kèm thông tin khác
}

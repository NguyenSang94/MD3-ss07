package com.example.session07.exception;

import com.example.session07.util.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice // Khai bao Nơi sử lý lỗi toàn cục
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) // Lỗi 400
    public ApiResponse<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        // Tạp Map using HasMap
        Map<String, String> errors = new HashMap<>();
        // Lấy danh sách lỗi thông qua Binding Result
        e.getBindingResult().getFieldErrors().forEach((error) -> {
            String fieldName = error.getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        // Trả về kiểu định dạng valid hợp lệ
        return new ApiResponse<>("False","Validation Failed",errors);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse<Void> handleIllegalArgumentException(IllegalArgumentException e) {
        // Trả về kiểu định dạng valid hợp lệ
        return new ApiResponse<>("false",e.getMessage(),null);
    }
}

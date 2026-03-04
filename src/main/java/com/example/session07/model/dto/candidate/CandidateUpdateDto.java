package com.example.session07.model.dto.candidate;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandidateUpdateDto {
//    //fullName: Không được để trống, độ dài 5-50 ký tự.
//    @NotBlank(message = "Ten khong duoc de trong!")
//    @Size(min = 5, max = 50, message = "Ten phai co do dai tu 5-50")
//    String fullName;
//    //email: Không được để trống, đúng định dạng email.
//    @NotBlank(message = "Email Khong duoc de trong")
//    @Email(message = "Email khong dung dinh dang")
//    String email;
//    //age: Số nguyên, tối thiểu 18 tuổi.
//    @Positive(message = "Tuoi phai la so duong!")
//    @Min(value = 18, message = "Tuoi >= 18")
//    int age;
//    //yearsOfExperience: Số nguyên, không âm (>= 0).
//    @PositiveOrZero(message = "Tuoi phai la so nguyen >= 0")
//    int yearsOfExperience;
    //address: Không được rỗng (@NotBlank).
    @NotBlank(message = "Địa chỉ không được rỗng!")
    String address;
    //bio : Độ dài tối đa 200 ký tự (@Size).
    @Size(min = 5,max = 200, message = "Bio phải có 5-200 ký tự!")
    String bio;

}

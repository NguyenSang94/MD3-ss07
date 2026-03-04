package com.example.session07.model.dto.candidate;

import jakarta.validation.constraints.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidateCreateDto {
    //fullName: Không được để trống, độ dài 5-50 ký tự.
    @NotBlank(message = "Ten khong duoc de trong!")
    @Size(min = 5, max = 50, message = "Ten phai co do dai tu 5-50")
    String fullName;
    //email: Không được để trống, đúng định dạng email.
    @NotBlank(message = "Email Khong duoc de trong")
    @Email(message = "Email khong dung dinh dang")
    String email;
    //age: Số nguyên, tối thiểu 18 tuổi.
    @Positive(message = "Tuoi phai la so duong!")
    @Min(value = 18, message = "Tuoi >= 18")
    int age;
    //yearsOfExperience: Số nguyên, không âm (>= 0).
    @PositiveOrZero(message = "Tuoi phai la so nguyen >= 0")
    int yearsOfExperience;
    //address: Không được rỗng (@NotBlank).
    @NotBlank(message = "Địa chỉ không được rỗng!")
    String address;
    //bio : Độ dài tối đa 200 ký tự (@Size).
    @Size(max = 200, message = "Bio tối đa 200 ký tự!")
    String bio;
    // Regex Phone Vietnam
    @Pattern(regexp = "^(0)(3[2-9]|5[25689]|7[0|6-9]|8[0-9]|9[0-4|6-9])[0-9]{7}$", message = "Số điện thoại không hợp lệ")
    String phoneNumber;
}

package com.example.session07.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "candidates")
public class Candidate {
    //Id : mã ứng viên ,số nguyên , tự tăng .
    //fullName: tên ứng viên ,kiểu dữ liệu chuỗi .
    //email: email , kiểu dữ liệu chuỗi .
    //Age: tuổi , số nguyên .
    //yearsOfExperience: năm kinh nghiệm , số nguyên.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long candidateId;
    String fullName;
    String email;
    int age;
    int yearsOfExperience;
    // Extend
    String address;
    String bio;
    String phoneNumber;
}

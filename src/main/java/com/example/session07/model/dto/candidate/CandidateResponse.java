package com.example.session07.model.dto.candidate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidateResponse {
    Long candidateId;
    String fullName;
    String email;
    int age;
    int yearsOfExperience;
    String address;
    String bio;
    String phoneNumber;
}

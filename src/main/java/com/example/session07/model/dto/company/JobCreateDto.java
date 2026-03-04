package com.example.session07.model.dto.company;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JobCreateDto {
    @NotBlank(message = "Title is not null")
    String title;
    @NotNull
    @Min(value = 0, message = "Salary Min > 0")
    Double salaryMin;
    @NotNull
    @Min(value = 0, message = "Salary Max > 0")
    Double salaryMax;
    @Valid
    @NotNull
    CompanyDto company; // Gan cac annotation thi cac field ben companyDto moi hoat dong!
}

package com.example.session07.model.dto.company;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyDto {
    @NotBlank(message = "Name is not null")
    String name;
    @Size(min = 10, max = 13, message = "TaxCode size 10-13 text!")
    String taxCode;
}

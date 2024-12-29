package com.transaction.CustomEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomEx {
    private Integer expId;
    private String expDec;
    private LocalDate localDate;
}

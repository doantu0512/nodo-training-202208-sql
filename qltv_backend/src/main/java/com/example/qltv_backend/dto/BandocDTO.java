package com.example.qltv_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BandocDTO {
    private Long id;
    private Long maBandoc;
    private String tenBandoc;
    private String sdtBandoc;
    private String diachiBandoc;
    private java.sql.Date ngaysinhBandoc;
    private java.sql.Date ngaytaotkBandoc;
    private String hangBandoc;
}

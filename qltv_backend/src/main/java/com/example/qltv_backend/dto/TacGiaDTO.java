package com.example.qltv_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TacGiaDTO {
    private Long id;
    private Long maTacgia;
    private String tenTacGia;
    private String sdtTacGia;
    private String diaChiTacGia;
    private String moTaTacGia;

}

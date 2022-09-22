package com.example.qltv_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoanTuNxbDTO {
    private Long id;
    private Long ma;
    private String ten;
    private Long trangThai;
    private String diaChi;
    private String moTa;

}

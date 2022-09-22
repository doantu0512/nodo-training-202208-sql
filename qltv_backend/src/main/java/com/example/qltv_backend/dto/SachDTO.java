package com.example.qltv_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SachDTO {
    private Long id;
    private Long maSach;
    private String tenSach;
    private Long idNxb;
    private Long idTacgia;
    private String chudeSạch;
    private java.sql.Date namxuatban;
    private String moTaSach;
    private Long soluongconlai;
    private Long soluongdangmuon;
    private Long tongsosach;

}

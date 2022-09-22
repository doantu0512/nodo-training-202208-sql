package com.example.qltv_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MuonsachDTO {
    private Long id;
    private Long idBandoc;
    private Long idSach;
    private Long soluongMuonsach;
    private java.sql.Date ngaymuonMuonsach;
    private java.sql.Date ngaytraMuonsach;
    private Long trangthaiMuonsach;
    private String ghichuMuonsach;
}

package com.example.qltv_backend.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DOAN_TU_TACGIA")
public class TacGia {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MA_TACGIA")
    private Long maTacgia;

    @Column(name = "TEN_TAC_GIA")
    private String tenTacGia;

    @Column(name = "SDT_TAC_GIA")
    private String sdtTacGia;

    @Column(name = "DIA_CHI_TAC_GIA")
    private String diaChiTacGia;

    @Column(name = "MO_TA_TAC_GIA")
    private String moTaTacGia;
}

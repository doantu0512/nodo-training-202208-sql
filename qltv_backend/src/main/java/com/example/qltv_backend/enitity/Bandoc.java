package com.example.qltv_backend.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DOAN_TU_BANDOC")
public class Bandoc {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MA_BANDOC")
    private Long maBandoc;

    @Column(name = "TEN_BANDOC")
    private String tenBandoc;

    @Column(name = "SDT_BANDOC")
    private String sdtBandoc;

    @Column(name = "DIACHI_BANDOC")
    private String diachiBandoc;

    @Column(name = "NGAYSINH_BANDOC")
    private java.sql.Date ngaysinhBandoc;

    @Column(name = "NGAYTAOTK_BANDOC")
    private java.sql.Date ngaytaotkBandoc;

    @Column(name = "HANG_BANDOC")
    private String hangBandoc;

}

package com.example.qltv_backend.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DOAN_TU_NXB")
public class DoanTuNxb {
    @Id
    @Column(name = "ID")

    private Long id;

    @Column(name = "MA")
    private Long ma;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "TRANG_THAI")
    private Long trangThai;

    @Column(name = "DIA_CHI")
    private String diaChi;

    @Column(name = "MO_TA")
    private String moTa;

}

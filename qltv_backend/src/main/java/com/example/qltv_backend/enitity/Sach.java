package com.example.qltv_backend.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DOAN_TU_SACH")
public class Sach {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MA_SACH")
    private Long maSach;

    @Column(name = "TEN_SACH")
    private String tenSach;

    @Column(name = "ID_NXB")
    private Long idNxb;

    @Column(name = "ID_TACGIA")
    private Long idTacgia;

    @Column(name = "CHUDE_SẠCH")
    private String chudeSạch;

    @Column(name = "NAMXUATBAN")
    private java.sql.Date namxuatban;

    @Column(name = "MO_TA_SACH")
    private String moTaSach;

    @Column(name = "SOLUONGCONLAI")
    private Long soluongconlai;

    @Column(name = "SOLUONGDANGMUON")
    private Long soluongdangmuon;

    @Column(name = "TONGSOSACH")
    private Long tongsosach;

}

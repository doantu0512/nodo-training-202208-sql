package com.example.qltv_backend.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DOAN_TU_MUONSACH")
public class Muonsach {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ID_BANDOC")
    private Long idBandoc;

    @Column(name = "ID_SACH")
    private Long idSach;

    @Column(name = "SOLUONG_MUONSACH")
    private Long soluongMuonsach;

    @Column(name = "NGAYMUON_MUONSACH")
    private java.sql.Date ngaymuonMuonsach;

    @Column(name = "NGAYTRA_MUONSACH")
    private java.sql.Date ngaytraMuonsach;

    @Column(name = "TRANGTHAI_MUONSACH")
    private Long trangthaiMuonsach;

    @Column(name = "GHICHU_MUONSACH")
    private String ghichuMuonsach;
}

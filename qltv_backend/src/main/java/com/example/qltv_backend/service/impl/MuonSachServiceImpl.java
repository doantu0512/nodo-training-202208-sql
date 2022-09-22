package com.example.qltv_backend.service.impl;

import com.example.qltv_backend.dao.IMuonSachDao;
import com.example.qltv_backend.dto.MuonsachDTO;
import com.example.qltv_backend.enitity.Muonsach;
import com.example.qltv_backend.service.IMuonSachService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MuonSachServiceImpl implements IMuonSachService {
    @Autowired
    IMuonSachDao muonSachDao;

    @Override
    public List<Muonsach> findALL() {
        return muonSachDao.findAll();
    }

    @Override
    public Muonsach findById(Long id) {
        return muonSachDao.findById(id).orElse(null);
    }

    @Override
    public Muonsach saveAndUpdate(MuonsachDTO muonsachDTO) {
        Muonsach muonsach = new Muonsach();
        muonsach.setId(muonsachDTO.getId());
        muonsach.setIdBandoc(muonsachDTO.getIdBandoc());
        muonsach.setIdSach(muonsachDTO.getIdSach());
        muonsach.setSoluongMuonsach(muonsachDTO.getSoluongMuonsach());
        muonsach.setNgaymuonMuonsach(muonsachDTO.getNgaymuonMuonsach());
        muonsach.setNgaytraMuonsach(muonsachDTO.getNgaytraMuonsach());
        muonsach.setTrangthaiMuonsach(muonsachDTO.getTrangthaiMuonsach());
        muonsach.setGhichuMuonsach(muonsachDTO.getGhichuMuonsach());
        return muonSachDao.save(muonsach);
    }

    @Override
    public Response deleteById(Long id) {
        Muonsach muonsach  = muonSachDao.findById(id).orElse(null);
        if (muonsach == null) {
            return new Response("Thất bại");
        } else {
            muonSachDao.deleteById(id);
            return new Response("Xóa thành công") ;
        }
    }



}

package com.example.qltv_backend.service.impl;

import com.example.qltv_backend.dao.ITacGiaDao;
import com.example.qltv_backend.dto.TacGiaDTO;
import com.example.qltv_backend.enitity.TacGia;
import com.example.qltv_backend.service.ITacGiaService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TacGiaServiceimpl implements ITacGiaService {
    @Autowired
    ITacGiaDao tacGiaDao;
    @Override
    public List<TacGia> findALL() {
        return tacGiaDao.findAll();
    }
    @Override
    public TacGia findById(Long id) {
        return tacGiaDao.findById(id).orElse(null);
    }
    @Override
    public TacGia saveAndUpdate(TacGiaDTO tacGiaDTO) {
        TacGia tacGia = new TacGia();
        tacGia.setId(tacGiaDTO.getId());
        tacGia.setMaTacgia(tacGiaDTO.getMaTacgia());
        tacGia.setTenTacGia(tacGiaDTO.getTenTacGia());
        tacGia.setSdtTacGia(tacGiaDTO.getSdtTacGia());
        tacGia.setDiaChiTacGia(tacGiaDTO.getDiaChiTacGia());
        tacGia.setMoTaTacGia(tacGiaDTO.getMoTaTacGia());
        return tacGiaDao.save(tacGia);
    }
    @Override
    public Response deleteById(Long id) {
        TacGia tacGia  = tacGiaDao.findById(id).orElse(null);
        if (tacGia == null) {
            return new Response("Thất bại");
        } else {
            tacGiaDao.deleteById(id);
            return new Response("Xóa thành công") ;
        }
    }
}

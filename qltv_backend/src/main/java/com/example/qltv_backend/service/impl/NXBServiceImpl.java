package com.example.qltv_backend.service.impl;

import com.example.qltv_backend.dao.INXBDao;
import com.example.qltv_backend.dto.DoanTuNxbDTO;
import com.example.qltv_backend.enitity.DoanTuNxb;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.qltv_backend.service.INXBService;

import java.util.List;

@Service
public class NXBServiceImpl implements INXBService {
    @Autowired
    INXBDao nxbDao;

    @Override
    public List<DoanTuNxb> findALL() {
        return nxbDao.findAll();
    }

    @Override
    public DoanTuNxb findById(Long id) {
        return nxbDao.findById(id).orElse(null);
    }

    @Override
    public DoanTuNxb saveAndUpdate(DoanTuNxbDTO nxbDTO) {
        DoanTuNxb nxb = new DoanTuNxb();
        nxb.setId(nxbDTO.getId());
        nxb.setMa(nxbDTO.getMa());
        nxb.setTen(nxbDTO.getTen());
        nxb.setTrangThai(nxbDTO.getTrangThai());
        nxb.setDiaChi(nxbDTO.getDiaChi());
        nxb.setMoTa(nxbDTO.getMoTa());
        return nxbDao.save(nxb);
    }

    @Override
    public Response deleteById(Long id) {
        DoanTuNxb nxb  = nxbDao.findById(id).orElse(null);
        if (nxb == null) {
            return new Response("Thất bại");
        } else {
            nxbDao.deleteById(id);
            return new Response("Xóa thành công") ;
        }
    }



}

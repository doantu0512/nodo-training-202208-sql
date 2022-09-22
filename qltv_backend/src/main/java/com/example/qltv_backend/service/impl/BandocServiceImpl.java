package com.example.qltv_backend.service.impl;

import com.example.qltv_backend.dao.IBanDocDao;
import com.example.qltv_backend.dto.BandocDTO;
import com.example.qltv_backend.enitity.Bandoc;
import com.example.qltv_backend.service.IBanDocService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BandocServiceImpl implements IBanDocService {
    @Autowired
    IBanDocDao bandocDao;

    @Override
    public List<Bandoc> findALL() {
        return bandocDao.findAll();
    }

    @Override
    public Bandoc findById(Long id) {
        return bandocDao.findById(id).orElse(null);
    }

    @Override
    public Bandoc saveAndUpdate(BandocDTO bandocDTO) {
        Bandoc bandoc = new Bandoc();
        bandoc.setId(bandocDTO.getId());
        bandoc.setMaBandoc(bandocDTO.getMaBandoc());
        bandoc.setTenBandoc(bandocDTO.getTenBandoc());
        bandoc.setSdtBandoc(bandocDTO.getSdtBandoc());
        bandoc.setDiachiBandoc(bandocDTO.getDiachiBandoc());
        bandoc.setNgaysinhBandoc(bandocDTO.getNgaysinhBandoc());
        bandoc.setNgaytaotkBandoc(bandocDTO.getNgaytaotkBandoc());
        bandoc.setHangBandoc(bandocDTO.getHangBandoc());
        return bandocDao.save(bandoc);
    }

    @Override
    public Response deleteById(Long id) {
        Bandoc bandoc  = bandocDao.findById(id).orElse(null);
        if (bandoc == null) {
            return new Response("Thất bại");
        } else {
            bandocDao.deleteById(id);
            return new Response("Xóa thành công") ;
        }
    }



}

package com.example.qltv_backend.service.impl;

import com.example.qltv_backend.dao.ISachDao;
import com.example.qltv_backend.dto.SachDTO;
import com.example.qltv_backend.enitity.Sach;
import com.example.qltv_backend.service.ISachService;

import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachServiceImpl implements ISachService {
    @Autowired
    ISachDao sachDao;
    @Override
    public List<Sach> findALL() {
        return sachDao.findAll();
    }
    @Override
    public Sach findById(Long id) {
        return sachDao.findById(id).orElse(null);
    }
    @Override
    public Sach saveAndUpdate(SachDTO sachDTO) {
        Sach sach = new Sach();
        sach.setId(sachDTO.getId());
        sach.setMaSach(sachDTO.getMaSach());
        sach.setTenSach(sachDTO.getTenSach());
        sach.setIdNxb(sachDTO.getIdNxb());
        sach.setIdTacgia(sachDTO.getIdTacgia());
        sach.setChudeSạch(sachDTO.getChudeSạch());
        sach.setNamxuatban(sachDTO.getNamxuatban());
        sach.setMoTaSach(sachDTO.getMoTaSach());
        sach.setSoluongconlai(sachDTO.getSoluongconlai());
        sach.setSoluongdangmuon(sachDTO.getSoluongdangmuon());
        sach.setTongsosach(sachDTO.getTongsosach());
        return sachDao.save(sach);
    }
    @Override
    public Response deleteById(Long id) {
        Sach sach  = sachDao.findById(id).orElse(null);
        if (sach == null) {
            return new Response("Thất bại");
        } else {
            sachDao.deleteById(id);
            return new Response("Xóa thành công") ;
        }
    }
}

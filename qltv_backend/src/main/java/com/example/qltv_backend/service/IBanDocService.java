package com.example.qltv_backend.service;

import com.example.qltv_backend.dto.BandocDTO;
import com.example.qltv_backend.dto.SachDTO;
import com.example.qltv_backend.enitity.Bandoc;
import com.example.qltv_backend.enitity.Sach;
import com.example.qltv_backend.utils.Response;

import java.util.List;

public interface IBanDocService {
    List<Bandoc> findALL();

    Bandoc findById(Long id);

    Bandoc saveAndUpdate(BandocDTO bandocDTO);

    Response deleteById(Long id);
}

package com.example.qltv_backend.service;

import com.example.qltv_backend.dto.TacGiaDTO;
import com.example.qltv_backend.enitity.TacGia;
import com.example.qltv_backend.utils.Response;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITacGiaService {
    List<TacGia> findALL();

    TacGia findById(Long id);

    TacGia saveAndUpdate(TacGiaDTO tacGiaDTO);

    Response deleteById(Long id);
}

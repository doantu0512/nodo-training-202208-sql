package com.example.qltv_backend.service;

import com.example.qltv_backend.dto.SachDTO;
import com.example.qltv_backend.enitity.Sach;
import com.example.qltv_backend.utils.Response;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ISachService {
    List<Sach> findALL();

    Sach findById(Long id);

    Sach saveAndUpdate(SachDTO sachDTO);

    Response deleteById(Long id);
}

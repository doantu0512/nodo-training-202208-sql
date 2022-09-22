package com.example.qltv_backend.service;

import com.example.qltv_backend.dto.DoanTuNxbDTO;
import com.example.qltv_backend.dto.MuonsachDTO;
import com.example.qltv_backend.enitity.DoanTuNxb;
import com.example.qltv_backend.enitity.Muonsach;
import com.example.qltv_backend.utils.Response;

import java.util.List;

public interface IMuonSachService {
    List<Muonsach> findALL();

    Muonsach findById(Long id);

    Muonsach saveAndUpdate(MuonsachDTO muonsachDTO);

    Response deleteById(Long id);

}

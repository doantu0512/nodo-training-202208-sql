package com.example.qltv_backend.service;

import com.example.qltv_backend.dto.DoanTuNxbDTO;
import com.example.qltv_backend.enitity.DoanTuNxb;
import com.example.qltv_backend.utils.Response;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface INXBService {

    List<DoanTuNxb> findALL();

    DoanTuNxb findById(Long id);

    DoanTuNxb saveAndUpdate(DoanTuNxbDTO nxbDTO);

    Response deleteById(Long id);

}

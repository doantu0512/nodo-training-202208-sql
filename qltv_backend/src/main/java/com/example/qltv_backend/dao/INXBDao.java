package com.example.qltv_backend.dao;

import com.example.qltv_backend.enitity.DoanTuNxb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface INXBDao  extends JpaRepository<DoanTuNxb, Long>{


}

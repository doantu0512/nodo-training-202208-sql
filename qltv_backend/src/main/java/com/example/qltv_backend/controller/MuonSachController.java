package com.example.qltv_backend.controller;

import com.example.qltv_backend.dto.MuonsachDTO;
import com.example.qltv_backend.enitity.Muonsach;

import com.example.qltv_backend.service.IBanDocService;
import com.example.qltv_backend.service.IMuonSachService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/muonsach")
public class MuonSachController {
    @Autowired
    IMuonSachService iMuonSachService;

    @GetMapping()
    public Response findAll() {
        return Response.success("Lấy thông tin thành công").withData(iMuonSachService.findALL());
    }

    @GetMapping("{id}")
    public Response findById(@PathVariable Long id) {
        Muonsach muonsach = iMuonSachService.findById(id);
        if (muonsach == null) {
            return Response.warning("Không tìm thấy bản ghi");
        } else {
            return Response.success("Lấy thông tin theo id thành công").withData(muonsach);
        }
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Response saveOrUpdate(@RequestBody MuonsachDTO form) {
        return Response.success("Thêm mới thành công").withData(iMuonSachService.saveAndUpdate(form));
    }

    @PutMapping("{id}")
    public Response update(@RequestBody MuonsachDTO form) {
        return Response.success("Cập nhật thành công").withData(iMuonSachService.saveAndUpdate(form));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Response delete(@PathVariable Long id) {
        return iMuonSachService.deleteById(id);
    }
}

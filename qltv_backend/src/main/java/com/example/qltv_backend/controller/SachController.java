package com.example.qltv_backend.controller;

import com.example.qltv_backend.dto.SachDTO;
import com.example.qltv_backend.enitity.Sach;

import com.example.qltv_backend.service.ISachService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/sach")
public class SachController {
    @Autowired
    ISachService iSachService;

    @GetMapping()
    public Response findAll() {
        return Response.success("Lấy thông tin thành công").withData(iSachService.findALL());
    }

    @GetMapping("{id}")
    public Response findById(@PathVariable Long id) {
        Sach sach = iSachService.findById(id);
        if (sach == null) {
            return Response.warning("Không tìm thấy bản ghi");
        } else {
            return Response.success("Lấy thông tin theo id thành công").withData(sach);
        }
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Response saveOrUpdate(@RequestBody SachDTO form) {
        return Response.success("Thêm mới thành công").withData(iSachService.saveAndUpdate(form));
    }

    @PutMapping("{id}")
    public Response update(@RequestBody SachDTO form) {
        return Response.success("Cập nhật thành công").withData(iSachService.saveAndUpdate(form));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Response delete(@PathVariable Long id) {
        return iSachService.deleteById(id);
    }
}

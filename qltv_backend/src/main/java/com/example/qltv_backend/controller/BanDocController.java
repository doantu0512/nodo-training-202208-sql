package com.example.qltv_backend.controller;

import com.example.qltv_backend.dto.BandocDTO;
import com.example.qltv_backend.enitity.Bandoc;

import com.example.qltv_backend.service.IBanDocService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bandoc")
public class BanDocController {
    @Autowired
    IBanDocService iBanDocService;

    @GetMapping()
    public Response findAll() {
        return Response.success("Lấy thông tin thành công").withData(iBanDocService.findALL());
    }

    @GetMapping("{id}")
    public Response findById(@PathVariable Long id) {
        Bandoc bandoc = iBanDocService.findById(id);
        if (bandoc == null) {
            return Response.warning("Không tìm thấy bản ghi");
        } else {
            return Response.success("Lấy thông tin theo id thành công").withData(bandoc);
        }
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Response saveOrUpdate(@RequestBody BandocDTO form) {
        return Response.success("Thêm mới thành công").withData(iBanDocService.saveAndUpdate(form));
    }

    @PutMapping("{id}")
    public Response update(@RequestBody BandocDTO form) {
        return Response.success("Cập nhật thành công").withData(iBanDocService.saveAndUpdate(form));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Response delete(@PathVariable Long id) {
        return iBanDocService.deleteById(id);
    }
}

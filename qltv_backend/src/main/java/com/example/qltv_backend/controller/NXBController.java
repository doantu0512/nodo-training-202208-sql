package com.example.qltv_backend.controller;

import com.example.qltv_backend.dto.DoanTuNxbDTO;
import com.example.qltv_backend.enitity.DoanTuNxb;
import com.example.qltv_backend.service.INXBService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/nxb")
public class NXBController {
    @Autowired
    INXBService inxbService;

    @GetMapping()
    public Response findAll() {
        return Response.success("Lấy thông tin thành công").withData(inxbService.findALL());
    }

    @GetMapping("{id}")
    public Response findById(@PathVariable Long id) {
        DoanTuNxb nxb = inxbService.findById(id);
        if (nxb == null) {
            return Response.warning("Không tìm thấy bản ghi");
        } else {
            return Response.success("Lấy thông tin theo id thành công").withData(nxb);
        }
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Response saveOrUpdate(@RequestBody DoanTuNxbDTO form) {
        return Response.success("Thêm mới thành công").withData(inxbService.saveAndUpdate(form));
    }

    @PutMapping("{id}")
    public Response update(@RequestBody DoanTuNxbDTO form) {
        return Response.success("Cập nhật thành công").withData(inxbService.saveAndUpdate(form));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Response delete(@PathVariable Long id) {
        return inxbService.deleteById(id);
    }
}
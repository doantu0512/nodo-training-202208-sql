package com.example.qltv_backend.controller;

import com.example.qltv_backend.dto.TacGiaDTO;
import com.example.qltv_backend.enitity.TacGia;
import com.example.qltv_backend.service.INXBService;
import com.example.qltv_backend.service.ITacGiaService;
import com.example.qltv_backend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/tacgia")
public class TacgiaController {
    @Autowired
    ITacGiaService iTacGiaService;

    @GetMapping()
    public Response findAll() {
        return Response.success("Lấy thông tin thành công").withData(iTacGiaService.findALL());
    }

    @GetMapping("{id}")
    public Response findById(@PathVariable Long id) {
        TacGia nxb = iTacGiaService.findById(id);
        if (nxb == null) {
            return Response.warning("Không tìm thấy bản ghi");
        } else {
            return Response.success("Lấy thông tin theo id thành công").withData(nxb);
        }
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Response saveOrUpdate(@RequestBody TacGiaDTO form) {
        return Response.success("Thêm mới thành công").withData(iTacGiaService.saveAndUpdate(form));
    }

    @PutMapping("{id}")
    public Response update(@RequestBody TacGiaDTO form) {
        return Response.success("Cập nhật thành công").withData(iTacGiaService.saveAndUpdate(form));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Response delete(@PathVariable Long id) {
        return iTacGiaService.deleteById(id);
    }
}

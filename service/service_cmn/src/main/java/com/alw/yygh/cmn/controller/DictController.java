package com.alw.yygh.cmn.controller;

import com.alw.yygh.cmn.service.DictService;
import com.alw.yygh.common.result.Result;
import com.alw.yygh.model.cmn.Dict;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/admin/cmn/dict")
public class DictController {
    @Autowired
    private DictService dictService;

//    导入数据字典接口
    @PostMapping("importData")
    public Result importDict(MultipartFile file){
        dictService.importDictData(file);
        return Result.ok();
    }

//    导出数据字典接口
    @GetMapping("exportData")
    public void exportDict(HttpServletResponse response){
        dictService.exportDictData(response);
    }


    //根据数据id查询字数据列表
    @ApiOperation(value = "根据数据id查询字数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id){
       List<Dict> list =  dictService.findChlidData(id);
       return Result.ok(list);
    }

}

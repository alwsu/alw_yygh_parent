package com.alw.yygh.cmn.service;

import com.alw.yygh.model.cmn.Dict;
import com.alw.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DictService extends IService<Dict> {
    //根据数据id查询字数据列表
    List<Dict> findChlidData(Long id);
    //    导出数据字典接口
    void exportDictData(HttpServletResponse response);
    //    导入数据字典接口
    void importDictData(MultipartFile file);
}

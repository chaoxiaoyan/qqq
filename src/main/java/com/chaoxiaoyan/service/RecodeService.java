package com.chaoxiaoyan.service;

import com.chaoxiaoyan.demain.Recode;
import com.chaoxiaoyan.vo.PageVo;
import com.chaoxiaoyan.vo.ResultVo;
public interface RecodeService {
    //新增
    ResultVo save(Recode recode);
    ResultVo queryById(int id);
    ResultVo queryLike(String msg);
    PageVo<Recode> queryPage(int page, int size);
}

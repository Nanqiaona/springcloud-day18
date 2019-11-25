package com.bw.controller;

import com.bw.entity.Kecheng;
import com.bw.service.FenleiService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * controller层
 */
@RestController
@CrossOrigin
@RequestMapping("/fenlei")
public class FenleiController {
    @Resource
    private FenleiService fenleiService;

    /**
     * 列表
     * @return
     */
    @RequestMapping("/getlist")
    public List<Kecheng> getlist(){
        List<Kecheng> getlist = fenleiService.getlist();
        return getlist;
    }
}

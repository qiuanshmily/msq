package com.msq.web.controller;
import com.github.pagehelper.PageInfo;
import com.msq.common.util.ReturnResult;
import com.msq.web.service.CommentService;
import com.msq.web.service.DataConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: qiuan
 * @Date: 2019/1/11 15:02
 * @Description: 数据初始化配置服务
 */
@RestController
@RequestMapping("/config")
public class DataConfigController extends BaseController{

    @Autowired
    private DataConfigService dataConfigService;
    /**
     * 通过相应用户ID获取数据模组
     * @param id
     * @return
     */
    @RequestMapping(value = "/getDateSource/{id}", method = RequestMethod.POST)
    public Object getConfigInfo(@PathVariable Long id, @RequestBody PageInfo pageInfo) {
        ReturnResult result = dataConfigService.getDataSourceInfoByUserId(id, pageInfo);
        return result;
    }


}


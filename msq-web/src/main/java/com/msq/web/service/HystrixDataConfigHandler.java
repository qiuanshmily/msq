package com.msq.web.service;
import com.github.pagehelper.PageInfo;
import com.msq.common.util.ReturnResult;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.web.service
 * @date:2019/1/11
 */
public class HystrixDataConfigHandler implements DataConfigService{

    /**
     * @param id
     * @param pageInfo
     * @return
     */
    @Override
    public ReturnResult getDataSourceInfoByUserId(Long id, PageInfo pageInfo) {
        return ReturnResult.build(400,"系统异常");
    }


}

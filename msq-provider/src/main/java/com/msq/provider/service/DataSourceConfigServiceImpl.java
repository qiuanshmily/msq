package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.dto.DataSourceConfigDTO;
import com.msq.common.util.ReturnResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: create by qiuan
 * @version: v1.0
 * @description: com.msq.provider.service
 * @date:2019/1/12
 */
@Service
public class DataSourceConfigServiceImpl {

    public ReturnResult getDataSourceConById(Long Id, PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
//        List<DataSourceConfigDTO> dataSourceConfigDTOList = dataSourceConfigMapper.getDataSourceConById(id);
        PageInfo<DataSourceConfigDTO> resultInfo=new PageInfo<DataSourceConfigDTO>(null);
        return ReturnResult.ok(resultInfo);
    }
}

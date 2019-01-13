package com.msq.web.service;

import com.digiwin.sqlengine.domain.SeSearchSql;
import com.digiwin.sqlengine.domain.SeService;

/**
 * @Auther: Tangzx
 * @Date: 2018/11/5 17:04
 * @Description:
 */
public interface SearchService {
    /**
     * @param: [searchName, dataSourceId, searchSql, fieldConfig]
     * @return: com.digiwin.sqlengine.domain.SeSearchSql
     * @author: Tangzx
     * @date: 2018/11/6 9:34
     * @Description: 保存sql查询
     */
    SeSearchSql saveSearchSql(String searchName, Long dataSourceId, String searchSql, String fieldConfig);

    /**
     * @param: [serviceName, use, useLow, searchId]
     * @return: com.digiwin.sqlengine.domain.SeService
     * @author: Tangzx
     * @date: 2018/11/6 10:29
     * @Description: 保存接口服务
     */
    SeService saveService(String serviceName, String use, String useLow, Long searchId);

    /**
     * @param: [serviceId]
     * @return: java.lang.String
     * @author: Tangzx
     * @date: 2018/11/6 10:48
     * @Description: 根据接口服务ID返回对应接口格式数据
     */
    String queryServiceData(Long serviceId);
}

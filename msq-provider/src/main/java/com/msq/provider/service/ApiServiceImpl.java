package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.SeServiceMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther:Zhousl
 * @date:2019/1/18
 * @Description:接口服务
 */
@Service
public class ApiServiceImpl {
    @Resource
    private SeServiceMapper seServiceMapper ;

    public ReturnResult queryList(QueryData<SeServiceExample> queryData){
        PageInfo pageInfo = queryData.getPageInfo();
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        SeServiceExample param = queryData.getParam();
        List<SeService> seService = seServiceMapper.selectByExample(param);
        PageInfo<SeService> resultInfo=new PageInfo<SeService>(seService);
        return ReturnResult.ok(resultInfo);
    }

    @Transactional
    public ReturnResult saveOrUpdate(SeService seService){
        if(seService.getServiceId()==null){
            seServiceMapper.insert(seService);
        }else{
            seServiceMapper.updateByPrimaryKeySelective(seService);
        }
        return ReturnResult.ok();
    }

    @Transactional
    public ReturnResult delete(Long id){
        seServiceMapper.deleteByPrimaryKey(id);
        return ReturnResult.ok();
    }
}

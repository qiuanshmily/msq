package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.pojo.SeFieldConfig;
import com.msq.common.pojo.SeFieldConfigExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.SeFieldConfigMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther:Zhousl
 *  @version: v1.0
 * @date:2019/1/18
 * @Description:
 */
@Service
public class FieldConfigServiceImpl {
    @Resource
    private SeFieldConfigMapper seFieldConfigMapper;

    public ReturnResult queryList(QueryData<SeFieldConfigExample> queryData){
        PageInfo pageInfo = queryData.getPageInfo();
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        SeFieldConfigExample param = queryData.getParam();
        List<SeFieldConfig> seFieldConfig = seFieldConfigMapper.selectByExample(param);
        PageInfo<SeFieldConfig> resultInfo=new PageInfo<SeFieldConfig>(seFieldConfig);
        return ReturnResult.ok(resultInfo);
    }

    @Transactional
    public ReturnResult saveOrUpdate(SeFieldConfig seFieldConfig){
        List<String> fieldIsExist =seFieldConfigMapper.checkFieldExist(seFieldConfig);
        if(fieldIsExist.size()>0){
            return ReturnResult.build(400,"变量名已存在");
        }else{
            if(seFieldConfig.getFieldConfigId()==null){
                seFieldConfigMapper.insert(seFieldConfig);
            }else{
                seFieldConfigMapper.updateByPrimaryKeySelective(seFieldConfig);
            }
            return ReturnResult.ok();
        }
    }

    @Transactional
    public ReturnResult delete(SeFieldConfig seFieldConfig){
       int flag =  seFieldConfigMapper.deleteByPrimaryKey(seFieldConfig);
       if(1==flag){
           return ReturnResult.ok();
       }else{
           return ReturnResult.build(400,"参数有误");
       }

    }

    @Transactional
    public ReturnResult selectFields(Integer dataSourceId){
        List<SeFieldConfig> seFieldConfig = seFieldConfigMapper.selectFieldsByDataSourceId(dataSourceId);
        return ReturnResult.ok(seFieldConfig);
    }
}

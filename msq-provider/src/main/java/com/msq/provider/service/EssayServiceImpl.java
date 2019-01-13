package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.dto.EssayUserDTO;
import com.msq.common.pojo.Essay;
import com.msq.common.pojo.EssayExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.EssayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EssayServiceImpl {

    @Autowired
    private EssayMapper essayMapper;

    @Transactional
    public ReturnResult saveEssay(Essay essay) {
        int insert = essayMapper.insert(essay);
        if(insert>0){
            return ReturnResult.ok();
        }
        return  ReturnResult.build(400,"发送失败");
    }

    public ReturnResult getEssay(QueryData<EssayExample> queryData) {
        PageInfo pageInfo = queryData.getPageInfo();
        EssayExample param = queryData.getParam();
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<EssayUserDTO> essayUserList = essayMapper.getEssay(param);
        PageInfo<EssayUserDTO> resultInfo=new PageInfo<EssayUserDTO>(essayUserList);

        return ReturnResult.ok(resultInfo);
    }
}

package com.msq.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msq.common.dto.PermissionDTO;
import com.msq.common.pojo.Role;
import com.msq.common.pojo.RoleExample;
import com.msq.common.pojo.RolePermission;
import com.msq.common.pojo.RolePermissionExample;
import com.msq.common.util.QueryData;
import com.msq.common.util.ReturnResult;
import com.msq.provider.mapper.PermissionMapper;
import com.msq.provider.mapper.RoleMapper;
import com.msq.provider.mapper.RolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    public ReturnResult queryList(QueryData<RoleExample> queryData){
        PageInfo pageInfo = queryData.getPageInfo();
        RoleExample param = queryData.getParam();
        if(pageInfo==null){
            List<Role> roleList = roleMapper.selectByExampleNew(param);
            return ReturnResult.ok(roleList);
        }
        PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        List<Role> roleList = roleMapper.selectByExampleNew(param);
        PageInfo<Role> resultInfo=new PageInfo<Role>(roleList);
        return ReturnResult.ok(resultInfo);
    }


    @Transactional
    public ReturnResult saveOrUpdate(Role role){
        if(role.getId()==null){
            roleMapper.insert(role);
        }else{
            roleMapper.updateByPrimaryKey(role);
        }
        return ReturnResult.ok();
    }

    @Transactional
    public ReturnResult delete(int id){
        roleMapper.deleteByPrimaryKey(id);
        return ReturnResult.ok();
    }

    public ReturnResult permissionList(){
        List<PermissionDTO> permissionDTOS = permissionMapper.permissionList();
        return ReturnResult.ok(permissionDTOS);
    }


    @Transactional
    public ReturnResult assignPerm(Role role){
        Integer id = role.getId();
        Long[] permIds = role.getPermIds();
        RolePermissionExample rolePermissionExample=new RolePermissionExample();
        RolePermissionExample.Criteria criteria = rolePermissionExample.createCriteria();
        criteria.andRoleIdEqualTo(id);
        rolePermissionMapper.deleteByExample(rolePermissionExample);
        for(Long permId:permIds){
            if(permId<10000){
                RolePermission rolePermission=new RolePermission();
                rolePermission.setPermissionId(permId.intValue());
                rolePermission.setRoleId(id);
                rolePermissionMapper.insert(rolePermission);
            }

        }
        return ReturnResult.ok();
    }

}

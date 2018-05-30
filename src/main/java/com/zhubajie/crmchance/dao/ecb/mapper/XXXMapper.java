package com.zhubajie.crmchance.dao.ecb.mapper;

import com.zhubajie.crmchance.dao.ecb.entity.XXX;
import com.zhubajie.crmchance.dao.ecb.entity.XXXExample;
import com.zhubajie.huixiao.center.dao.huixiao.entity.HxPermit;
import com.zhubajie.huixiao.center.dao.huixiao.entity.HxPermitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XXXMapper {
    int countByExample(XXXExample example);

    int deleteByExample(XXXExample example);

    int deleteByPrimaryKey(Integer permitId);

    int insert(XXX record);

    int insertSelective(XXX record);

    List<XXX> selectByExample(XXXExample example);

    XXX selectByPrimaryKey(Integer permitId);

    int updateByExampleSelective(@Param("record") XXX record, @Param("example") XXXExample example);

    int updateByExample(@Param("record") XXX record, @Param("example") XXXExample example);

    int updateByPrimaryKeySelective(XXX record);

    int updateByPrimaryKey(XXX record);

    int insertBatch(List<XXX> list);

}
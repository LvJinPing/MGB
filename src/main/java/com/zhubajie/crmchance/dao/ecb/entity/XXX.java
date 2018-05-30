package com.zhubajie.crmchance.dao.ecb.entity;

import java.io.Serializable;
import java.util.Date;

public class XXX implements Serializable {
    /**
     * ID
     */
    private Integer permitId;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 操作人
     */
    private Integer operator;

    /**
     * 权限类型:0-管理;1-浏览
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private String operatorName;

    private String groupName;

    private String groupNamePath;

    private static final long serialVersionUID = 1L;


}
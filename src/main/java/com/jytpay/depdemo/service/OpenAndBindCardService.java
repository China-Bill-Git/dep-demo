package com.jytpay.depdemo.service;

import com.jytpay.depdemo.vo.BaseJsonReqVo;

import java.util.Map;

/**
 * 开户绑卡
 * @author chencong@jytpay.com
 */
public interface OpenAndBindCardService {

    /**
     * 获得加密之后的请求参数
     * @param params 加密之前明文数据
     * @return
     */
    BaseJsonReqVo getReqJson(Map<String,String> params);
}

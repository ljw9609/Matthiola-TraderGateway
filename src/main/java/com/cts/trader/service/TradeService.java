package com.cts.trader.service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author lvjiawei
 * @date 2018/6/5
 * @description TradeService接口
 * @version 1.0.0
 **/
public interface TradeService {
    /**
     * 获取交易记录
     * @param futuresID 期货ID
     * @param page      页数
     * @param request   http请求
     * @return Map      交易记录
     */
    Map getTrades(String futuresID, String page, HttpServletRequest request);
}

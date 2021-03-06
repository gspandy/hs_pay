package com.hszsd.webpay.controller;

import com.hszsd.webpay.service.TradeRecordService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 公用控制器
 * 用于处理主页、错误页面跳转
 * Created by gzhengDu on 2016/7/1.
 */
@Controller
public class CommonController {

    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    @Autowired
    TradeRecordService tradeRecordService;

    /**
     * 主页跳转
     * @param request
     * @param response
     * @return
     */
    @RequestMapping({"/index","/"})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map = new HashMap<String, Object>();

        return new ModelAndView("common/index","map", map);
    }

    /**
     * 根据错误代码跳转到相应错误页面
     * @param request
     * @param response
     * @param number 错误代码
     * @return
     */
    @RequestMapping({"/error/{number}"})
    public ModelAndView errorPage(HttpServletRequest request, HttpServletResponse response, @PathVariable("number") final Long number){
        Map<String, Object> map = new HashMap<String, Object>();

        return new ModelAndView(StringUtils.join("common/",number), "map", map);
    }

    /**
     * 商户确认接收到异步通知接口
     * @param request
     * @param response
     * @param transId 交易流水号
     * @return
     */
    @RequestMapping({"/confirm"})
    public void confirm(HttpServletRequest request, HttpServletResponse response, String transId){
        tradeRecordService.delTradeCallbackByTransId(transId);
    }
}

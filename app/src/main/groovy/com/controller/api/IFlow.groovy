package com.controller.api


import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE



/**
 * 业务流外部服务接口
 *
 * @author wxf
 */
@RequestMapping(value = '/api', produces = APPLICATION_JSON_VALUE)
interface IFlow {

    /**
     * 分配业务员
     * @param DPolicy 保单
     * @return 标准响应格式
     */
    @GetMapping('/flow/business')
    ResponseEntity sayHello()

    /**
     * 分配业务员
     * @param DPolicy 保单
     * @return 标准响应格式
     */
    @GetMapping('/flow/integration')
    ResponseEntity test()

}

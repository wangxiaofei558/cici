package com.controller.impl

import com.annotation.ClearCache
import com.controller.api.IFlow
import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor
import groovy.util.logging.Slf4j
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RestController



/**
 * 流程外部接口实现
 *
 */
@CompileStatic
@Slf4j
@TupleConstructor(defaults = false, includeFields = true)
@RestController
@Validated
class Flow implements IFlow {

    @Override
    @ClearCache(['为人民服务', '同志们辛苦了'])
    ResponseEntity sayHello() {
        return new ResponseEntity('你好猴嘟嘟', HttpStatus.OK)
    }

}

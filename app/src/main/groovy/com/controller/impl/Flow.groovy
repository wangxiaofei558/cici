package com.controller.impl

import com.annotation.ClearCache
import com.controller.api.IFlow
import com.service.EntityNeedChangeService
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

//    private EntityNeedChangeService entityNeedChangeService

    private StringRedisTemplate stringRedisTemplate

    @Override
    @ClearCache(['为人民服务', '同志们辛苦了'])
    ResponseEntity sayHello() {
        return new ResponseEntity('你好侯娟', HttpStatus.OK)
    }

    @Override
    ResponseEntity test() {
//        entityNeedChangeService.send(new Object(), [entityChangeType: new Object()])

        stringRedisTemplate.opsForSet().add('abc', '123456789')

        stringRedisTemplate.opsForSet().remove('abc', '123456789')

        ['5_abc', '10_abc', '60_abc', '360_abc'].iterator()


        return new ResponseEntity('你好侯娟', HttpStatus.OK)
    }
}

package com.cheche365.integration.handle


import com.cheche365.integration.model.Message
import com.cheche365.integration.step.IHandler
import groovy.transform.TupleConstructor
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Component



/**
 * Created by wxf on 2019/8/24.
 */
@Slf4j
@Component
@TupleConstructor(includeFields = true)
class PolicyUrlHandler implements IHandler<Message> {

    @Override
    Message handle(Message payload) {
        payload
    }

}

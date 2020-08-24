package com.service

import com.cheche365.integration.model.Message
import com.cheche365.integration.EntityNeedChangeMessageGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component



/**
 * Created by liheng on 2018/4/12 0012.
 */
@Component
class EntityNeedChangeService {

    @Autowired
    private EntityNeedChangeMessageGateway messageGateway

    def send(Object obj, Map<String, Object> headerMapping) {
        messageGateway.entityNeedChange new Message(obj).addHeaders(headerMapping)
    }

}

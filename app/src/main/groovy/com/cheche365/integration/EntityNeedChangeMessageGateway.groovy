package com.cheche365.integration

import com.cheche365.integration.model.Message
import org.springframework.integration.annotation.Gateway
import org.springframework.integration.annotation.MessagingGateway



/**
 * Created by liheng on 2018/11/19 0019.
 */
@MessagingGateway
interface EntityNeedChangeMessageGateway {

    @Gateway(requestChannel = 'entityNeedChangeChannel')
    void entityNeedChange(Message message)

}

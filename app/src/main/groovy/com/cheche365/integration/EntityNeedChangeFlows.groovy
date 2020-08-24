package com.cheche365.integration

import com.cheche365.integration.TIntegrationFlows
import com.cheche365.integration.endpoint.Handler
import com.cheche365.integration.endpoint.Router
import com.cheche365.integration.endpoint.frompoint.MessageChannelFrom
import com.cheche365.integration.handle.PolicyUrlHandler
import com.cheche365.integration.model.MessageChannel
import org.springframework.stereotype.Component

import static com.cheche365.integration.endpoint.Router.DEFAULT_DONE



/**
 * 实体变化消息流程
 */
@Component
class EntityNeedChangeFlows implements TIntegrationFlows {

    //<editor-fold defaultstate="collapsed" desc="消息渠道">
    final MessageChannel _ENTITY_NEED_CHANGE_CHANNEL = new MessageChannel('entityNeedChangeChannel', MessageChannel.ChannelType.QUEUE)
    //</editor-fold>

    Map _STEP_NAME_CLAZZ_MAPPINGS = [
            实体变化消息来源: new MessageChannelFrom(_ENTITY_NEED_CHANGE_CHANNEL),
            判断实体类型  : new Router('payload.payloadClassType'),
            保单状态更新  : new Handler(PolicyUrlHandler)
    ]

    private final _ENTITY_CHANGE_FLOW = flowBuilder.call {
        实体变化消息来源 >> route('判断实体类型', [
                policy: { 保单状态更新 }
        ], DEFAULT_DONE)
    }

    List _FLOWS = [
            _ENTITY_CHANGE_FLOW
    ]

}

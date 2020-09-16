package com.app.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.StringRedisTemplate



/**
 * Spring配置类
 *
 * Created by wxf
 */
@Configuration
@ComponentScan([
        'com.controller',
        'com.aspect',
        'com.service'
])
class AppConfig {

    @Bean
    StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        new StringRedisTemplate(redisConnectionFactory)
    }
}

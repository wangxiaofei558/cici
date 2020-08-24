package com.app

import org.springframework.boot.autoconfigure.SpringBootApplication

import static org.springframework.boot.SpringApplication.run



/**
 * 应用执行器
 * Created by wxf
 */
@SpringBootApplication
class AppLauncher {

    /**
     * 执行器主方法
     * @param args 命令行参数
     */
    static void main(String[] args) {
        run AppLauncher, args
    }

}

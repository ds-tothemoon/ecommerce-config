package com.autoever.configmodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigModuleApplication

fun main(args: Array<String>) {
	runApplication<ConfigModuleApplication>(*args)
}

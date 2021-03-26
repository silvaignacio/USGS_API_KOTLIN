package cl.dominalo.usgs_api_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients("cl.dominalo.usgs_api_demo.clients")
class UsgsApiDemoApplication

fun main(args: Array<String>) {
    runApplication<UsgsApiDemoApplication>(*args)
}

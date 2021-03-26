package cl.dominalo.usgs_api_demo.clients.usgs

import cl.dominalo.usgs_api_demo.clients.usgs.response.UsgsResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "terremoto-client", url = "\${terremoto.url}")
interface UsgsClient {

    @GetMapping
    fun getEartquakes(): UsgsResponse?
}
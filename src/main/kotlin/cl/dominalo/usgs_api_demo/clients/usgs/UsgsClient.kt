package cl.dominalo.usgs_api_demo.clients.usgs

import cl.dominalo.usgs_api_demo.clients.usgs.response.UsgsResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "terremoto-client", url = "\${terremoto.url}")
interface UsgsClient {

    @GetMapping
    fun getEartquakes(@RequestParam format:String? = "geojson", @RequestParam starttime: String, @RequestParam endtime: String): UsgsResponse?
}
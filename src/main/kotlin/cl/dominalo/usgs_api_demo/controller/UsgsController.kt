package cl.dominalo.usgs_api_demo.controller

import cl.dominalo.usgs_api_demo.model.Eartquake
import cl.dominalo.usgs_api_demo.service.UsgsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/terremoto")
class UsgsController(@Autowired private val terremotoService: UsgsService) {

    @get:GetMapping
    val terremotos: List<Eartquake?>?
        get() = terremotoService.getEartquakes()
}
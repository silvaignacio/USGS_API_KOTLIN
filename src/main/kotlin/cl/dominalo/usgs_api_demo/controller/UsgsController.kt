package cl.dominalo.usgs_api_demo.controller

import cl.dominalo.usgs_api_demo.model.Eartquake
import cl.dominalo.usgs_api_demo.service.UsgsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/terremoto")
open class UsgsController(@Autowired private val terremotoService: UsgsService) {

    @GetMapping("")
    open fun subirDocumento(@RequestParam startDate: String, @RequestParam finalDate: String): List<Eartquake> {
        return terremotoService.getEartquakes(startDate, finalDate)
    }
}
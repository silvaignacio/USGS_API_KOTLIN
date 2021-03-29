package cl.dominalo.usgs_api_demo.service.impl

import cl.dominalo.usgs_api_demo.clients.usgs.UsgsClient
import cl.dominalo.usgs_api_demo.model.Eartquake
import cl.dominalo.usgs_api_demo.service.UsgsService
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
@Slf4j
class UsgsServiceImpl(private val client: UsgsClient) : UsgsService {

    private val logger = LoggerFactory.getLogger(javaClass)

    override fun getEartquakes(startDate: String, finalDate: String): List<Eartquake> {
        val eartquakesList = client.getEartquakes("geojson", startDate, finalDate)
        logger.info("Eartquake list {}", eartquakesList)
        val terremotoList: MutableList<Eartquake> = ArrayList()

        eartquakesList?.features?.forEach { item ->
            terremotoList
                    .add(Eartquake(item.properties?.title, item.properties?.mag, item.properties?.place))

        }
        return terremotoList
    }
}
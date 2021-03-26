package cl.dominalo.usgs_api_demo.service

import cl.dominalo.usgs_api_demo.model.Eartquake

interface UsgsService {
    fun getEartquakes(startDate: String, finalDate: String): List<Eartquake>
}
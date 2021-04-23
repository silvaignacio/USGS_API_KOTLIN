package cl.dominalo.usgs_api_demo.model

import java.time.LocalDateTime

data class Eartquake(
    val title: String?,
    val mag: Long?,
    val updated: LocalDateTime,
    val place: String?,
    val coordinates: List<Double?>,
    val radius: Long = 12000)
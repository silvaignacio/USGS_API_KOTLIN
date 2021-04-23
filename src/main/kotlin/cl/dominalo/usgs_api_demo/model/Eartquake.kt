package cl.dominalo.usgs_api_demo.model

data class Eartquake(val title: String?,
                     val mag: Long?,
                     val place: String?,
                     val coordinates: List<Double?>,
                     val radius: Long = 3616)
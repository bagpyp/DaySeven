import kotlinx.serialization.Serializable

@Serializable
data class BagRule(
    val color: String,
    val contains: List<Contain>
)

@Serializable
data class Contain(
    val color: String,
    val count: Int
)


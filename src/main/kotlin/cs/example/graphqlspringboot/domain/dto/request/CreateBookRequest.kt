package cs.example.graphqlspringboot.domain.dto.request

data class CreateBookRequest(
    var name: String,
    var pageCount: Int,
    var price: Float
)

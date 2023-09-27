package cs.example.graphqlspringboot.domain.dto.response

data class CreateBookResponse(
    var name: String,
    var pageCount: Int,
    var price: Float
)
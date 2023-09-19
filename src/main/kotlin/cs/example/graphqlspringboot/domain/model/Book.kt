package cs.example.graphqlspringboot.domain.model

import cs.example.graphqlspringboot.domain.model.Author

data class Book(
    val id: Int,
    val name: String,
    val pageCount: Int,
    val author: Author
)

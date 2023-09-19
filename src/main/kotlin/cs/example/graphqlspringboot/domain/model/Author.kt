package cs.example.graphqlspringboot.domain.model

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

data class Author(
    @Id
    @GeneratedValue
    val id: Int,
    val firstName: String,
    val lastName: String
)

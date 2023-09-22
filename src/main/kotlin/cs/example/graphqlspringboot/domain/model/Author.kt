package cs.example.graphqlspringboot.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "authors")
open class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(name = "first_name")
    var firstName: String,
    @Column(name = "last_name")
    var lastName: String
)
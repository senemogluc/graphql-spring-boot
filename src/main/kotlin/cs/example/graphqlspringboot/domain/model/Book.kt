package cs.example.graphqlspringboot.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "books")
open class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    @Column(name = "page_count")
    val pageCount: Int,
)

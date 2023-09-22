package cs.example.graphqlspringboot.domain.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "books")
open class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    var name: String,
    @Column(name = "page_count")
    var pageCount: Int,
    var price: Float
)

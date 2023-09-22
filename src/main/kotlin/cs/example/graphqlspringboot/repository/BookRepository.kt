package cs.example.graphqlspringboot.repository

import cs.example.graphqlspringboot.domain.model.Author
import cs.example.graphqlspringboot.domain.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BookRepository : JpaRepository<Book, Int> {

    override fun findById(id: Int): Optional<Book>
}
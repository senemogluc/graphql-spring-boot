package cs.example.graphqlspringboot.repository

import cs.example.graphqlspringboot.domain.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Int> {
}
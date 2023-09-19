package cs.example.graphqlspringboot.service

import cs.example.graphqlspringboot.domain.model.Book
import cs.example.graphqlspringboot.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {

    fun save(book: Book): Book {
        return bookRepository.save(book)
    }

}
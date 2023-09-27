package cs.example.graphqlspringboot.service

import cs.example.graphqlspringboot.domain.model.Book
import cs.example.graphqlspringboot.repository.BookRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService(private val bookRepository: BookRepository) {

    fun save(book: Book): Book {
        return bookRepository.save(book)
    }

    fun getAll(): List<Book>{
        return bookRepository.findAll()
    }

    fun findById(id: Int): Optional<Book> {
        return bookRepository.findById(id)
    }

    fun deleteById(id: Int){
        return bookRepository.deleteById(id)
    }
}

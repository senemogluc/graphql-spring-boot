package cs.example.graphqlspringboot.resolver.query

import cs.example.graphqlspringboot.domain.model.Book
import cs.example.graphqlspringboot.service.BookService
import io.leangen.graphql.annotations.GraphQLQuery
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi
import org.springframework.stereotype.Component
import java.util.*

@Component
@GraphQLApi
class BookQuery(private val bookService: BookService){

    @GraphQLQuery
    fun books(): List<Book>{
        return bookService.getAll()
    }

    @GraphQLQuery
    fun book(id: Int): Optional<Book> {
        return bookService.findById(id)
    }
}

package cs.example.graphqlspringboot.resolver.mutation

import cs.example.graphqlspringboot.domain.dto.request.CreateBookRequest
import cs.example.graphqlspringboot.domain.dto.response.CreateBookResponse
import cs.example.graphqlspringboot.mapper.BookMapper
import cs.example.graphqlspringboot.service.BookService
import io.leangen.graphql.annotations.GraphQLMutation
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Component

@Component
@GraphQLApi
class BookMutation(private val bookService: BookService){

    @GraphQLMutation
    fun saveBook(createBookRequest: CreateBookRequest): CreateBookResponse{
        val converter = Mappers.getMapper(BookMapper::class.java)
        val savedBook = bookService.save(converter.bookRequestToBook(createBookRequest))
        return converter.bookToBookResponse(savedBook)
    }

    @GraphQLMutation
    fun deleteBook(id: Int): String{
        bookService.deleteById(id)
        return "Book with id: {$id} has been deleted!"
    }
}

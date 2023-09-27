package cs.example.graphqlspringboot.mapper

import cs.example.graphqlspringboot.domain.dto.request.CreateBookRequest
import cs.example.graphqlspringboot.domain.dto.response.CreateBookResponse
import cs.example.graphqlspringboot.domain.model.Book
import org.mapstruct.Mapper

@Mapper
interface BookMapper {

    fun bookRequestToBook(createBookRequest: CreateBookRequest): Book

    fun bookToBookResponse(book: Book): CreateBookResponse
}

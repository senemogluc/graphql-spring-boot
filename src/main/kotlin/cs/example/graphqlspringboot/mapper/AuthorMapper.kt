package cs.example.graphqlspringboot.mapper

import cs.example.graphqlspringboot.domain.dto.request.AuthorRequest
import cs.example.graphqlspringboot.domain.model.Author
import org.mapstruct.Mapper

@Mapper
interface AuthorMapper {

    fun authorRequestToAuthor(authorRequest: AuthorRequest): Author
}
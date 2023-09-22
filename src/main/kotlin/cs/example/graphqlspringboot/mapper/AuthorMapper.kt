package cs.example.graphqlspringboot.mapper

import cs.example.graphqlspringboot.domain.dto.request.CreateAuthorRequest
import cs.example.graphqlspringboot.domain.dto.response.CreateAuthorResponse
import cs.example.graphqlspringboot.domain.model.Author
import org.mapstruct.Mapper

@Mapper
interface AuthorMapper {

    fun authorRequestToAuthor(createAuthorRequest: CreateAuthorRequest): Author

    fun authorToAuthorResponse(author: Author): CreateAuthorResponse
}
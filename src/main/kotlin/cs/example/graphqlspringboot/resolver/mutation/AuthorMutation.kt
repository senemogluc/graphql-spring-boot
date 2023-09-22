package cs.example.graphqlspringboot.resolver.mutation

import cs.example.graphqlspringboot.domain.dto.request.CreateAuthorRequest
import cs.example.graphqlspringboot.domain.dto.response.CreateAuthorResponse
import cs.example.graphqlspringboot.mapper.AuthorMapper
import cs.example.graphqlspringboot.service.AuthorService
import io.leangen.graphql.annotations.GraphQLMutation
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Component

@Component
@GraphQLApi
class AuthorMutation(private val authorService: AuthorService){

    @GraphQLMutation
    fun saveAuthor(createAuthorRequest: CreateAuthorRequest): CreateAuthorResponse {
        val converter = Mappers.getMapper(AuthorMapper::class.java)
        val savedAuthor = authorService.save(converter.authorRequestToAuthor(createAuthorRequest))
        return converter.authorToAuthorResponse(savedAuthor)
    }

    @GraphQLMutation
    fun deleteAuthor(id: Int): String{
        authorService.deleteById(id)
        return "Author with id: {$id} has been deleted!"
    }
}
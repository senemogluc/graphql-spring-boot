package cs.example.graphqlspringboot.resolver.mutation

import cs.example.graphqlspringboot.domain.dto.request.AuthorRequest
import cs.example.graphqlspringboot.domain.dto.response.AuthorResponse
import cs.example.graphqlspringboot.domain.model.Author
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
    fun saveAuthor(authorRequest: AuthorRequest): Author {
        val converter = Mappers.getMapper(AuthorMapper::class.java)
        return authorService.save(converter.authorRequestToAuthor(authorRequest))
    }
}
package cs.example.graphqlspringboot.resolver.query

import cs.example.graphqlspringboot.domain.model.Author
import cs.example.graphqlspringboot.service.AuthorService
import io.leangen.graphql.annotations.GraphQLQuery
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi
import org.springframework.stereotype.Component
import java.util.*

@Component
@GraphQLApi
class AuthorQuery(private val authorService: AuthorService){

    @GraphQLQuery
    fun authors(): List<Author>{
        return authorService.getAll()
    }
    
    @GraphQLQuery
    fun author(id: Int): Optional<Author> {
        return authorService.findById(id)
    }
}

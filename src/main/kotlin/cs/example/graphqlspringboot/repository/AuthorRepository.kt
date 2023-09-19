package cs.example.graphqlspringboot.repository

import cs.example.graphqlspringboot.domain.model.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Int>{

}
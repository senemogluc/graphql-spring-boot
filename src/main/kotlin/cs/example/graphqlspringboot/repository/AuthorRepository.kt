package cs.example.graphqlspringboot.repository

import cs.example.graphqlspringboot.domain.model.Author
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AuthorRepository : JpaRepository<Author, Int>{

    override fun findById(id: Int): Optional<Author>
}

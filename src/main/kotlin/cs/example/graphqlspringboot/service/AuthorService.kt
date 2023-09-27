package cs.example.graphqlspringboot.service

import cs.example.graphqlspringboot.domain.model.Author
import cs.example.graphqlspringboot.repository.AuthorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthorService(private val authorRepository: AuthorRepository) {

    fun save(author: Author): Author {
        return authorRepository.save(author)
    }

    fun getAll(): List<Author>{
        return authorRepository.findAll()
    }

    fun findById(id: Int): Optional<Author> {
        return authorRepository.findById(id)
    }

    fun deleteById(id: Int){
        return authorRepository.deleteById(id)
    }
}

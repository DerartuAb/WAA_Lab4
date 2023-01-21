package waa.waa_lab1.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.waa_lab1.domain.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long> {
}

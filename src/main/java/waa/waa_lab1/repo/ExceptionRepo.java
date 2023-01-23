package waa.waa_lab1.repo;

import org.springframework.data.repository.CrudRepository;
import waa.waa_lab1.domain.Exception;

public interface ExceptionRepo extends CrudRepository<Exception,Long> {
}

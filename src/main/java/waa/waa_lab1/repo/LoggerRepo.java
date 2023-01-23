package waa.waa_lab1.repo;

import org.springframework.data.repository.CrudRepository;
import waa.waa_lab1.domain.Logger;

public interface LoggerRepo extends CrudRepository<Logger,Long> {
}

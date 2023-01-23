package waa.waa_lab1.springAOP;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import waa.waa_lab1.domain.User;
import waa.waa_lab1.repo.ExceptionRepo;
import waa.waa_lab1.repo.LoggerRepo;

public class ExceptionTimeAspect {

    @Autowired
    private LoggerRepo loggerRepo;

    @Autowired
    private static User users;

    @Autowired
    private static ExceptionRepo exceptionRepo;










    @Pointcut("@annotation(ExecutionTime)")
    public void executionTimeAnnotation(){

    }


}

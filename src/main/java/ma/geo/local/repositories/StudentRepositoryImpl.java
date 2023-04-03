package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repo1")

public class StudentRepositoryImpl implements StudentRepository{

    // on utilise les loggers pour detecter les erreurs sur quel ligne(pour tracer les erreurs)
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryImpl.class);

    public StudentRepositoryImpl()
    {

    }
    @Override
    public StudentEntity save(StudentEntity entity) {
        LOGGER.debug("Start method save");
        return null;
    }

    @Override
    public StudentEntity update(StudentEntity entity) {
        LOGGER.debug("Start method update");
        return null;
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Start method delete");
        return false;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("Start method selectAll");
        return null;
    }
}

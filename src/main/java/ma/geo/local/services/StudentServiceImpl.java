package ma.geo.local.services;

import ma.geo.local.mappers.StudentMapper;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")

public class StudentServiceImpl implements StudentService{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;
    //l'injection se fait de deux façons : @Autowired ou par constructeur

    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentDTO save(StudentDTO dto) {
        LOGGER.debug("Start method save");
        return studentMapper.convertEntityToDto(studentRepository.save(studentMapper.convertDtoToEntity(dto)));
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
        LOGGER.debug("Start method update");
        return studentMapper.convertEntityToDto(studentRepository.save(studentMapper.convertDtoToEntity(dto)));
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Start method delete");
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start method selectAll");
        return studentMapper.convertEntitiesToDtos(studentRepository.selectAll());
    }
}

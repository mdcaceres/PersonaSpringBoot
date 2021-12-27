package Spring.Learn.LearningSpringBoot.Services;

import Spring.Learn.LearningSpringBoot.Dao.IPersonDao;
import Spring.Learn.LearningSpringBoot.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final IPersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") IPersonDao personDao){
        this.personDao = personDao;
    }
    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.SelectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }

    public int deletePerson(UUID id){
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person person){
        return personDao.updatePersonById(id,person);
    }
}

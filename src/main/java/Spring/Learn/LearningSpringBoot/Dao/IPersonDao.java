package Spring.Learn.LearningSpringBoot.Dao;

import Spring.Learn.LearningSpringBoot.Models.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> SelectAllPeople();

    Optional<Person> selectPersonById(UUID id);
    int updatePersonById(UUID id, Person person);
    int deletePersonById(UUID id);
}

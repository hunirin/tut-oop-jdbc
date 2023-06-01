package _230531.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    PersonDAO personDAO = new PersonDAO();

    @BeforeEach
    void setUp() {
        personDAO.initPerson();
    }

    @Test
    void findByNamePerson() {
        String name = "leo";
        personDAO.insertPerson(name);
        assertEquals(name, personDAO.findByNamePerson(name).get().getName());
    }

    @Test
    void findAllPerson() {
        personDAO.insertPerson("leo");
        personDAO.insertPerson("yui");
        assertEquals("[001 leo, 002 yui]", personDAO.findAllPerson().toString());

    }

    @Test
    void insertPerson() {
        int cnt = personDAO.insertPerson("leo");
        assertEquals(1, cnt);
    }
}
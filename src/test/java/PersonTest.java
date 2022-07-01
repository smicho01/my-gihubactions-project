import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void should_returnCorrectPersonDetails () {
        Person person = new Person("Adam Smith", 44);
        assertEquals("Adam Smith", person.getName());
    }

}
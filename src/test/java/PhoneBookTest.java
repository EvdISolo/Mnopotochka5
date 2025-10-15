import org.example.PhoneBook;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook book=new PhoneBook();
        int count=book.add("Филипп","123456789");
        assertEquals(1,count);
    }
    @Test
        public void testFindByNumber() {
            PhoneBook pb = new PhoneBook();
            pb.add("Ivan", "12345");
            pb.add("Maria", "67590");
            pb.add("Филипп", "99999");
            String name = pb.findByNumber("99999");
            assertEquals("Филипп", name);
        }

        @Test
    public void testFindByName() {
        PhoneBook pb = new PhoneBook();
        pb.add("Ivan", "12345");
        pb.add("Maria", "67590");
        pb.add("Филипп", "99999");


        assertEquals("12345", pb.findByName("Ivan"));
        assertEquals("67590", pb.findByName("Maria"));
        assertEquals("99999", pb.findByName("Филипп"));
        assertNull( pb.findByName("Андрей"));
        }
@Test
    public void testPrintAllNames() {
       PhoneBook pb = new PhoneBook();
       assertEquals(Collections.emptyList().toString(), pb.printAllNames());
}
}

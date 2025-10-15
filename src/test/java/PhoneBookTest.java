import org.example.PhoneBook;
import org.junit.Test;

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

        String result = pb.findByNumber("123456");
        assertNull(result);
    }
}

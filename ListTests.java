import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
public class ListTests{
    @Test
    public void test1(){
        List<String>list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        List<String>result= new ArrayList<>();
        result.add("first");
        result.add("third");
        Chooser theChooser =new Chooser();
        list = ListExamples.filter(list,theChooser);
        assertEquals(result,list);

        
        


    }
}

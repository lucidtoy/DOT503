package JavaTpoint. JunitExamples;  
import java.util.ArrayList;  
import java.util.List;  
public class JunitTestCaseExample {  
    private List<String> students = new ArrayList<String>();  
    private List<String> students2 = new ArrayList<String>();  
  
    public void remove(String name) {  
        students.remove(name);  
    }
      
    public void add(String name) {  
        students.add(name2);  
    }  
  
    //feature for x and Z merged
    public void add_x(String name) {  
        students.add(name);  
    }

    public void removeAll(){  
        students.clear();  
    }
      
    public int sizeOfStudent() {  
        return students.size();  
    }  
      
}
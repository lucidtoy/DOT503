package JavaTpoint. JunitExamples;  
import java.util.ArrayList;  
import java.util.List;  
public class JunitTestCaseExample {  
    private List<String> students = new ArrayList<String>();  
  
    public void remove(String name) {  
        students.remove(name);  
    }  
    
     //feature for x
    public void add_x(String name) {  
        students.add();  
    }  
      
    public void removeAll(){  
        students.clear();  
    }  
      
    public int sizeOfStudent() {  
        return students.size();  
    }  
      
}

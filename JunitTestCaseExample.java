package JavaTpoint. JunitExamples;  
import java.util.ArrayList;  
import java.util.List;  
public class JunitTestCaseExample {  
    private List<String> students = new ArrayList<String>();  
  
    public void remove(String name) {  
        students.remove(name);  
    }  
    //this is the difference with feature-y  
    public void add_y(String name) {  
        students.add(name);  
    }  
      
    public void removeAll(){  
        students.clear();  
    }  
      
    public int sizeOfStudent() {  
        return students.size();  
    }  
      
}

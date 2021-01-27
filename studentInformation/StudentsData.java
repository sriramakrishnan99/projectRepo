package studentInformation;

import java.io.*;
import java.util.HashMap;

public class StudentsData {
    private HashMap<Long, StudentInformation> studentList = new HashMap<Long, StudentInformation>();

    public StudentsData(String fileName)throws IOException, ClassNotFoundException{
        File file = new File(fileName);
        try( FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); ) {
            StudentInformation studentInformation = null;

            while ((studentInformation = (StudentInformation)objectInputStream.readObject()) != null){
                studentList.put(studentInformation.getRollNumber(), studentInformation);
            }
        }
    }

    public StudentInformation getStudentData(Long rollNumber){
        return this.studentList.get(rollNumber);
    }
}

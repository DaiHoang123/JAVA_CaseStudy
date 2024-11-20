package repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modal.Student;

public class StudentRepository {

    public static final String SRC_STUDENT = "src/data/student.dat";

    public static List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        File file = new File(SRC_STUDENT);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi ko tim thay file");
        } catch (IOException e) {
            System.out.println("Loi doc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Loi khong tim thay class");
        }
        return studentList;
    }

    public static void writeFileBinary(List<Student> studentList) {
        File file = new File(SRC_STUDENT);
        try (FileOutputStream outputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            
            objectOutputStream.writeObject(studentList);
            
        } catch (FileNotFoundException e) {
            System.out.println("Loi khong tim thay file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            e.printStackTrace();
        }
    }
}

package modal;

public class Student {
    String IDNum;
    String Name;
    String Phone;
    String Email;

    public Student(){};

    public Student(String IDNum, String Name, String Phone, String Email){
        this.IDNum = IDNum;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public Student(String IDNum, String Name, String Phone){
        this.IDNum = IDNum;
        this.Name = Name;
        this.Phone = Phone;
    }

    public Student(String IDNum, String Name){
        this.IDNum = IDNum;
        this.Name = Name;
    }

    public String getIDNum(){
        return this.IDNum;
    }

    public String getName(){
        return this.Name;
    }
    public String getPhone(){
        return this.Phone;
    }

    public String getEmail(){
        return this.Email;
    }

    public void setIDNum(String IDNum){
        this.IDNum = IDNum;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setPhone(String Phone){
        this.Phone = Phone;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    @Override
    public String toString(){
        return "Student{" + "IDNum=" + IDNum + ", Name=" + Name + ", Phone=" + Phone + ", Email=" + Email + '}';
    }
}
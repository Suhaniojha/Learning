package Assignment3;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateofjoining;

    Employee(String id, String name, int age, Date dateofjoining){
        this.id = id;
        this.name=name;
        this.age = age;
        this.dateofjoining=dateofjoining;

    }
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Date getDateofjoining(){
        return dateofjoining;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;

        return Objects.equals(id, other.id);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateOfJoining=" + dateofjoining +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    transient private String password; // This field is normally not serialized

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    // Custom serialization
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject(); // Serialize non-transient fields
        oos.writeObject(password); // Serialize the transient field explicitly
    }

    // Custom deserialization
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject(); // Deserialize non-transient fields
        password = (String) ois.readObject(); // Deserialize the transient field
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "secret");

        // Serialize the Person object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Person object
        Person deserializedPerson = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            deserializedPerson = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Output the deserialized object
        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}

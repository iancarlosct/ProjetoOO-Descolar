public class Person {
    private String fullName;
    private String cpf;

    public Person() {}

    public Person(String fullName, String cpf) {
        this.fullName = fullName;
        this.cpf = cpf;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
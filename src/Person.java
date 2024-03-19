public class Person {

    private Integer dni;
    private String firstName;

    public Person() {
    }

    public Person(Integer dni, String firstName) {
        this.dni = dni;
        this.firstName = firstName;
    }


    public Integer getDni() {   ///devuelve
        return this.dni;
    }

    public void SetDni(Integer dni) {   ///le da valor
        this.dni = dni;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}


public class Human {
    private String name = null;
    private String surname = null;
    private String gender = null;
    private String phases = null;
    private int age = 0;

    public Human(){

    }
    public Human (String name, Phases phases){
        setName(name);
        setPhases(phases);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setPhases(String phases) {
        this.phases = phases;
    }
    public void setPhases(Phases phases) {
        this.phases = phases.name();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhases() {
        return phases;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender.name();
    }

    public enum Phases{
        Baby, Child, Teenage, Adult, Old
    }

    public enum Gender{
        Male, Female
    }

}

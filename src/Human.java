public class Human {
    private String _name = null;
    private String _surname = null;
    private String _phases = null;
    private int _age = 0;

    public Human(){

    }
    public Human (String name, Phases phases){
        set_name(name);
        set_phases(phases);
    }

    public void set_name(String name) {
        _name = name;
    }

    public void set_surname(String surname){
        _surname = surname;
    }

    public void set_phases(String phases) {
        _phases = phases;
    }
    public void set_phases(Phases phases) {
        _phases = phases.name();
    }

    public void set_age(int age) {
        _age = age;
    }

    public String get_name() {
        return _name;
    }

    public String get_surname() {
        return _surname;
    }

    public String get_phases() {
        return _phases;
    }

    public int get_age() {
        return _age;
    }

    public enum Phases{
        Baby, Child, Teenage, Adult, Old
    }

}

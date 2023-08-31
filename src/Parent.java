public class Parent extends Human{

    private String parentType;

    public String get_parentType() {
        return parentType;
    }

    public void set_parentType(parentType parentType) {
        this.parentType = parentType.name();
    }

    public enum parentType{
        Mother, Father
    }
}

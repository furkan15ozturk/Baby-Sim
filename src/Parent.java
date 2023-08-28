public class Parent extends Human{

    private String _parentType;

    public String get_parentType() {
        return _parentType;
    }

    public void set_parentType(parentType parentType) {
        _parentType = parentType.name();
    }

    public enum parentType{
        Mother, Father
    }
}

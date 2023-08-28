public class Baby extends Human{
    private boolean _dirtyDiapers = false;
    private boolean _hungry = false;
    private boolean _hasGas = false;
    private boolean _canEat = true;
    private int _eatingLimit = 5;

    public boolean is_dirtyDiapers() {
        return _dirtyDiapers;
    }

    public void set_dirtyDiapers(boolean dirtyDiapers) {
        _dirtyDiapers = dirtyDiapers;
    }

    public boolean is_hungry() {
        return _hungry;
    }

    public void set_hungry(boolean hungry) {
        _hungry = hungry;
    }

    public boolean is_hasGas() {
        return _hasGas;
    }

    public void set_hasGas(boolean hasGas) {
        _hasGas = hasGas;
    }

    public boolean is_canEat() {
        return _canEat;
    }

    public void set_canEat(boolean canEat) {
        _canEat = canEat;
    }

    public int get_eatingLimit() {
        return _eatingLimit;
    }

    public void set_eatingLimit(int eatingLimit) {
        _eatingLimit = eatingLimit;
    }

    public enum babyStatus{
        Happy, Sad, Crying, Angry, Laughing
    }
}

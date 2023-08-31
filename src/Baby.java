public class Baby extends Human{
    private boolean dirtyDiapers = false;
    private boolean hungry = false;
    private boolean hasGas = false;
    private boolean canEat = true;
    private int eatingLimit = 5;
    private String babyState = null;

    public boolean isDirtyDiapers() {
        return dirtyDiapers;
    }

    public void setDirtyDiapers(boolean dirtyDiapers) {
        this.dirtyDiapers = dirtyDiapers;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHasGas() {
        return hasGas;
    }

    public void setHasGas(boolean hasGas) {
        this.hasGas = hasGas;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    public int getEatingLimit() {
        return eatingLimit;
    }

    public void setEatingLimit(int eatingLimit) {
        this.eatingLimit = eatingLimit;
    }

    public String getBabyState() {
        return babyState;
    }

    public void setBabyState(String babyState) {
        this.babyState = babyState;
    }
    public void setBabyState(Events.events event) {
        this.babyState = event.name();
    }
}

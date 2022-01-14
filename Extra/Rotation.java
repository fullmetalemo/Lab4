package Extra;

public enum Rotation {
    DOWN("Вниз"),
    UP("Вверх");

    private final String rotation;

    Rotation(String rotation){
        this.rotation = rotation;

    }

    public String getRotation(){
        return rotation;
    }

}

package Lab3.Ex2;

public class Head
{
    private Human human;
    private Boolean exist;

    public Head(Human human, Boolean exist) {
        this.human = human;
        this.exist = exist;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
        if (!exist)
            human.setExist(false);
    }
}
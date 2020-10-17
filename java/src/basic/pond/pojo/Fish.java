package basic.pond.pojo;

/**
 * @author chengwanli
 * @date 2020/10/11 12:24
 */


public class Fish {
    private Integer id;
    private String name;

    private void sleep(Integer time) {
        System.out.println(time);
    }

    public void drinkWater(String water) {
        System.out.println(water);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

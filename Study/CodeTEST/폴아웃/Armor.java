package 폴아웃;

public class Armor
{
    private String armor_name;
    private int armor_point;
    private int weight;

    Armor(String armor_name, int armor_point, int weight)
    {
        this.armor_name = armor_name;
        this.armor_point = armor_point;
        this.weight = weight;
    }

    protected String Armor_Name()
    {
        return this.armor_name;
    }

    protected int Armor_Point()
    {
        return this.armor_point;
    }

    protected int Weight()
    {
        return this.weight;
    }

}

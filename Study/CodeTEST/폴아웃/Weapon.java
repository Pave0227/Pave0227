package 폴아웃;

public class Weapon
{

    private String weapon_name;
    private int damage;
    private int attack_type; // 0 = 근거리 , 1 = 원거리
    private int acc; // 명중률
    private int reduce_ap; // 소모되는 액션포인트
    private int weight;

    Weapon(String weapon_name, int damage, int attack_type, int acc, int reduce_ap, int weight)
    {
        this.weapon_name = weapon_name;
        this.damage = damage;
        this.attack_type = attack_type;
        this.acc = acc;
        this.reduce_ap = reduce_ap;
        this.weight = weight;

    }

    protected String Weapon_name()
    {
        return this.weapon_name;
    }

    protected int Weapon_Damage()
    {
        return this.damage;
    }

    protected int Weapon_type()
    {
        return this.attack_type;
    }

    protected int Weapon_Acc()
    {
        return this.acc;
    }

    protected int Reduce_Ap()
    {
        return this.reduce_ap;
    }

    protected int Weight()
    {
        return this.weight;
    }
}

package 폴아웃;

public class Enemy
{
    private String name;

    private int hp;

    private int damage;

    private int dt;

    Enemy(String name, int hp, int damage, int dt)
    {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.dt = dt;
    }

    protected String Enemy_Name()
    {
        return this.name;
    }

    protected int Hp()
    {
        return this.hp;
    }

    protected void Hp_Change(int hit)
    {
        this.hp += this.dt - hit;
    }

    protected int Damage()
    {
        return this.damage;
    }

    protected int Dt()
    {
        return this.dt;
    }
}

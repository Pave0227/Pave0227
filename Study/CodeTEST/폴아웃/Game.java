package 폴아웃;

import java.util.Scanner;

public class Game
{
    public static void main(String[] arg)
    {
        boolean game_over = false;
        Player player = new Player();

        Enemy enemy_1 = new Enemy("파우더 갱 단원", 50, 15, 5);
        Enemy enemy_2 = new Enemy("마이얼럭 헌터", 100, 25, 10);
        Enemy enemy_3 = new Enemy("인스티튜드 추적자", 150, 20, 10);

        Enemy[] enemy_list =
        { enemy_1, enemy_2, enemy_3 };
        player.Player_Setting();

        while (!game_over)
        {
            for (Enemy ene : enemy_list)
            {
                try
                {
                    game_over = In_Counter(player, ene);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    private static boolean In_Counter(Player player, Enemy enemy) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);

        if ((int) (Math.random() * 10 + 1) < player.Per())
        {

            System.out.println("전방에 " + enemy.Enemy_Name() + "이 보입니다. ");
            System.out.println("아직 나를 발견하지 못했습니다.\n");

            while (enemy.Hp() > 0 && player.Hp() > 0)
            {
                if (player.Weapon_1().Weapon_type() == 0)
                {
                    System.out.println("1 - " + player.Weapon_1().Weapon_name() + "로 타격합니다.");
                }
                else
                {
                    System.out.println("1 - " + player.Weapon_1().Weapon_name() + "로 사격합니다.");
                }

                if (player.Weapon_2().Weapon_type() == 0)
                {
                    System.out.println("2 - " + player.Weapon_2().Weapon_name() + "로 타격합니다.");
                }
                else
                {
                    System.out.println("2 - " + player.Weapon_2().Weapon_name() + "로 사격합니다.");
                }

                switch (sc.nextInt())
                {
                case 1:
                {
                    if ((int) (Math.random() * 100) <= player.Weapon_1().Weapon_Acc())
                    {
                        if ((int) ((Math.random() * 100)) <= player.Crt())
                        {
                            System.out.print(player.Crt());
                            System.out.println("치명타!");
                            System.out
                                    .println((player.Weapon_1().Weapon_Damage() * 2) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                            enemy.Hp_Change(player.Weapon_1().Weapon_Damage() * 2);
                            System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                        }
                        else
                        {
                            System.out.println((player.Weapon_1().Weapon_Damage()) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                            enemy.Hp_Change(player.Weapon_1().Weapon_Damage());
                            System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());

                        }
                    }
                    else
                    {
                        System.out.println("공격이 빗나갔습니다.");
                        System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                    }
                    break;

                }
                case 2:
                {
                    if ((int) (Math.random() * 100) <= player.Weapon_2().Weapon_Acc())
                    {
                        if ((int) (Math.random() * 100) <= player.Crt())
                        {
                            System.out.print(player.Crt());

                            System.out.println("치명타!");
                            System.out
                                    .println((player.Weapon_2().Weapon_Damage() * 2) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                            enemy.Hp_Change(player.Weapon_2().Weapon_Damage() * 2);
                            System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                        }
                        else
                        {
                            System.out.println((player.Weapon_2().Weapon_Damage()) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                            enemy.Hp_Change(player.Weapon_2().Weapon_Damage());
                            System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());

                        }
                    }
                    else
                    {
                        System.out.println("공격이 빗나갔습니다.");
                        System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                    }
                    break;

                }
                }

                Thread.sleep(2000);

                System.out.println(enemy.Enemy_Name() + "의 공격");
                player.Hp_Change(enemy.Damage() - player.Armor().Armor_Point() < 0 ? 0
                        : enemy.Damage() - player.Armor().Armor_Point());

                System.out.println(enemy.Damage() - player.Armor().Armor_Point() < 0 ? 0
                        : enemy.Damage() - player.Armor().Armor_Point() + "의 데미지을 입었습니다.");
                System.out.println("나의 남은 체력 :" + player.Hp());

            }

        }
        else
        {
            if (player.Weapon_1().Weapon_type() == 0)
            {
                System.out.println("1 - " + player.Weapon_1().Weapon_name() + "로 타격합니다.");
            }
            else
            {
                System.out.println("1 - " + player.Weapon_1().Weapon_name() + "로 사격합니다.");
            }

            if (player.Weapon_2().Weapon_type() == 0)
            {
                System.out.println("2 - " + player.Weapon_2().Weapon_name() + "로 타격합니다.");
            }
            else
            {
                System.out.println("2 - " + player.Weapon_2().Weapon_name() + "로 사격합니다.");
            }

            switch (sc.nextInt())
            {
            case 1:
            {
                if ((int) (Math.random() * 100) + 1 <= player.Weapon_1().Weapon_Acc())
                {
                    if ((int) (Math.random() * 100) + 1 <= player.Crt())
                    {
                        System.out.println("치명타!");
                        System.out.println((player.Weapon_1().Weapon_Damage() * 2) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                        enemy.Hp_Change(player.Weapon_1().Weapon_Damage() * 2);
                        System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                    }
                    else
                    {
                        System.out.println((player.Weapon_1().Weapon_Damage()) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                        enemy.Hp_Change(player.Weapon_1().Weapon_Damage());
                        System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());

                    }
                }
                else
                {
                    System.out.println("공격이 빗나갔습니다.");
                    System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                }
                break;
            }
            case 2:
            {
                if ((int) (Math.random() * 100) + 1 <= player.Weapon_2().Weapon_Acc())
                {
                    if ((int) (Math.random() * 100) + 1 <= player.Crt())
                    {
                        System.out.println("치명타!");
                        System.out.println((player.Weapon_2().Weapon_Damage() * 2) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                        enemy.Hp_Change(player.Weapon_2().Weapon_Damage() * 2);
                        System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                    }
                    else
                    {
                        System.out.println((player.Weapon_2().Weapon_Damage()) - enemy.Dt() + "의 데미지을 적중 시켰습니다.");
                        enemy.Hp_Change(player.Weapon_2().Weapon_Damage());
                        System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());

                    }
                }
                else
                {
                    System.out.println("공격이 빗나갔습니다.");
                    System.out.println(enemy.Enemy_Name() + "의 남은 HP" + enemy.Hp());
                }
                break;

            }
            }

            Thread.sleep(2000);

            System.out.println(enemy.Enemy_Name() + "의 공격");
            player.Hp_Change(enemy.Damage() - player.Armor().Armor_Point() < 0 ? 0
                    : enemy.Damage() - player.Armor().Armor_Point());

            System.out.println(enemy.Damage() - player.Armor().Armor_Point() < 0 ? 0
                    : enemy.Damage() - player.Armor().Armor_Point() + "의 데미지을 입었습니다.");
        }

        if (player.Hp() < 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}

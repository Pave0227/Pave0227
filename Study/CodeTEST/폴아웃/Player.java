package 폴아웃;

import java.io.IOException;
import java.util.Scanner;

class Player
{

        private String job;
        private String reason;
        private String name;

        private int hp;
        private int ap;

        private int crt;
        private int evs;

        private int carry_weight;

        private Weapon weapon_1; // 주
        private Weapon weapon_2; // 보조
        private Armor armor; // 방어구

        protected int Hp()
        {
                return this.hp;
        }

        protected void Hp_Change(int result)
        {
                this.hp += result;
        }

        protected int Ap()
        {
                return this.ap;
        }

        protected void Ap_Change(int result)
        {
                this.ap += result;
        }

        protected int Crt()
        {
                return this.crt;
        }

        protected int Evs()
        {
                return this.evs;
        }

        protected Weapon Weapon_1()
        {
                return this.weapon_1;
        }

        protected Weapon Weapon_2()
        {
                return this.weapon_2;
        }

        protected Armor Armor()
        {
                return this.armor;
        }
        // S.P.E.C.I.A.L ========================================

        private int strength; // 힘. 근접공격력 10% , 무게한계 20씩 증가, 방어구 요구치

        String[] str_list =
        { "1 - 불어터진 국수가락(Wet Noodle)", "2 - 떠내려온 해파리(Beached Jellyfish)", "3 - 갓난아이(Doughy Baby)",
                        "4 - 경량급(Lightweight)", "5 - 일반인(Average Joe)", "6 - 통 가슴(Barrel Chested)",
                        "7 - 해수욕장 양아치(Beach Bully)", "8 - 서커스 차력사(Circus Strongman)", "9 - 세기말 근육(Doomsday Pecs)",
                        "10 - 헤라클레스의 큰 사촌(Hercules' Bigger Cousin) " };

        private int perception; // 인지력. 원거리 공격 명중률 10%, 공격 우선권 , 상대방의 의도을 더 잘 파악하게 됩니다. 적 발견률

        String[] per_list =
        { "1 - 귀머거리 박쥐(Deaf Bat)", "2 - 노망난 두더지(Senile Mole)", "3 - 사시 도롱뇽(Squinting Newt)",
                        "4 - 방심하는 송어(Unsuspecting Trout)", "5 - 경계하는 송어(Wary Trout)", "6 - 기민한 코요테(Alert Coyote)",
                        "7 - 왕눈이 호랑이(Big-Eyed Tiger)", "8 - 외안경 낀 매(Monocled Falcon)", "9 - 매 저격수(Sniper Hawk)",
                        "10 - 망원경 쓰는 독수리(Eagle with Telescope)" };

        private int endurance; // 지구력. 기본 HP + 20, 상태이상 저항 5%

        String[] end_list =
        { "1 - 그냥 시체(Basically Dead)", "2 - 잘 부스러짐(Crumbly)", "3 - 구부리지 마시오(Do Not Bend)", "4 - 취급주의(Handle With Care)",
                        "5 - 얼룩방지(Stain-Resistant)", "6 - 튼튼(Hardy)", "7 - 굳센 못(Tough-as-nails)",
                        "8 - 내연제(Flame Retardant)", "9 - 방탄(Bullet Proof)", "10 - 막을 수 없음(Unstoppable)" };

        private int charisma; // 매력. 거래 할인율 5%, 설득 15%

        String[] cha_list =
        { "1 - 인간 혐오자(Misanthrope)", "2 - 늙은 은둔자(Old Hermit)", "3 - 오싹한 장의사(Creepy Undertaker)",
                        " 4 - 짜증내는 사서(Peevish Librarian)", "5 - 대리 교사(Substitute Teacher)",
                        "6 - 쾌활한 외판원(Cheery Salesman)", "7 - 외교관(Diplomat)", " 8 - 영화 배우(Movie Star)",
                        "9 - 카사노바(Casanova)", "10 - 사이비 교주(Cult Leader)" };

        private int intelligence; // 지능. 경험치 획득량 10% , 개조,과학관련 기술

        String[] int_list =
        { "1 - 벽돌 이하(Sub-Brick)", "2 - 채소(Vegetable)", "3 - 백치(Cretin)", "4 - 근육뇌(Knuckle Head)",
                        "5 - 상식은 있음(Knowledgeable)", "6 - 재능이 있음(Gifted)", "7 - 잘난놈(Smartypants)",
                        "8 - 만물박사(Know-It-All)", "9 - 천재(Genius)", "10 - 전지전능(Omniscient)" };

        private int agility; // 민첩성. AP +10 ,회피율

        String[] agi_list =
        { "1 - 걸어다니는 재앙(Walking Disaster)", "2 - 사고를 잘 당함(Accident Prone)", "3 - 미련퉁이(Oaf)",
                        "4 - 어이쿠 손이 미끄러졌네(Butter Finger)", "5 - 통제 가능(Under Control)", "6 - 고양이 같음(Cat Like)",
                        "7 - 내 칼을 받아라(Knife Thrower)", "8 - 니 칼을 받았다(Knife Catcher)", "9 - 묘기의 달인(Acrobatic Marvel)",
                        "10 - 수면 보행(Walks on Water)" };

        private int luck; // 행운. 치명타율 2%. 좋은 아이템을 얻을 확률이 증가합니다. 5%

        String[] luc_list =
        { "1 - 검은 고양이 13마리(13 pitch-black cats)", "2 - 깨진 거울(Broken Gypsy Mirror)", "3 - 병든 알바트로스(Sickly Albatross)",
                        "4 - 쏟아진 소금(Spilled Salt)", "5 - 동전 튕기기(Coin Flip)", "6 - 밑장빼기(Stacked Deck)",
                        "7 - 럭키 세븐(Lucky 7)", "8 - 요정을 본사람(Leprechaun's Foot)", "9 - 스물 한 잎 클로버(21 Leaf Clover)",
                        "10 - 양쪽이 앞면인 동전 던지기(Two-Headed Coin Flip)" };

        private int add_point = 5;

        // ! =================================

        Player()
        {
                this.strength = 5;
                this.perception = 5;
                this.endurance = 5;
                this.charisma = 5;
                this.intelligence = 5;
                this.agility = 5;
                this.luck = 5;
        }

        protected void Player_Setting()
        {

                System.out.println();

                System.out.println("당신은 모하비 황무지을 건너는 여정을 떠나려고 합니다. ");

                System.out.println("이 여정을 떠나기 전에 당신의 직업은...");

                System.out.println();

                String[] job_arr =
                { "볼트텍 거주민", "건즈 용병", "동부 브라더후드 오브 스틸 패잔병", "캐러벤 상단원", "NCR 레인저" };

                for (int i = 0; i < job_arr.length; i++)
                {
                        System.out.println(i + 1 + " - " + job_arr[i]);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 :");

                Scanner scanner = new Scanner(System.in);

                this.job = job_arr[scanner.nextInt() - 1];

                switch (this.job)
                {
                case "볼트텍 거주민":
                        weapon_1 = new Weapon("10mm 권총", 10, 1, 100, 10, 5);
                        weapon_2 = new Weapon("없음", 0, 0, 0, 0, 0);
                        armor = new Armor("볼트 13 점프슈트", 7, 5);
                        break;
                case "건즈 용병":
                        weapon_1 = new Weapon(".308 헌팅 라이플", 20, 1, 90, 20, 10);
                        weapon_2 = new Weapon("컴뱃 나이프", 15, 0, 110, 13, 3);
                        armor = new Armor("ANA M2 방탄조끼", 14, 15);
                        break;
                case "동부 브라더후드 오브 스틸 패잔병":
                        weapon_1 = new Weapon("레이저 라이플", 30, 1, 85, 30, 15);
                        weapon_2 = new Weapon("없음", 0, 0, 0, 0, 0);

                        armor = new Armor("브라더후드 정찰 아머", 10, 10);
                        break;
                case "캐러벤 상단원":
                        weapon_1 = new Weapon("12 게이지 샷건", 45, 1, 70, 25, 8);
                        weapon_2 = new Weapon("없음", 0, 0, 0, 0, 0);

                        armor = new Armor("상단 복장", 9, 8);
                        break;
                case "NCR 레인저":
                        weapon_1 = new Weapon("레인저 세쿼이아(전설)", 25, 1, 95, 15, 10);
                        weapon_2 = new Weapon("없음", 0, 0, 0, 0, 0);

                        armor = new Armor("사막 위장무늬 폭동 진압복", 20, 20);
                        break;
                }

                System.out.println("내 직업은 : " + job);

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("이 여정을 떠나는 이유는...");

                System.out.println();

                String[] reason_arr =
                { "개인적인 복수때문에", "돈과 권력에 대한 열망으로", "방랑벽 때문에", "사랑 했던 사람이 죽어버려서", "고향에서 떠나도록 압력을 받아서" };

                for (int i = 0; i < reason_arr.length; i++)
                {
                        System.out.println(i + 1 + " - " + reason_arr[i]);
                }
                System.out.print("수치를 입력하세요 :");

                this.reason = reason_arr[scanner.nextInt() - 1];

                switch (this.reason)
                {
                case "개인적인 복수때문에":
                        this.strength += 2;
                        this.endurance += 1;
                        break;
                case "돈과 권력에 대한 열망으로":
                        this.perception += 2;
                        this.charisma += 1;
                        break;
                case "방랑벽 때문에":
                        this.agility += 2;
                        this.intelligence += 1;
                        break;
                case "사랑 했던 사람이 죽어버려서":
                        this.luck += 2;
                        this.perception += 1;
                        break;
                case "고향에서 떠나도록 압력을 받아서":
                        this.strength += 1;
                        this.endurance += 1;
                        this.agility += 1;
                        break;

                }

                System.out.println("내가 여정을 떠나는 이유는 : " + reason);

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.print("당신의 이름은...");

                this.name = scanner.next();

                System.out.println("내 이름은 : " + name);

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("선택지을 통해서 얻은 보너스는 다음과 같습니다.");

                System.out.println();

                System.out.println("주무장은 ... " + weapon_1.Weapon_name() + "\n 데미지 :  " + weapon_1.Weapon_Damage()
                                + "\n 명중률 : " + weapon_1.Weapon_Acc() + "\n AP 소모량 : " + weapon_1.Reduce_Ap()
                                + "\n 무게 : " + weapon_1.Weight());

                System.out.println();

                System.out.println("보조무장은 ... " + weapon_2.Weapon_name() + "\n 데미지 :  " + weapon_2.Weapon_Damage()
                                + "\n 명중률 : " + weapon_2.Weapon_Acc() + "\n AP 소모량 : " + weapon_2.Reduce_Ap()
                                + "\n 무게 : " + weapon_2.Weight());

                System.out.println();
                System.out.println("S.P.E.C.I.A.L");
                System.out.println("힘은     " + str_list[this.strength - 1]);
                System.out.println("인지력은 " + per_list[this.perception - 1]);
                System.out.println("지구력은 " + end_list[this.endurance - 1]);
                System.out.println("매력은   " + cha_list[this.charisma - 1]);
                System.out.println("지능은   " + int_list[this.intelligence - 1]);
                System.out.println("민첩은   " + agi_list[this.agility - 1]);
                System.out.println("행운은   " + luc_list[this.luck - 1]);

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("S.P.E.C.I.A.L 능력치을 커스텀합니다.");
                System.out.println();

                System.out.println("Enter을 누르면 계속 진행합니다.");

                try
                {
                        System.in.read();
                }
                catch (IOException e)
                {

                }

                Custom_SPECIAL();

        }

        protected int Str()
        {
                return this.strength;
        }

        protected int Per()
        {
                return this.perception;
        }

        protected int End()
        {
                return this.endurance;
        }

        protected int Cha()
        {
                return this.charisma;
        }

        protected int Int()
        {
                return this.intelligence;
        }

        protected int Agi()
        {
                return this.agility;
        }

        protected int Luc()
        {
                return this.luck;
        }

        protected void Custom_SPECIAL()
        {

                Scanner scanner = new Scanner(System.in);

                System.out.println("현재 힘 수치는 : " + this.strength);
                System.out.println("잔여 포인트는 : " + this.add_point);
                System.out.println("힘은 근접공격력,운반 용량,무거운 장비을 다룰 때 보너스을 얻습니다.");

                System.out.println();

                for (String str : str_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.strength - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.strength - temp);
                        this.strength = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("현재 인지력 수치는 : " + this.perception);
                System.out.println("잔여 포인트는 : " + this.add_point);

                System.out.println("인지력은 원거리 명중률,적 발견,상황 판단력에 보너스을 얻습니다.");

                System.out.println();

                for (String str : per_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.perception - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.perception - temp);
                        this.perception = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("현재 지구력 수치는 : " + this.endurance);
                System.out.println("잔여 포인트는 : " + this.add_point);

                System.out.println("지구력은 최대 체력,상태 저항률에 보너스을 얻습니다.");

                System.out.println();

                for (String str : end_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.endurance - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.endurance - temp);
                        this.endurance = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("현재 매력 수치는 : " + this.charisma);
                System.out.println("잔여 포인트는 : " + this.add_point);

                System.out.println("매력은 거래,설득,동료 보너스을 얻습니다.");

                System.out.println();

                for (String str : cha_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.charisma - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.charisma - temp);
                        this.charisma = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("현재 지능 수치는 : " + this.intelligence);
                System.out.println("잔여 포인트는 : " + this.add_point);

                System.out.println("지능은 경험치 획득량,무기 개조,과학 보너스을 얻습니다.");

                System.out.println();

                for (String str : int_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.intelligence - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.intelligence - temp);
                        this.intelligence = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("현재 민첩 수치는 : " + this.agility);
                System.out.println("잔여 포인트는 : " + this.add_point);

                System.out.println("민첩은 AP 최대치,회피율,도망 보너스을 얻습니다.");

                System.out.println();

                for (String str : agi_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.agility - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.agility - temp);
                        this.agility = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("현재 행운 수치는 : " + this.luck);
                System.out.println("잔여 포인트는 : " + this.add_point);

                System.out.println("행운은 치명타율,아이템 드랍율 보너스을 얻습니다.");

                System.out.println();

                for (String str : luc_list)
                {
                        System.out.println(str);
                }

                System.out.println();
                System.out.print("수치를 입력하세요 : ");

                while (true)
                {
                        int temp = scanner.nextInt();

                        if (0 > this.add_point + (this.luck - temp))
                        {
                                System.out.println();
                                System.out.println("잔여 포인트가 부족합니다. 다시 입력하세요");
                                continue;

                        }
                        this.add_point = this.add_point + (this.luck - temp);
                        this.luck = temp;

                        break;

                }

                System.out.println();
                System.out.println();
                System.out.println();

                this.hp = 80 + this.endurance * 20; // 생명력
                this.ap = 60 + this.agility * 10; // 액션 포인트, 행동력

                this.crt = this.luck * 2; // 치명타률
                this.evs = this.agility * 5; // 회피율

                this.carry_weight = 200 + (this.strength * 10); // 짐 중량

        }
}

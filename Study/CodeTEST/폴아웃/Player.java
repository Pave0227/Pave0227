package 폴아웃;

class Player
{
    String[] job =
    { "볼트텍 거주민", "용병", "노상강도", "캐러벤 상단원", "NCR 탈영병", "생존주의자" };

    int hp = 80;
    int ap = 60;

    int total_damege; // 숙련도,퍽,SPECIAL 능력치 계산 후 최종 평균 데미지
    int base_damege; // 무기의 기본 제공 데미지
    int dt; // damage Threshold 데미지 상쇄율

    int acc; // 명중률
    int crt; // 치명타률

    int carry_weight = 200; // 짐 중량

    // S.P.E.C.I.A.L

    int strength; // 힘. 근접공격력 10% , 무게한계 20씩 증가, 방어구 요구치

    String[] str_list =
    { "1 - 불어터진 국수가락(Wet Noodle)", "2 - 떠내려온 해파리(Beached Jellyfish)", "3 - 갓난아이(Doughy Baby)", "4 - 경량급(Lightweight)",
            "5 - 일반인(Average Joe)", "6 - 통 가슴(Barrel Chested)", "7 - 해수욕장 양아치(Beach Bully)",
            "8 - 서커스 차력사(Circus Strongman)", "9 - 세기말 근육(Doomsday Pecs)",
            "10 - 헤라클레스의 큰 사촌(Hercules' Bigger Cousin) " };

    int perception; // 인지력. 원거리 공격 명중률 10%, 공격 우선권 , 상대방의 의도을 더 잘 파악하게 됩니다.

    String[] per_list =
    { "1 - 귀머거리 박쥐(Deaf Bat)", "2 - 노망난 두더지(Senile Mole)", "3 - 사시 도롱뇽(Squinting Newt)",
            "4 - 방심하는 송어(Unsuspecting Trout)", "5 - 경계하는 송어(Wary Trout)", "6 - 기민한 코요테(Alert Coyote)",
            "7 - 왕눈이 호랑이(Big-Eyed Tiger)", "8 - 외안경 낀 매(Monocled Falcon)", "9 - 매 저격수(Sniper Hawk)",
            "10 - 망원경 쓰는 독수리(Eagle with Telescope)" };

    int endurance; // 지구력. 기본 HP + 20, 상태이상 저항 5%

    String[] end_list =
    { "1 - 그냥 시체(Basically Dead)", "2 - 잘 부스러짐(Crumbly)", "3 - 구부리지 마시오(Do Not Bend)", "4 - 취급주의(Handle With Care)",
            "5 - 얼룩방지(Stain-Resistant)", "6 - 튼튼(Hardy)", "7 - 굳센 못(Tough-as-nails)", "8 - 내연제(Flame Retardant)",
            "9 - 방탄(Bullet Proof)", "10 - 막을 수 없음(Unstoppable)" };

    int charisma; // 매력. 거래 할인율 5%, 설득 15%

    String[] cha_list =
    { "1 - 인간 혐오자(Misanthrope)", "2 - 늙은 은둔자(Old Hermit)", "3 - 오싹한 장의사(Creepy Undertaker)",
            " 4 - 짜증내는 사서(Peevish Librarian)", "5 - 대리 교사(Substitute Teacher)", "6 - 쾌활한 외판원(Cheery Salesman)",
            "7 - 외교관(Diplomat)", " 8 - 영화 배우(Movie Star)", "9 - 카사노바(Casanova)", "10 - 사이비 교주(Cult Leader)" };

    int intelligence; // 지능. 경험치 획득량 10% , 개조,과학관련 기술

    String[] int_list =
    { "1 - 벽돌 이하(Sub-Brick)", "2 - 채소(Vegetable)", "3 - 백치(Cretin)", "4 - 근육뇌(Knuckle Head)",
            "5 - 상식은 있음(Knowledgeable)", "6 - 재능이 있음(Gifted)", "7 - 잘난놈(Smartypants)", "8 - 만물박사(Know-It-All)",
            "9 - 천재(Genius)", "10 - 전지전능(Omniscient)" };

    int agility; // 민첩성. AP +10

    String[] agi_list =
    { "1 - 걸어다니는 재앙(Walking Disaster)", "2 - 사고를 잘 당함(Accident Prone)", "3 - 미련퉁이(Oaf)",
            "4 - 어이쿠 손이 미끄러졌네(Butter Finger)", "5 - 통제 가능(Under Control)", "6 - 고양이 같음(Cat Like)",
            "7 - 내 칼을 받아라(Knife Thrower)", "8 - 니 칼을 받았다(Knife Catcher)", "9 - 묘기의 달인(Acrobatic Marvel)",
            "10 - 수면 보행(Walks on Water)" };

    int luck; // 행운. 치명타율 2%. 좋은 아이템을 얻을 확률이 증가합니다. 5%

    String[] luc_list =
    { "1 - 검은 고양이 13마리(13 pitch-black cats)", "2 - 깨진 거울(Broken Gypsy Mirror)", "3 - 병든 알바트로스(Sickly Albatross)",
            "4 - 쏟아진 소금(Spilled Salt)", "5 - 동전 튕기기(Coin Flip)", "6 - 밑장빼기(Stacked Deck)", "7 - 럭키 세븐(Lucky 7)",
            "8 - 요정을 본사람(Leprechaun's Foot)", "9 - 스물 한 잎 클로버(21 Leaf Clover)",
            "10 - 양쪽이 앞면인 동전 던지기(Two-Headed Coin Flip)" };

    int add_point = 10;

    private Player()
    {
        this.strength = 5;
        this.perception = 5;
        this.endurance = 5;
        this.charisma = 5;
        this.intelligence = 5;
        this.agility = 5;
        this.luck = 5;
    }

    private void VATS()
    {

    }
}

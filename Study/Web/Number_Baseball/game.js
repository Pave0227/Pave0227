function Number_Baseball_Game() {
  let round_cnt = 1;
  let enemy_arr = new Array();

  for (let x = 0; x <= 2; x++) {
    while (true) {
      // 랜덤값 temp에 할당
      let temp = Math.floor(Math.random() * 9 + 1);
      //중복되지 않은 값이면, 배열에 값을 할당한다.
      if (enemy_arr.indexOf(temp) == -1) {
        enemy_arr[x] = temp;
        break;
      }
    }
  }

  loop: while (true) {
    let answer = prompt("숫자을 입력하세요 (1~9까지의 숫자만 유효합니다)")
      .toString()
      .split("");

    if (answer.length != 3) {
      alert("다시 입력하세요. 숫자 갯수는 3개 입니다.");
      continue;
    } else {
      for (let ans of answer) {
        if (ans.search(/[1-9]/) == -1) {
          alert("숫자만 입력하십시오 (1~9까지의 숫자만 유효합니다)");
          continue loop;
        }
      }
    }

    //스트라이크,볼 횟수
    let strike = 0;
    let ball = 0;

    for (let i = 0; i <= 2; i++) {
      // 인덱스값까지 같으면 스트라이크
      if (enemy_arr[i] == Number(answer[i])) {
        ++strike;
        // 인덱스 값은 같지않으나, 값이 있는 경우
      } else if (enemy_arr.indexOf(Number(answer[i])) >= 0) {
        ++ball;
      }
    }

    //승리
    if (strike == 3) {
      alert(round_cnt + "회말 종료\r" + "이겼어요");
      break loop;
    }
    // 아웃
    else if ((strike == 0) & (ball == 0)) {
      alert(round_cnt + "회말\r" + "아웃 " + "\r당신의 답: " + answer);
    }
    // 그외 경우
    else {
      alert(
        round_cnt +
          "회말\r" +
          "\r스트라이크: " +
          strike +
          "\r볼: " +
          ball +
          "\r당신의 답: " +
          answer
      );
    }

    //9회말까지 정답을 맞추지 못하면 종료
    if (round_cnt == 9) {
      alert(round_cnt + "회말 종료\r" + "경기가 끝났습니다...졌습니다.");
      break loop;
    }
    //라운드 증가
    round_cnt++;
  }
}

Number_Baseball_Game();

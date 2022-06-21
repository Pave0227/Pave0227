let round = 0;

function Game(id) {
  let select = 0;

  if (
    Number(document.getElementById("money").innerHTML) <
    Number(document.getElementById("gamble").value)
  ) {
    alert("돈이 부족해요");
    return;
  }
  if (round > 9 || Number(document.getElementById("money").innerHTML) <= 0) {
    alert("게임이 끝났어요");
    return;
  }
  if (Number(document.getElementById("gamble").value) < 1000) {
    alert("판돈은 1000이상 이어야 합니다.");
    return;
  }

  ++round;

  document.getElementById("round").innerHTML = round;

  document.getElementById("btn").innerHTML = id;

  if (id == "Rock") {
    select = 0;
  } else if (id == "Scissor") {
    select = 1;
  } else if (id == "Paper") {
    select = 2;
  }

  let com = Math.floor(Math.random() * 3);

  if (select == com) {
    Result(2, com);
  } else {
    switch (com) {
      case 0:
        select == 2 ? Result(0, com) : Result(1, com);
        break;

      case 1:
        select == 0 ? Result(0, com) : Result(1, com);
        break;

      case 2:
        select == 1 ? Result(0, com) : Result(1, com);
        break;
    }
  }

  function Result(win, com) {
    const arr = [
      "\r\rComputer는 Rock",
      "\r\rComputer는 Scissor",
      "\r\rComputer는 Paper",
    ];

    const result_arr = ["내가 이겼어요.", "내가 졌어요", "비겼어요"];

    document.getElementById("action").innerHTML = result_arr[win];
    document.getElementById("have_this").innerHTML = arr[com];

    if (win == 0) {
      document.getElementById("money").innerHTML =
        Number(document.getElementById("money").innerHTML) +
        Number(document.getElementById("gamble").value) * 2;
    } else if (win == 1) {
      document.getElementById("money").innerHTML =
        Number(document.getElementById("money").innerHTML) -
        Number(document.getElementById("gamble").value);
    }
  }
}

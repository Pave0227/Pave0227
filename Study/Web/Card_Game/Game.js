let money = 1000;
let round = 3;
let bet = 100 * Math.floor(round / 3);
let max = 300 * Math.floor(round / 3);

// ----------------------------------------------------------

let money_status = document.getElementById("money");
let bet_status = document.getElementById("bet_status");
let bet_max = document.getElementById("bet_max");
let result = document.getElementById("result");
let round_text = document.getElementById("round");

let card_type = ["Heart", "Clover", "Spade", "Diamond"];
let card_list = new Array();
let draw_card = new Array();

function Re_Start() {
  card_list = [];
  for (let i = 0; i < 4; i++) {
    for (let x = 1; x <= 13; x++) {
      card_list.push(x + " " + card_type[i]);
    }
  }
  money_status.innerText = money;
  round = 3;
  bet = 100 * Math.floor(round / 3);
  max = 300 * Math.floor(round / 3);
  round_text.innerText = round - 2;
  bet_status.innerText = bet;
  bet_max.innerText = max;
  result.innerHTML = "";
}
Re_Start();
let card1 = document.getElementById("card1");
let card2 = document.getElementById("card2");
let card3 = document.getElementById("card3");

//!-------------------------------------------
function Setting() {
  bet = 100 * Math.floor(round / 3);
  max = 300 * Math.floor(round / 3);

  bet_status.innerText = bet;
  bet_max.innerText = max;

  draw_card = [];
  while (draw_card.length !== 3) {
    let temp = card_list[Math.floor(Math.random() * card_list.length)];

    if (!draw_card.includes(temp)) {
      draw_card.push(temp);
      card_list.pop(temp);
    }
  }

  if (parseInt(draw_card[0]) > parseInt(draw_card[1])) {
    let temp = draw_card[0];
    draw_card[0] = draw_card[1];
    draw_card[1] = temp;
  }

  card1.innerHTML = draw_card[0];
  card2.innerHTML = draw_card[1];

  if (card_list.length >= 3 || Number(money_status.innerText) >= bet) {
    card1.innerHTML = draw_card[0];
    card2.innerHTML = draw_card[1];
    round_text.innerText = round - 2;
  }
  round++;
}

function Card_Game() {
  let card1 = parseInt(draw_card[0]);
  let card2 = parseInt(draw_card[1]);
  let card3 = parseInt(draw_card[2]);

  if (card_list.length < 3) {
    result.innerHTML = "????????? ?????? ??????????????????...???????????????.";
  } else if (Number(money_status.innerText) <= 0) {
    result.innerHTML = "?????? ??? ????????????...???????????????.";
  } else if (card3 > card1 && card3 < card2) {
    result.innerHTML = "???????????????";
    money_status.innerText =
      Number(money_status.innerText) + Number(bet_status.innerText) * 2;
    Setting();
  } else if (card3 == card1 || card2 == card1) {
    result.innerHTML = "???????????????";
    Setting();
  } else {
    result.innerHTML = "????????????";
    money_status.innerText =
      Number(money_status.innerText) - Number(bet_status.innerText);
    Setting();
  }
}

function Bet_Control(click_id) {
  if (click_id == "plus_btn" && Number(bet_status.innerText) < max) {
    bet_status.innerText = Number(bet_status.innerText) + 100;
  } else if (click_id == "minus_btn" && Number(bet_status.innerText) > bet) {
    bet_status.innerText = Number(bet_status.innerText) - 100;
  } else if (click_id == "all_in") {
    bet_status.innerText = max;
  }
}
Setting();

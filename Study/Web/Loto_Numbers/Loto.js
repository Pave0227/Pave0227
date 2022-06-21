function Loto_Collecter() {
  let loto_arr = new Array();

  while (loto_arr.length !== 6) {
    let temp = Math.floor(Math.random() * 45 + 1);
    if (!loto_arr.includes(temp)) {
      loto_arr.push(temp);
    }
  }

  loto_arr.sort(function (a, b) {
    return a - b;
  });

  for (let lot of loto_arr) {
    document.write("<span class=ball>" + lot + "</span>");
  }
}

Loto_Collecter();

const $color_area = document.getElementById("color_area");
const $color_btn = document.getElementById("color_btn");
$color_btn.onclick = function () {
  var red = Math.random() * 255;
  var blue = Math.random() * 255;
  var green = Math.random() * 255;

  $color_area.style.backgroundColor =
    "rgb(" + [red, green, blue].join(",") + ")";
};

const $img_area = document.getElementById("img_area");
const $img_btn = document.getElementById("img_btn");
const $img_ctrl = document.getElementById("img_ctrl");

let num = 1;
$img_btn.onclick = function () {
  if (num < 3) {
    ++num;
  } else {
    num = 1;
  }
  $img_ctrl.setAttribute("src", "img/dog" + num + ".jpg");
};

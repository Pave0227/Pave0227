var bg = document.getElementById("background");

setInterval(function () {
  var color = Math.random() * 0xffffff;
  color = parseInt(color);
  color = color.toString(16);

  bg.style.background = "#" + color;
}, 3000);

var express = require("express");

// express 는 함수이므로, 반환값을 변수에 저장한다.
var app = express();

var http = require("http");

// 3000 포트로 서버 오픈
app.listen(3000, function () {
  console.log("start! express server on port 3000");
});

app.use(express.static(__dirname));

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/Produce_Project.html");
});

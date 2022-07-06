var express = require("express");
var cors = require("cors");
var app = express();

// CORS 설정
app.use(cors());

app.get("/products/:id", function (req, res, next) {
  res.json({ msg: "This is CORS-enabled for all origins!" });
});

app.listen(80, function () {
  console.log("CORS-enabled web server listening on port 80");
});

app.use(express.static(__dirname));

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/Produce_Project.html");
});

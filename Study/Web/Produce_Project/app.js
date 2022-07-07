var express = require("express");
var cors = require("cors");
var request = require("request");
var cheerio = require("cheerio");
var app = express();

const router = express.Router();
// CORS 설정
app.use(cors());
router.use(cors());

app.use(express.json());
app.use(express.static(__dirname));

app.get("/", cors(), function (req, res) {
  res.sendFile(__dirname + "/Produce_Project.html");
});
app.listen(80, function () {
  console.log("CORS-enabled web server listening on port 80");
});

// test  ===============================================
const API_URL_Test =
  "http://www.kamis.or.kr/service/price/xml.do?action=dailyPriceByCategoryList&p_product_cls_code=02&p_country_code=1101&p_convert_kg_yn=N&p_item_category_code=600&p_regday=2022-07-05&p_returntype=json&p_cert_key=f82108b6-095a-45db-8f5f-64b65a16bdc2&p_cert_id=dlrkdals227@gmail.com";

let test;

request(API_URL_Test, function (error, response, body) {
  if (!error && response.statusCode == 200) {
    test = JSON.parse(body);
    console.log(test.data.item[0]);
  }
});

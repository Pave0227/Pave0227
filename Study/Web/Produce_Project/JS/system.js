function Login_Popup() {
  var popupX = document.body.offsetWidth / 2 - 450 / 2;
  //&nbsp;만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음

  var popupY = window.screen.height / 2 - 700 / 2;
  //&nbsp;만들 팝업창 상하 크기의 1/2 만큼 보정값으로 빼주었음

  window.open(
    "login.html",
    "pagename",
    "resizable,height=700,width=450,status=no,toolbar=no,scrollbar=no,location=no,left=" +
      popupX +
      ",top=" +
      popupY
  );
  return false;
}

// 상단 nav 탭메뉴 마우스오버,아웃

var tabLinks = document.querySelectorAll(".tablinks");
var tabContent = document.querySelectorAll(".nav_sub");

tabLinks.forEach(function (el) {
  el.addEventListener("mouseover", openTabs);
  el.addEventListener("mouseout", closeTabs);
});

$(".tab_price").click(function (el) {
  let i = $(".tab_price").index(this);

  if (i <= 4) {
    for (let x = 0; x <= 4; x++) {
      $(".tab_price").eq(x).classList.remove("current");
    }
    $(".tab_price").eq(i).classList.add("current");
  } else {
    for (let x = 5; x <= 9; x++) {
      $(".tab_price").eq(x).classList.remove("current");
    }
    $(".tab_price").eq(i).classList.add("current");
  }
});

function openTabs(el) {
  var btnTarget = el.currentTarget;
  var tabs = btnTarget.dataset.tabs;

  tabContent.forEach(function (el) {
    el.classList.remove("active");
  });

  tabLinks.forEach(function (el) {
    el.classList.remove("active");
  });

  document.querySelector("#" + tabs).classList.add("active");

  btnTarget.classList.add("active");
}

function closeTabs(el) {
  tabContent.forEach(function (el) {
    el.classList.remove("active");
  });

  tabLinks.forEach(function (el) {
    el.classList.remove("active");
  });
}

//import ==================================================================

const today = new Date();

const year = today.getFullYear();

const month_def = today.getMonth() + 1;
const day_def = today.getDate() - 1;

const month = month_def / 10 > 1 ? month_def : "0" + month_def;

const day = day_def / 10 > 1 ? day_def : "0" + day_def;

const today_user = "&p_regday=" + year + "-" + month + "-" + day;

const user_key =
  "&p_returntype=json&p_cert_key=f82108b6-095a-45db-8f5f-64b65a16bdc2&p_cert_id=dlrkdals227@gmail.com";

const API_URL_Test =
  "http://www.kamis.or.kr/service/price/xml.do?action=dailyPriceByCategoryList&p_product_cls_code=02&p_country_code=1101&p_convert_kg_yn=N&p_item_category_code=600&p_regday=2022-07-05&p_returntype=json&p_cert_key=f82108b6-095a-45db-8f5f-64b65a16bdc2&p_cert_id=dlrkdals227@gmail.com";

function Whole_Support() {
  const product_code = [100, 200, 300, 400, 600];

  for (let p = 0; p < product_code.length; p++) {
    const API_URL_Whole =
      "http://www.kamis.or.kr/service/price/xml.do?action=dailyPriceByCategoryList&p_product_cls_code=02&p_country_code=1101&p_convert_kg_yn=N&p_item_category_code=" +
      product_code[p] +
      today_user +
      user_key;

    $.ajax({
      url: test,
      type: "get",
      dataType: "jsonp",
    })

      .done(function (data) {
        const retail = document.querySelectorAll("#retail");

        for (let x = 0; x < retail.length; x++) {
          for (let i = 0; i < data.data.item.length; i++) {
            let item = data.data.item[i];
            let item_list = [
              item.item_name, // 이름
              item.kind_name, // 품질원산지
              item.unit, // 단위
              item.dpr1, // 금일
              item.dpr2, // 전일
              item.dpr5, // 1개월
              item.dpr6, // 1년
            ];
            let element_parent = document.createElement("tr");
            element_parent.style.cursor = "pointer";
            let once = true;
            for (let y = 1; y < item_list.length; y++) {
              let element = document.createElement("td");

              //이름 품질 원산지 혼합
              if (y == 1) {
                element.innerText = item_list[0] + "/" + item_list[1];
                element.style.textAlign = "left";
                element.style.paddingLeft = "10px";
              }
              // 등가율
              else if (y == 2) {
                element.style.textAlign = "center";
                element.innerText = item_list[y];
              } else if (y == 4 && once) {
                element.innerText =
                  Math.round(
                    ((parseInt(item_list[3]) - parseInt(item_list[4])) /
                      parseInt(item_list[4])) *
                      100
                  ) + "%";
                once = false;
                element.style.textAlign = "center";
                y = 3;
              } else {
                element.innerText = item_list[y];
              }
              element_parent.append(element);
              retail.item(p).append(element_parent);
            }
          }
        }
      })

      .fail(function (xhr, status, errorThrow) {
        console.log("실패");
      });
  }
}

function Retail_Support() {
  const product_code = [100, 200, 300, 400, 600];

  for (let p = 0; p < product_code.length; p++) {
    const API_URL_Whole =
      "http://www.kamis.or.kr/service/price/xml.do?action=dailyPriceByCategoryList&p_product_cls_code=01&p_country_code=1101&p_convert_kg_yn=N&p_item_category_code=" +
      product_code[p] +
      today_user +
      user_key;

    $.ajax({
      url: API_URL_Whole,
      type: "get",
      dataType: "json",
    })

      .done(function (data) {
        const retail = document.querySelectorAll("#whole");

        for (let x = 0; x < retail.length; x++) {
          for (let i = 0; i < data.data.item.length; i++) {
            let item = data.data.item[i];
            let item_list = [
              item.item_name, // 이름
              item.kind_name, // 품질원산지
              item.unit, // 단위
              item.dpr1, // 금일
              item.dpr2, // 전일
              item.dpr5, // 1개월
              item.dpr6, // 1년
            ];
            let element_parent = document.createElement("tr");
            element_parent.style.cursor = "pointer";
            let once = true;
            for (let y = 1; y < item_list.length; y++) {
              let element = document.createElement("td");

              //이름 품질 원산지 혼합
              if (y == 1) {
                element.innerText = item_list[0] + "/" + item_list[1];
                element.style.textAlign = "left";
                element.style.paddingLeft = "10px";
              }
              // 등가율
              else if (y == 2) {
                element.style.textAlign = "center";
                element.innerText = item_list[y];
              } else if (y == 4 && once) {
                element.innerText =
                  Math.round(
                    ((parseInt(item_list[3]) - parseInt(item_list[4])) /
                      parseInt(item_list[4])) *
                      100
                  ) + "%";
                once = false;
                element.style.textAlign = "center";
                y = 3;
              } else {
                element.innerText = item_list[y];
              }
              element_parent.append(element);
              retail.item(p).append(element_parent);
            }
          }
        }
      })

      .fail(function (xhr, status, errorThrow) {
        console.log("실패");
      });
  }
}

function Time_Set() {
  let time_set = document.querySelectorAll(".time_set");

  for (let x = 0; x < time_set.length; x++) {
    time_set.item(x).style.whiteSpace = "nowrap";
    time_set.item(x).innerText = "가격(" + month + "." + day + ")";
  }
}
Whole_Support();
Retail_Support();
Time_Set();

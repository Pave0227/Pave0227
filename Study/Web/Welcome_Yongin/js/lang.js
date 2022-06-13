var lang_arr = [
  "english",
  "한국어",
  "日本語",
  "Français",
  "Deutsch",
  "Español",
  "Tiếng Việt",
];

function Language_Change() {
  var type = navigator.appName;
  var lang;

  if (type == "Netscape") lang = navigator.language;
  else lang = navigator.userLanguage;

  // 국가코드에서 앞 2글자만 자름
  var lang = lang.substr(0, 2);

  // 한글인 경우 한글페이지로 이동
  if (lang == "ko") window.location.replace("main_ko.html");
  // 다른 언어인 경우 영문페이지로 이동
  else window.location.replace("main_en.html");
}

function Once(fn, context) {
  var result;

  return function () {
    if (fn) {
      result = fn.apply(context || this, arguments);
      fn = null;
    }

    return result;
  };
}

function Div_Ctrl() {
  // lang_panel 엘리먼트 요소가 있으면 삭제합니다
  if (document.getElementsByClassName("lang_panel")[0]) {
    // var element = document.querySelector(".lang_panel");
    var element = document.getElementsByClassName("lang_panel")[0];
    element.remove();
    return;
  }

  // div 태그 생성
  var div = document.createElement("div");
  div.className = "lang_panel";
  div.id = "lang_panel2";

  // social_menu 클래스 찾아서 자식개체로 div 넣어줌
  // var social = document.querySelector("#social");
  // var social = document.getElementsByClassName("social_menu")[0];
  var social = document.querySelector(".social_menu");

  social.appendChild(div);

  // lang_panel 클래스 엘리먼트 지정
  var find = document.getElementsByClassName("lang_panel")[0];

  // lang_panel 하위자식개체로 언어설정 div 넣어줌
  for (var i = 0; i < lang_arr.length; i++) {
    var temp = document.createElement("div");
    temp.className = "lang_element";
    temp.innerHTML = lang_arr[i];

    find.appendChild(temp);
  }
}

Once(Language_Change);

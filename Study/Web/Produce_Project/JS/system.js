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

// tabs

var tabLinks = document.querySelectorAll(".tablinks");
var tabContent = document.querySelectorAll(".nav_sub");

tabLinks.forEach(function (el) {
  el.addEventListener("mouseover", openTabs);
  el.addEventListener("mouseout", closeTabs);
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

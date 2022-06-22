function Number_Control(click_id) {
  let panel = document.getElementById("panel");

  if (click_id == "inc") {
    panel.innerHTML = Number(panel.innerHTML) + 1;
  } else {
    panel.innerHTML = Number(panel.innerHTML) - 1;
  }
}

// console.log(String.__proto__ === Function.prototype);
// console.log(Function.prototype.__proto__ === Object.prototype);

// class User {

//   constructor(name) {
//     this.name = name;
//   }

//   sayHi() {
//     alert(this.name);
//   }

// }

// // 사용법:
// let user = new User("John");
// user.sayHi();

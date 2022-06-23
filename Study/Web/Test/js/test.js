let User_Data = {
  name: "None",
  setName: function (firstName, lastName) {
    this.name = firstName + " " + lastName;
  },
};

function Get_User_Name(firstName, lastName, callback, obj) {
  callback.call(obj, firstName, lastName);
}

Get_User_Name("김", "무무", User_Data.setName, User_Data);

console.log(User_Data.name); // None
console.log(window.name); // 김 무무

//콜백함수는 기본적으로 콜 바이 밸류 지만, call을 이용해 인자를 넘겨줄 객체을 지정해주면 값을 넘겨줄 수 있다.

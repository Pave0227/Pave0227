//Date

//2->3
const d = new Date(2020,2);
console.log(d);
const now =  Date.now();
console.log(now);

//const today = new Date('2020/07/24').getFullYear();
// const today = new Date('2020/07/24').getMonth();
// //getFullYear()
// console.log(today);

//시계만들기
(function printNow(){
  const today  =  new Date();
  
  const datNames = ['(일요일)','(월요일)','(화요일)','(수요일)','(목요일)','(금요일)','(토요일)'];

  //getDay 해당요일(0~6)을 나타내는 정수를 리턴한다.
  const day = datNames[today.getDay()];

  const year =  today.getFullYear();
  const month = today.getMonth()+1;
  const date =  today.getDate();
  let hour = today.getHours();
  let minute =today.getMinutes();
  let second = today.getSeconds();
  const ampm = hour >=12 ? 'PM':'AM';

  //12시간제로 바꿈.
  hour %=12;
  hour = hour||12;

  //10 미만인 분과 초를 2자리로 변경
  minute = minute<10 ?'0'+minute:minute;
  second =  second<10?'0'+second : second;

  const now = `${year}년 ${month}월 ${day} ${hour}:${minute}:${second}${ampm}`;

  console.log(now);

  setTimeout(printNow,1000);
}());
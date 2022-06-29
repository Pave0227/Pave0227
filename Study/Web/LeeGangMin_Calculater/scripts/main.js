let numOne = "";
let numTwo = "";
let operator = "";

const $operator = document.querySelector("#operator");
const $result = document.querySelector("#result");

//숫자버튼 클릭
const onClickNum = (event) => {
  if (!operator) {
    numOne += event.target.textContent;
    $result.value += event.target.textContent;
    return;
  }
  //요기 부터는 operator가 존재하는 경우에만 실행
  //값을 저장하기전에 비워버림
  if (!numTwo) {
    $result.value = "";
  }
  numTwo += event.target.textContent;
  $result.value += event.target.textContent;
};

// 연산자 클릭
const onClickOper = (op) => () => {
  if (numOne) {
    operator = op;
    $operator.value = op;
  }
  if (numTwo) {
    switch (operator) {
      case "+":
        $result.value = parseInt(numOne) + parseInt(numTwo);
        numOne = $result.value;
        numTwo = "";
        break;
      case "-":
        $result.value = numOne - numTwo;
        numOne = $result.value;
        numTwo = "";
        break;
      case "*":
        $result.value = numOne * numTwo;
        numOne = $result.value;
        numTwo = "";
        break;
      case "/":
        $result.value = numOne / numTwo;
        numOne = $result.value;
        numTwo = "";
        break;
    }
  } else if (!numOne) {
    alert("숫자먼저 입력해라");
  }
};

document.querySelector("#num-0").addEventListener("click", onClickNum);
document.querySelector("#num-1").addEventListener("click", onClickNum);
document.querySelector("#num-2").addEventListener("click", onClickNum);
document.querySelector("#num-3").addEventListener("click", onClickNum);
document.querySelector("#num-4").addEventListener("click", onClickNum);
document.querySelector("#num-5").addEventListener("click", onClickNum);
document.querySelector("#num-6").addEventListener("click", onClickNum);
document.querySelector("#num-7").addEventListener("click", onClickNum);
document.querySelector("#num-8").addEventListener("click", onClickNum);
document.querySelector("#num-9").addEventListener("click", onClickNum);
document.querySelector("#plus").addEventListener("click", onClickOper("+"));
document.querySelector("#minus").addEventListener("click", onClickOper("-"));
document.querySelector("#divide").addEventListener("click", onClickOper("/"));
document.querySelector("#multiply").addEventListener("click", onClickOper("*"));
document.querySelector("#calculate").addEventListener("click", () => {
  if (numTwo) {
    switch (operator) {
      case "+":
        $result.value = parseInt(numOne) + parseInt(numTwo);
        numOne = $result.value;
        numTwo = "";
        break;
      case "-":
        $result.value = numOne - numTwo;
        numOne = $result.value;
        numTwo = "";
        break;
      case "*":
        $result.value = numOne * numTwo;
        numOne = $result.value;
        numTwo = "";
        break;
      case "/":
        $result.value = numOne / numTwo;
        numOne = $result.value;
        numTwo = "";
        break;
    }
  } else {
    alert("숫자 입력해라");
  }
});
document.querySelector("#clear").addEventListener("click", () => {
  $operator.value = "";
  $result.value = "";
  numOne = "";
  numTwo = "";
  operator = "";
});

// const func = (msg) => {
//   return () => {
//     console.log(msg);
//   };
// };
//위func처럼 함수본문에서 바로 리턴되는 값이 있으면 return 이랑
//{}생략가능
// const func1 = (msg) => () => {
//   console.log(msg);
// };

//1.if문 다음에 나오는 공통된 절차를 각 분기점 내부에넣는다.
//2.분기점에서 짧은 절차부터 실행할수있도록 if작성
//3. 짧은 절차가 끝났을경우return(함수 내부의 경우) 또는 break(for문 내부의 경우)로 중단한다.
//4. else 제거(이때 중첩된 녀석이 사라진다.)
//5. 다음 중첩이 생길경우 1~4 과정 반복

//깊이우선 탐색으로 weight 합을 만족하는 모든 경우의수의 배열을 출력하는 알고리즘

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let weight = 15;

function DFS_Search(list, visited, n) {
  //test는 현 경우의수 배열의 합
  let test = list.reduce((sum, currValue) => {
    return sum + currValue;
  }, 0);
  // 합이 요구하는 값보다 크면 리턴
  if (test > weight) {
    return;
  }
  // 합이 요구하는 값과 같으면 배열을 로그
  else if (test == weight) {
    console.log(list);
  }
  //DFS_Search
  else {
    for (let x = n; x < arr.length; x++) {
      if (!visited[x]) {
        visited[x] = true;
        //일시적으로 할당해주어야, 해당 반복문에서 경우의 수가 올바르게 생성됨.
        let list_temp = list;
        list_temp[x] = arr[x];
        DFS_Search(list_temp, visited);
        visited[x] = false;
      }
    }
  }
}

for (let x = 0; x < arr.length - 1; x++) {
  let list = new Array(arr.length);
  let visited = new Array(arr.length);

  for (let x = 0; x < list.length; x++) {
    list[x] = 0;
  }
  DFS_Search(list, visited, x);
}

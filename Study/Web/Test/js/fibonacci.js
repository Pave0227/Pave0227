function Task_1(n) {
  const arr = [0, 1];
  let i = 0;
  while (true) {
    if (arr[i] + arr[i + 1] >= n) {
      break;
    } else {
      arr.push(arr[i] + arr[i + 1]);
      ++i;
    }
  }

  console.log(arr);
}
let arr = new Array(1, 2);

Task_1(30);

function Task_2(arr, n) {
  if (arr[arr.length - 1] + arr[arr.length - 2] >= n) {
    return arr;
  } else {
    arr.push(arr[arr.length - 1] + arr[arr.length - 2]);
    return Task_2(arr, n);
  }
}

let arr2 = Task_2(arr, 100);

console.log(arr2);

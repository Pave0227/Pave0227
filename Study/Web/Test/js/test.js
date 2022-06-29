//선택 정렬

function swap(arr, a, b) {
  let temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}

function Select_Sort(arr) {
  let min;

  for (let i = 0; i < arr.length; i++) {
    min = i;

    for (let k = i + 1; k < arr.length; k++) {
      if (arr[k] < arr[min]) {
        min = k;
      }
    }
    //현재 위치가 최소 항목 위치가 아니라면 항목 swap
    if (i != min) {
      swap(arr, i, min);
    }
  }
  return arr;
}

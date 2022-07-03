//먼저 들어간 데이터 먼저 나온다

class Queue {
  constructor() {
    this.arr = [];
  }

  enqueue(n) {
    this.arr.push(n);
  }

  dequeue() {
    return this.arr.shift();
  }
}

class Food_Order {
  constructor(name, food) {
    this.name = name;
    this.food = food;
  }
}

class Combo_Order extends Food_Order {
  constructor(name, food, drink) {
    super(name, food);
    this.drink = drink;
  }
}

const queue = new Queue();

const order_1 = new Food_Order("김나라", "피자");
const order_2 = new Food_Order("이병길", "햄버거");
const combo_order_1 = new Combo_Order("이강민", "닭갈비", "사이다");
queue.enqueue(order_1);
queue.enqueue(order_2);
queue.enqueue(combo_order_1);
console.log(queue);

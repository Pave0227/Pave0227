function Node(data) {
  this.data = data;
  this.next = null;
}
Node.prototype.insert = function (value) {
  let newNode = new Node(value);
  if (this.next == null) this.next = newNode;
  else {
    newNode.next = this.next;
    this.next = newNode;
  }
};
Node.prototype.delete = function () {
  if (this.next == null) return null;
  const remove = this.next;
  this.next = remove.next;
};
Node.prototype.print = function () {
  let str = "";
  for (let p = this; p != null; p = p.next) {
    str += `${p.data}->`;
  }
  str += `NULL`;
  console.log(str);
};
let sll = new Node("head");
sll.insert(1);
sll.insert(2);
sll.insert(3);
sll.delete();
sll.print();

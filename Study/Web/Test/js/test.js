function Person(name) {
  this.name = name;
}

var foo = new Person("Lee");

console.dir(Person); // prototype 프로퍼티가 있다.
console.dir(foo); // prototype 프로퍼티가 없다.

console.log(Person.prototype === foo.__proto__);

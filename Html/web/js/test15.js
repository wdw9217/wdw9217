"use strict";

class Car {
  constructor(name, color, speed) {
    this.name = name;
    this.color = color;
    this.speed = speed;
    this.speedup = function () {
      return this.speed + 10;
    };
    this.speeddown = function () {
      return this.speed - 10;
    };
  }
}

const kimcar = new Car("kona", "white", 120);
const limcar = new Car("venu", "blue", 130);

console.log(kimcar.name);
console.log(kimcar.color);
console.log(kimcar.speed);

console.log(limcar.name);
console.log(limcar.color);
console.log(limcar.speed);

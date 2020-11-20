"use strict";

class Car {
  constructor(name, color, speed) {
    this.name = name;
    this.color = color;
    this.speed = speed;
  }
  get name() {
    return this._name;
  }
  set name(value) {
    this._name = value == "" || null ? "똥차" : value;
  }
  get color() {
    return this._color;
  }
  set color(value) {
    this._color = value == "" || null ? "silver" : value;
  }
  get speed() {
    return this._speed;
  }
  set speed(value) {
    this._speed = value <= 0 ? 10 : value;
  }

  speedUp() {
    return (this.speed = this.speed + 10);
  }

  speedDown() {
    return (this.speed = this.speed - 10);
  }
}

class Hyundai extends Car {
  speedup() {
    return (this.speed = this.speed + 20);
  }
  speeddown() {
    return (this.speed = this.speed - 10);
  }
}

class Chevrolet extends Car {
  speedup() {
    return (this.speed = this.speed + 40);
  }
  speeddown() {
    return (this.speed = this.speed - 30);
  }
}

const Hyundai = new Car("Hyundai", "black", 200);
const Hyundai = new Car("", "", -1);
Hyundai.speedUp();
Hyundai.speedUp();
Hyundai.speedUp();
console.log(Hyundai);

const Chevrolet = new Car("Chevrolet", "yellow", 300);
const Chevrolet = new Car("", "", -1);
Chevrolet.speedUp();
Chevrolet.speedUp();
Chevrolet.speedUp();
console.log(Chevrolet);

const mr_lee = new Car("Porchee911GT1", "white", 300);

const mr_park = new Car("", "", -1);
mr_lee.speedUp();
mr_lee.speedUp();
mr_lee.speedUp();
console.log(mr_lee);

mr_park.speedUp();
console.log(mr_park);

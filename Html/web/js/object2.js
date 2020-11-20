"use strict";

class Car {
  constructor(width, color, speed, person) {
    this.width = width;
    this.color = color;
    this.speed = speed;
    this.person = person;
  }

  get person() {
    return this._person;
  }

  set person(value) {
    this._person = value;
  }

  move() {
    console.log("speed 100km");
  }
  shape() {
    console.log("nomal");
  }
}

class Hyundai extends Car {
  move() {
    console.log("speed 110km");
  }
  shape() {
    console.log("nomal");
  }
}

class Chevrolet extends Car {
  move() {
    console.log("speed 160km");
  }
  shape() {
    console.log("nomal");
  }
}

const hyundai = new Hyundai("hyundai", "blue", 110);
const chevrolet = new Chevrolet("chevrolet", "orange", 160);

hyundai.move();
hyundai.shape();

chevrolet.move();
chevrolet.shape();

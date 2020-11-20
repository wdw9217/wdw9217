"use strict";

class Watch {
  constructor(brand, name, size, price) {
    this.brand = brand;
    this.name = name;
    this.size = size;
    this.price = price;
  }
  move() {
    console.log("price 50000");
  }
  shape() {
    console.log("metal");
  }
}

class Seiko extends Watch {
  move() {
    console.log("price 300000");
  }
  shape() {
    console.log("metal");
  }
}

class Casio extends Watch {
  move() {
    console.log("price 160000");
  }
  shape() {
    console.log("leather");
  }
}

class Tagheuer extends Watch {
  move() {
    console.log("price 3600000");
  }
  shape() {
    console.log("rubber");
  }
}

const seiko = new Seiko("seiko", "metal", 300000);
const casio = new Casio("casio", "leather", 160000);
const tagheuer = new Tagheuer("tagheuer", "rubber", 3600000);

seiko.move();
seiko.shape();

casio.move();
casio.shape();

tagheuer.move();
tagheuer.shape();

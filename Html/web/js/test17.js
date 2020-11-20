"use strist";

let json = JSON.stringify(true);
console.log(json);

json = JSON.stringify("🍜", "🍪");
console.log(json);

const dog = {
  name: "mingming",
  color: "black",
  size: "null",
  birthDate: new Date(),

  mungmung: () => {
    console.log(`${name} 멍멍`);
  },
};

console.clear();
console.log(dog);

json = JSON.stringify(dog); //보내기
console.log(json); //받기

console.clear();

console.log(dog);
console.clear();

json = JSON.stringify(dog);
//perse = JSON.perse(json);

const obj = JSON.parse(json, (key, value) => {
  console.log(`key: ${key} value: ${value}`);
  return value == "birthDate" ? new Date(value) : value;
});

class Dog {
    constructor(name, color, eat) {
      this.name = name;
      this.color = color;
      this.eat = eat;
    }
    get name() {
      return this._name;
    }
    set name(value) {
      this._name = value == "" || null ? "mingming" : value;
    }
    get color() {
      return this._color;
    }
    set color(value) {
      this._color = value == "" || null ? "black" : value;
    }
    get eat() {
      return this._eat;
    }
    set eat(value) {
        this._eat = value == "" || null ? "meat" : value;
    }
    const dog = new Dog("mingming", "black", "meat");

}
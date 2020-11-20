import { Test } from "./test.js";

class Test1 {
  constructor() {
    this.num = new Test();
  }
  result(num1, num2, num3, num4) {
    console.log(this.num.plus());
    console.log(this.num.minus());
  }
}
window.onload = () => {
  new Test1();
};

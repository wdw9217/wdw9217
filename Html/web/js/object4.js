"use strict";

//const arr1 = newArray();
const arr2 = ["💖", "💋", "🌹"];

console.log(arr2[0]);
console.log(arr2.length);
console.log(arr2);

//for of array value 값을 루프문으로 가져올 수 있다.
for (let value of arr2) {
  console.log(value);
}

for (let i = 0; i < arr2.length; i++) {
  console.log(arr2[i]);
}

//forEach
const fruits = ["🍉", "🍓", "🍒"];
console.log(fruits);

fruits.forEach((fruit, index, array) => {
  console.log(`forEach : ${fruit}, ${index}, ${array}`);
});

//pop and push
fruits.pop();
console.log(fruits);
fruits.pop();
console.log(fruits);

fruits.push("🍒", "🍓", "🍉");
console.log(fruits);

//shift and unshift
fruits.unshift("🍏", "🍍");
console.log(fruits);

fruits.shift();
console.log(fruits);

//splice
fruits.splice(2, 2);
console.log(fruits);

fruits.splice(1, 2, "🍌", "🍋");
console.log(fruits);

//배열을 합쳐봅시다.

const fastfood = ["🍔", "🍜"];
console.log(fastfood);

const food = fruits.concat(fastfood);
console.log(food);

//indexof
console.log(food.indexOf("🍜"));

console.log(food.indexOf("🍌"));

console.log(food.indexOf("🍔"));

//lastIndexof

console.log(food);

console.log(food.lastIndexOf("🍜"));

console.log(food.lastIndexOf("🍌"));

console.log(food.lastIndexOf("🍔"));

//inclouds
console.log(food.includes("🍦"));
console.log(food.includes("🍪"));
console.log(food.includes("🍮"));

const aa = food.join("^");
console.log(aa);

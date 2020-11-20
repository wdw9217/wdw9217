"use strict";
const horizontal = document.querySelector(".horizontal");
const vertical = document.querySelector(".vertical");
const target = document.querySelector(".target");
const tag = document.querySelector(".tag");

console.log(horizontal);
console.log(vertical);
console.log(target);
console.log(tag);

document.addEventListener("click", function (event) {
  const x = event.clientX;
  const y = event.clientY;

  // console.log (event);
  console.log(`${event.clientX}, ${event.clientY}`);
  //horizontal.style.top =`${x}px`;
});

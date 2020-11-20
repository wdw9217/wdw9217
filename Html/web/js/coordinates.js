"use strict";
const horizontal = document.querySelector(".line_x");
const vertical = document.querySelector(".line_y");
const target = document.querySelector(".target");
const tag = document.querySelector(".tag");

console.log(horizontal);
console.log(vertical);
console.log(target);
console.log(tag);

document.addEventListener("mousemove", function (event) {
  const x = event.clientX;
  const y = event.clientY;
  //resize, click
  target.style.background = "pink";
  setTimeout(() => {
    target.style.background = "";
  }, 300);

  //console.log(event);
  console.log(`${x} px, ${y} px`);
  //console.log(`${event.clientX}, ${event.clientY}`);
  //horizontal.style.top = `${x}px`;
  horizontal.style.top = `${y}px`;
  vertical.style.left = `${x}px`;
  target.style.left = `${x}px`;
  target.style.top = `${y}px`;
  tag.style.top = `${y}px`;
  tag.style.left = `${x}px`;
});

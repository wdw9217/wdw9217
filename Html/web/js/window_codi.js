"use strict";

const box4 = document.querySelector(".box4");
console.log(box4);

box4.addEventListener("click", function (event) {
  console.log(event);
  const rect = box4.getBoundingClientRect();
  console.log(rect);
});

const scroll_by_u = document.querySelector(".scroll_up");
const scroll_by_d = document.querySelector(".scroll_down");
const scroll_by_l = document.querySelector(".scroll_left");
const scroll_by_r = document.querySelector(".scroll_right");
const scroll_to = document.querySelector(".scroll_2");
const scroll_in = document.querySelector(".scroll_3");

console.log(scroll_by_u);
console.log(scroll_by_d);
console.log(scroll_by_l);
console.log(scroll_by_r);

scroll_by_u.addEventListener("click", (event) =>
  window.scrollBy({ top: -100, left: 0, behavior: "smooth" })
);
scroll_by_d.addEventListener("click", (event) =>
  window.scrollBy({ top: 100, left: 0, behavior: "smooth" })
);
scroll_by_l.addEventListener("click", (event) =>
  window.scrollBy({ top: 0, left: -50, behavior: "smooth" })
);
scroll_by_r.addEventListener("click", (event) =>
  window.scrollBy({ top: 0, left: 50, behavior: "smooth" })
);
scroll_to.addEventListener("click", (event) => window.scrollTo(0, 100));
scroll_in.addEventListener("click", (event) => box4.scrollIntoView());

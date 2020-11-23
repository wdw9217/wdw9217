"use strict";

/*left side*/

const aside = document.querySelector(".aside");

const bside = document.querySelector(".bside");

const cside = document.querySelector(".cside");

/*center*/

const head = document.querySelector(".head");

const center = document.querySelector(".center");

const footer = document.querySelector(".footer");

/*right side*/

const dside = document.querySelector(".dside");

window.onload = () => {
  resize();
};

window.addEventListener("resize", () => resize());

function resize() {
  const stageWidth = document.body.clientWidth;

  const stageHeight = document.body.clientHeight;

  console.log(`Client X: ${stageWidth}`);

  console.log(`Client Y: ${stageHeight}`);

  const x = stageWidth / 3;

  const y = stageHeight / 3;

  console.log(`1/3 X: ${x}`);

  console.log(`1/3 Y: ${y}`);

  const center_x = stageWidth / 2;

  const center_y = stageHeight / 2;

  console.log(`1/2 X: ${center_x}`);

  console.log(`1/2 Y: ${center_y}`);

  aside.style.top = `-${y}px`;

  bside.style.left = `-${x}px`;

  cside.style.top = `${y}px`;

  head.style.top = `-${y}px`;

  head.style.left = `${x}px`;

  center.style.top = `${y * 3}px`;

  center.style.left = `${x * 3}px`;

  footer.style.top = `${y * 3}px`;

  footer.style.left = `${x}px`;

  dside.style.top = `-${y}px`;

  dside.style.left = `${x * 2}px`;

  /*aside*/

  aside.style.visibility = "visible";

  aside.style.position = "relative";

  aside.style.transition = "transform 1000ms ease-in";

  aside.style.transform = `translateY(${y}px)`;

  /*bside*/

  bside.style.visibility = "visible";

  bside.style.position = "relative";

  bside.style.transition = "transform 1200ms ease-in";

  bside.style.transform = `translateX(${x}px)`;

  /*cside*/

  cside.style.visibility = "visible";

  cside.style.position = "relative";

  cside.style.transition = "transform 1400ms ease-in";

  cside.style.transform = `translateY(-${y}px)`;

  /*head*/

  head.style.visibility = "visible";

  head.style.position = "absolute";

  head.style.transition = "transform 1400ms ease-in";

  head.style.transform = `translateY(${y}px)`;

  center.style.visibility = "visible";

  center.style.position = "absolute";

  center.style.transition = "transform 1400ms ease-in";

  center.style.transform = `translate(-${x * 2}px, -${
    y * 2 + (y * 35) / 100
  }px)`;

  footer.style.visibility = "visible";

  footer.style.position = "absolute";

  footer.style.transition = "transform 1800ms ease-in";

  footer.style.transform = `translateY(-${y + (y * 10) / 100}px)`;

  dside.style.visibility = "visible";

  dside.style.position = "absolute";

  dside.style.transition = "transform 2000ms ease-in";

  dside.style.transform = `translateY(${y}px)`;
}

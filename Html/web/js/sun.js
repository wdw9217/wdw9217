"use strict";

let sun = new Image();
let moon = new Image();
let earth = new Image();
let mock = new Image();
const canvas = document.querySelector("#canvas");
const ctx = canvas.getContext("2d");

function init() {
  sun.src = "img/Canvas_sun.png";
  moon.src = "img/Canvas_moon.png";
  earth.src = "img/Canvas_earth.png";
  mock.src = "img/mock.png";
  window.requestAnimationFrame(draw);
}

function draw() {
  ctx.globalCompositeOperation = "destination-over";
  ctx.clearRect(0, 0, 300, 300); // clear canvas

  ctx.fillStyle = "rgba(0, 0, 0, 0.4)";
  ctx.strokeStyle = "rgba(0, 153, 255, 0.4)";
  ctx.save();
  ctx.translate(150, 150);

  // mock
  let time = new Date();

  ctx.rotate(
    ((2 * Math.PI) / 60) * time.getSeconds() +
      ((2 * Math.PI) / 60000) * time.getMilliseconds()
  );
  ctx.translate(50, 0);
  ctx.drawImage(mock, -10, -10);

  // Earth
  ctx.rotate(
    ((2 * Math.PI) / 60) * time.getSeconds() +
      ((2 * Math.PI) / 60000) * time.getMilliseconds()
  );
  ctx.translate(105, 0);
  ctx.fillRect(0, -12, 50, 24); // Shadow
  ctx.drawImage(earth, -10, -10);

  // Moon
  ctx.save();
  ctx.rotate(
    ((2 * Math.PI) / 6) * time.getSeconds() +
      ((2 * Math.PI) / 6000) * time.getMilliseconds()
  );
  ctx.translate(0, 28.5);
  ctx.drawImage(moon, -3.5, -3.5);

  ctx.restore();
  ctx.restore();
  ctx.beginPath();
  ctx.arc(150, 150, 105, 0, Math.PI * 2, false); // Earth orbit
  ctx.arc(150, 150, 140, 0, Math.PI * 2, false); // Earth orbit
  ctx.stroke();

  ctx.drawImage(sun, 0, 0, 300, 300);

  window.requestAnimationFrame(draw);
}

init();

"use strict";
var plu = 10;
var min = -10;
window.addEventListener("keydown", zz);
function zz(value) {
  let a = document.querySelector(".homework");
  console.log(a.getBoundingClientRect());
  if (value.keyCode == 38) {
    a.style.transform += "translateY(" + min + "px)";
    console.log("업");
  } else if (value.keyCode == 40) {
    a.style.transform += "translateY(" + plu + "px)";
    console.log("다운");
  } else if (value.keyCode == 37) {
    a.style.transform += "translateX(" + min + "px)";
    console.log("레프트");
  } else if (value.keyCode == 39) {
    a.style.transform += "translateX(" + plu + "px)";
    console.log("라이트");
  }
}

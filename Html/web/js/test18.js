"use strict";

var arrdata = [];
function insertArr() {
  var i = 0;
  for (i = 0; i <= 99; i++) {
    arrdata[i] = i + 1;
    document.write(arrdata[i] + " ");
  }
}

function delArr() {
  var i;
  for (i = 0; i < arrdata.length; i++) {
    if (i % 2 == 0) {
      arrdata[i] = 0;
    }
    continue;
  }
  selectArr();
}
function selectArr() {
  var i;
  for (i = 0; i < arrdata.length; i++) {
    document.write(arrdata[i] + " ");
  }
  document.write("<p>홀수 번째 데이터 초기화 완료!" + "</p>");
  document.write("<a href='22_arr.html'>돌아가기</a>");
}
insertArr();

/* 홈페이지 상단 왼쪽 슬라이드 메뉴 */
$(function () {
  var s = $(".menu"),
    a = $(".attention");
  $(window).click(function () {
    if (s.hasClass("menu-open")) {
      s.removeClass("menu-open");
      a.html("");
    }
  });
  $(".menu-button").click(function (e) {
    s.addClass("menu-open");
    e.stopPropagation();
    a.html("메뉴를 닫으려면 화면의 아무 곳이나 클릭하십시오!");
  });
});
/*--------------------------------------------------------------------------- */

/* 메뉴 버튼 클릭 이벤트 */
document
  .querySelector(".menu-btn")
  .addEventListener("click", () =>
    document.querySelector(".main-menu").classList.toggle("show")
  );

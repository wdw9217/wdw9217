export class Point2 {
  constructor(index, x, y) {
    this.x = x; // center x = clientX/2
    this.y = y; // center y = clientY/2
    this.fixedY = y; // 최대높이
    this.speed = 0.3; // 높낮이 속도
    this.cur = index;
    this.max = Math.random() * 90;
  }

  update() {
    this.cur += this.speed;
    this.y = this.fixedY + Math.sin(this.cur) * this.max;
  }
}

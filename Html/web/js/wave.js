import { Point } from "./wave_point.js";
import { Point2 } from "./wave_point2.js";

export class Wave {
  constructor(index, totalPoints, color) {
    this.index = index;
    this.totalPoints = totalPoints;
    this.color = color;
    this.points = [];
    this.points2 = [];
  }

  resize(stageWidth, stageHeight) {
    this.stageWidth = stageWidth;
    this.stageHeight = stageHeight;

    this.centerX = stageWidth / 2;
    this.centerY = stageHeight / 7;

    this.pointGap = this.stageWidth / (this.totalPoints - 30);

    this.init();
  }

  init() {
    this.points = [];

    for (let i = 0; i < this.totalPoints; i++) {
      const point = new Point(this.index + i, this.pointGap * i, this.centerY);
      this.points[i] = point;
    }

    for (let i = 0; i < this.totalPoints; i++) {
      const point2 = new Point2(
        this.index + i,
        this.pointGap * i,
        this.centerY + 300
      );
      this.points2[i] = point2;
    }
  }
  draw(ctx) {
    ctx.beginPath();
    ctx.fillStyle = this.color;

    let prevX = this.points[0].x;
    let prevY = this.points[0].y;

    ctx.moveTo(prevX, prevY);

    for (let i = 1; i < this.totalPoints; i++) {
      if (i < this.totalPoints - 1) {
        this.points[i].update();
      }

      const cx = (prevX + this.points[i].x) / 2;
      const cy = (prevY + this.points[i].y) / 2;

      // ctx.lineTo(cx, cy); 직선
      ctx.quadraticCurveTo(prevX, prevY, cx, cy);

      prevX = this.points[i].x;
      prevY = this.points[i].y;
    }

    ctx.lineTo(prevX, prevY);
    ctx.lineTo(this.stageWidth, this.stageHeight);
    ctx.lineTo(this.points[0].x, this.stageHeight);
    ctx.fill();
    ctx.closePath();
  }

  draw2(ctx) {
    ctx.beginPath();
    ctx.fillStyle = this.color;

    let prevX = this.points2[0].x;
    let prevY = this.points2[0].y;

    ctx.moveTo(prevX, prevY);

    for (let i = 1; i < this.totalPoints; i++) {
      if (i < this.totalPoints - 1) {
        this.points2[i].update();
      }

      const cx = (prevX + this.points2[i].x) / 2;
      const cy = (prevY + this.points2[i].y) / 2;

      // ctx.lineTo(cx, cy); 직선
      ctx.quadraticCurveTo(prevX, prevY, cx, cy);

      prevX = this.points2[i].x;
      prevY = this.points2[i].y;
    }

    ctx.lineTo(prevX, prevY);
    ctx.lineTo(this.stageWidth, this.stageHeight);
    ctx.lineTo(this.points2[0].x, this.stageHeight);
    ctx.fill();
    ctx.closePath();
  }
}

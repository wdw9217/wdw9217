import { Points } from "./points.js";

export class Hompage {
  constructor() {}

  resize(stageWidth, stageHeight) {
    this.stageWidth = stageWidth;
    this.stageHeight = stageHeight;

    this.centerX = stageWidth / 2;
    this.centerY = stageHeight / 2;

    this.init();
  }

  init() {
    this.points = new Points(this.centerX, this.centerY);
  }

  draw(ctx) {
    ctx.beginPath();
    ctx.fillStyle = "blue";

    this.points.update();
    //  console.log (ctx.fillStyle);

    ctx.arc(this.points.x, this.points.y, 30, 0, 2 * Math.PI);
    // console.log (this.points.x);
    // console.log (this.points.y);
    ctx.fill();
  }
}

export class WatchDraw{
    constructor(){
        this.time = new Date();
        this.hour = this.time.getHours();
        if (this.hour == 0){
            this.hour = 12;
        }else if (this.hour >=13){
            this.hour -= 13
        }
        this.min = this.time.getMinutes();
        this.sec = this.time.getSeconds();
        this.m_sec = this.time.getMilliseconds();    
    }

    resize(stageWidth, stageHeight){
        this.stageWidth = stageWidth;
        this.stageHeight= stageHeight;
    }

    update(ctx) {
        let green = ctx.createRadialGradient(250, 250, .5, 250, 250, 250);
        green.addColorStop(0, 'hsla(180, 55%, 8%, 1)');
        green.addColorStop(1, 'hsla(180, 95%, 15%, 1)');
        ctx.fillStyle = green;
        console.log (this.stageWidth);
        console.log (this.stageHeight)
        ctx.fillRect(0, 0, this.stageWidth, this.stageHeight);
    }
    

}  
 PImage face;
void setup() {
  face = loadImage("face.jpg");
  size(800,600);
  face.resize(800,600);
}

void draw() {
   background(face);
   println("X="+mouseX);
   println("Y="+mouseY);
     ellipse(245,230,50,50);
     ellipse(545,225,50,50);
        fill(#0D0C0C);
      ellipse(545,225,30,30);
      ellipse(545,225,30,30);


}

 
  

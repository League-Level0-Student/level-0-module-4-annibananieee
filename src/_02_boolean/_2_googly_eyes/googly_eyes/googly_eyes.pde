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
           fill(#121111);
      ellipse(545,225,30,30);
      ellipse(545,225,30,30);
           fill(#FCF7F7);
     

}

 
  

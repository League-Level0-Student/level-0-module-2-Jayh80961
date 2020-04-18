
void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     
     // This code draws the holes
     
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30);
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);
}

void draw() {
    noStroke();
    fill(125, 93, 43);
    ellipse(70, 100, 60, 60); 
    fill(255, 237, 209);
    ellipse(70, 100+10, 33, 28); 
    fill(0, 0, 0);
    ellipse(70-10, 100-15, 10, 10); 
    ellipse(70+10, 100-15, 10, 10);
    ellipse(70, 100-5, 10, 10); 
    ellipse(70, 100+10, 20, 5); 
   
    noStroke();
    fill(125, 93, 43);
    ellipse(300, 40, 60, 60); 
    fill(255, 237, 209);
    ellipse(300, 40+10, 33, 28); 
    fill(0, 0, 0);
    ellipse(300-10, 40-15, 10, 10); 
    ellipse(300+10, 40-15, 10, 10);
    ellipse(300, 40-5, 10, 10); 
    ellipse(300, 40+10, 20, 5); 
    
    noStroke();
    fill(125, 93, 43);
    ellipse(200, 180, 60, 60); 
    fill(255, 237, 209);
    ellipse(200, 180+10, 33, 28); 
    fill(0, 0, 0);
    ellipse(200-10, 180-15, 10, 10); 
    ellipse(200+10, 180-15, 10, 10);
    ellipse(200, 180-5, 10, 10); 
    ellipse(200, 180+10, 20, 5); 
    
    noStroke();
    fill(125, 93, 43);
    ellipse(299, 330, 60, 60); 
    fill(255, 237, 209);
    ellipse(299, 330+10, 33, 28); 
    fill(0, 0, 0);
    ellipse(299-10, 330-15, 10, 10); 
    ellipse(299+10, 330-15, 10, 10);
    ellipse(299, 330-5, 10, 10); 
    ellipse(299, 330+10, 20, 5); 


}

void drawMole(int moleX, int moleY) {
     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, 20, 5); // mouth
}

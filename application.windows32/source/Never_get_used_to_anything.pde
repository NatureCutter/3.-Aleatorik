int x1, x2, x3, y1, y2, y3;

void setup() {
  background(255);
 size(600, 600); 

}

void draw() {
}

void mousePressed() {
  
   background(255);
 stroke(0);
 int stepsize = 2;          //nach wie vielen geraden linien folgt eine bezierkurve
 int over = 2;              //wie oft wird dies wiederholt
 
int[] ar = new int[2];
   ar[0] = int(random(0,600));
   ar[1] = int(random(0,600));
   for(int j = 0; j<over; j++) {
for(int i=0;i<stepsize;i++){
  x1 = ar[0];
  y1 = ar[1];
  
  x2 = int(random(0,600));
  y2 = int(random(0,600));
  
  ar[0] = x2;
  ar[1] = y2;
 line(x1, y1, x2, y2); 
}
noFill();
x3 = int(random(600));
y3 = int(random(600));
bezier(ar[0], ar[1], int(random(600)),int(random(600)),int(random(600)),int(random(600)), x3, y3);
ar[0] = x3;
ar[1] = y3;
}
 
}

void keyPressed() {
  if(key == 's' || key == 'S') {
  saveFrame("yeah-####.png");  
}}

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Never_get_used_to_anything extends PApplet {

int x1, x2, x3, y1, y2, y3;

public void setup() {
  background(255);
 size(600, 600); 

}

public void draw() {
}

public void mousePressed() {
  
   background(255);
 stroke(0);
 int stepsize = 2;          //nach wie vielen geraden linien folgt eine bezierkurve
 int over = 2;              //wie oft wird dies wiederholt
 
int[] ar = new int[2];
   ar[0] = PApplet.parseInt(random(0,600));
   ar[1] = PApplet.parseInt(random(0,600));
   for(int j = 0; j<over; j++) {
for(int i=0;i<stepsize;i++){
  x1 = ar[0];
  y1 = ar[1];
  
  x2 = PApplet.parseInt(random(0,600));
  y2 = PApplet.parseInt(random(0,600));
  
  ar[0] = x2;
  ar[1] = y2;
 line(x1, y1, x2, y2); 
}
noFill();
x3 = PApplet.parseInt(random(600));
y3 = PApplet.parseInt(random(600));
bezier(ar[0], ar[1], PApplet.parseInt(random(600)),PApplet.parseInt(random(600)),PApplet.parseInt(random(600)),PApplet.parseInt(random(600)), x3, y3);
ar[0] = x3;
ar[1] = y3;
}
 
}

public void keyPressed() {
  if(key == 's' || key == 'S') {
  saveFrame("yeah-####.png");  
}}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Never_get_used_to_anything" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

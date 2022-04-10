
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class BubbleCross extends Application implements Runnable {
    
    boolean shutdown = false;

    public void shutdown() {
       shutdown = true;
    }
    
    int counter = 0;
    int flag;
    Group menuG;
    Group stage1;
    Group stage2;
    Group stage3;
    
    Scene sceneStage3;
    Scene sceneMenu;
    Scene sceneStage1;
    Scene sceneStage2;

    Label scoreLabel;
    Label scoreLabel2;
    Label scoreLabel3;
    //stage1 car
    
    Circle car; 
    Circle car1;
    Circle car2;
    Circle car3;
    Circle car4;
    Circle car5;
    Circle car6;
    Circle car7;
    Circle car8;
    Circle car9;
    //stage2 car
    
    Circle carY; 
    Circle carY1;
    Circle carY2;
    Circle carY3;
    Circle carY4;
    Circle carY5;
    Circle carY6;
    Circle carY7;
    
    
    //Stage3 car
    
    Circle carStage3; 
    Circle car1Stage3;
    Circle car2Stage3;
    Circle car3Stage3;
    Circle car4Stage3;
    Circle car5Stage3;
    Circle car6Stage3;
    Circle car7Stage3;
    Circle car8Stage3;
    Circle car9Stage3;
    
    Circle carYStage3; 
    Circle carY1Stage3;
    Circle carY2Stage3;
    Circle carY3Stage3;
    Circle carY4Stage3;
    Circle carY5Stage3;
    Circle carY6Stage3;
    Circle carY7Stage3;

    
    
    Circle human;
    Circle human2;
    Circle human3;
    Thread t1;

    public void run() {
        
        
        while (!shutdown) {
            Platform.runLater(() -> {
                
                if(flag==1){
                
                car.setCenterX(car.getCenterX() + 1);
                car1.setCenterX(car1.getCenterX() + 1);
                car2.setCenterX(car2.getCenterX() + 1);
                car3.setCenterX(car3.getCenterX() + 1);
                car4.setCenterX(car4.getCenterX() + 1);
                car5.setCenterX(car5.getCenterX() + 1);
                car6.setCenterX(car6.getCenterX() + 1);
                car7.setCenterX(car7.getCenterX() + 1);
                car8.setCenterX(car8.getCenterX() + 1);
                car9.setCenterX(car9.getCenterX() + 1);
               
                
                if((human.getCenterX()+human.getRadius()>car.getCenterX()-car.getRadius())&&(human.getCenterX()-human.getRadius()<car.getCenterX()+car.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car.getCenterY()-car.getRadius())&&(human.getCenterY()-human.getRadius()<car.getCenterY()+car.getRadius())){
                           shutdown();

                    }
                }
                
                if((human.getCenterX()+human.getRadius()>car1.getCenterX()-car1.getRadius())&&(human.getCenterX()-human.getRadius()<car1.getCenterX()+car1.getRadius())) {
                    
                    if((human.getCenterY()+human.getRadius()>car1.getCenterY()-car1.getRadius())&&(human.getCenterY()-human.getRadius()<car1.getCenterY()+car1.getRadius())){
                             
                        shutdown(); } 
                }
                
                if((human.getCenterX()+human.getRadius()>car2.getCenterX()-car2.getRadius())&&(human.getCenterX()-human.getRadius()<car2.getCenterX()+car2.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car2.getCenterY()-car2.getRadius())&&(human.getCenterY()-human.getRadius()<car2.getCenterY()+car2.getRadius())){
                           
                        shutdown();}
                }
                
                if((human.getCenterX()+human.getRadius()>car3.getCenterX()-car3.getRadius())&&(human.getCenterX()-human.getRadius()<car3.getCenterX()+car3.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car3.getCenterY()-car3.getRadius())&&(human.getCenterY()-human.getRadius()<car3.getCenterY()+car3.getRadius())){
                           
                        shutdown();}
                }
                
                if((human.getCenterX()+human.getRadius()>car4.getCenterX()-car4.getRadius())&&(human.getCenterX()-human.getRadius()<car4.getCenterX()+car4.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car4.getCenterY()-car4.getRadius())&&(human.getCenterY()-human.getRadius()<car4.getCenterY()+car4.getRadius())){
                           
                        shutdown();}
                }
                
                if((human.getCenterX()+human.getRadius()>car5.getCenterX()-car5.getRadius())&&(human.getCenterX()-human.getRadius()<car5.getCenterX()+car5.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car5.getCenterY()-car5.getRadius())&&(human.getCenterY()-human.getRadius()<car5.getCenterY()+car5.getRadius())){
                         
                        shutdown();}
                }
                
                if((human.getCenterX()+human.getRadius()>car6.getCenterX()-car6.getRadius())&&(human.getCenterX()-human.getRadius()<car6.getCenterX()+car6.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car6.getCenterY()-car6.getRadius())&&(human.getCenterY()-human.getRadius()<car6.getCenterY()+car6.getRadius())){
                        
                        shutdown();}
                }
                
                if((human.getCenterX()+human.getRadius()>car7.getCenterX()-car7.getRadius())&&(human.getCenterX()-human.getRadius()<car7.getCenterX()+car7.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car7.getCenterY()-car7.getRadius())&&(human.getCenterY()-human.getRadius()<car7.getCenterY()+car7.getRadius())){
                         
                        shutdown();}
                }
                
                if((human.getCenterX()+human.getRadius()>car8.getCenterX()-car8.getRadius())&&(human.getCenterX()-human.getRadius()<car8.getCenterX()+car8.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car8.getCenterY()-car8.getRadius())&&(human.getCenterY()-human.getRadius()<car8.getCenterY()+car8.getRadius())){
                        
                        shutdown();}
                }
                if((human.getCenterX()+human.getRadius()>car9.getCenterX()-car9.getRadius())&&(human.getCenterX()-human.getRadius()<car9.getCenterX()+car9.getRadius())) {
                     
                    if((human.getCenterY()+human.getRadius()>car9.getCenterY()-car9.getRadius())&&(human.getCenterY()-human.getRadius()<car9.getCenterY()+car8.getRadius())){
                        
                        shutdown();}
                }
                
                
                if(car.getCenterX()-car.getRadius()>=sceneStage1.getWidth()){
                    car.setCenterX(0);
                }
                
                if(car1.getCenterX()-car1.getRadius()>=sceneStage1.getWidth()){
                    car1.setCenterX(0);
                }
                if(car2.getCenterX()-car2.getRadius()>=sceneStage1.getWidth()){
                    car2.setCenterX(0);
                }
                if(car3.getCenterX()-car3.getRadius()>=sceneStage1.getWidth()){
                    car3.setCenterX(0);
                }
                if(car4.getCenterX()-car4.getRadius()>=sceneStage1.getWidth()){
                    car4.setCenterX(0);
                }
                if(car5.getCenterX()-car5.getRadius()>=sceneStage1.getWidth()){
                    car5.setCenterX(0);
                }
                if(car6.getCenterX()-car6.getRadius()>=sceneStage1.getWidth()){
                    car6.setCenterX(0);
                }
                if(car7.getCenterX()-car7.getRadius()>=sceneStage1.getWidth()){
                    car7.setCenterX(0);
                }
                if(car8.getCenterX()-car8.getRadius()>=sceneStage1.getWidth()){
                    car8.setCenterX(0);
                }
                if(car9.getCenterX()-car9.getRadius()>=sceneStage1.getWidth()){
                    car9.setCenterX(0);
                }
                
                if(human.getCenterY()+human.getRadius()<=0){
					
					
					
					
					
                
                    scoreLabel.setText("You Have Won The Game On " +counter+" Seconds");
					shutdown();
                
                
                }
                
                
            }
                
//========================================================================================STAGE2==============================================================================================
             if(flag==2){
                 
                 
                 carY.setCenterY(carY.getCenterY() + 1);
                carY1.setCenterY(carY1.getCenterY() + 1);
                carY2.setCenterY(carY2.getCenterY() + 1);
                carY3.setCenterY(carY3.getCenterY() + 1);
                carY4.setCenterY(carY4.getCenterY() + 1);
                carY5.setCenterY(carY5.getCenterY() + 1);
                carY6.setCenterY(carY6.getCenterY() + 1);
                carY7.setCenterY(carY7.getCenterY() + 1);

                if((human2.getCenterX()+human2.getRadius()>carY.getCenterX()-carY.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY.getCenterX()+carY.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY.getCenterY()-carY.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY.getCenterY()+carY.getRadius())){

                            shutdown();
                    }
                }
                
                if((human2.getCenterX()+human2.getRadius()>carY1.getCenterX()-carY1.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY1.getCenterX()+carY1.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY1.getCenterY()-carY1.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY1.getCenterY()+carY1.getRadius())){

                            shutdown();
                    }
                }
                
                if((human2.getCenterX()+human2.getRadius()>carY2.getCenterX()-carY2.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY2.getCenterX()+carY2.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY2.getCenterY()-carY2.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY2.getCenterY()+carY2.getRadius())){

                            shutdown();
                    }
                }
                
                
                if((human2.getCenterX()+human2.getRadius()>carY3.getCenterX()-carY3.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY3.getCenterX()+carY3.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY3.getCenterY()-carY3.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY3.getCenterY()+carY3.getRadius())){

                            shutdown();
                    }
                }
                
                
                if((human2.getCenterX()+human2.getRadius()>carY4.getCenterX()-carY4.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY4.getCenterX()+carY4.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY4.getCenterY()-carY4.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY4.getCenterY()+carY4.getRadius())){

                            shutdown();
                    }
                }
                
                
                if((human2.getCenterX()+human2.getRadius()>carY5.getCenterX()-carY5.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY5.getCenterX()+carY5.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY5.getCenterY()-carY5.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY5.getCenterY()+carY5.getRadius())){

                            shutdown();
                    }
                }
                
                
                if((human2.getCenterX()+human2.getRadius()>carY6.getCenterX()-carY6.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY6.getCenterX()+carY6.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY6.getCenterY()-carY6.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY6.getCenterY()+carY6.getRadius())){

                            shutdown();
                    }
                }
                
                
                if((human2.getCenterX()+human2.getRadius()>carY7.getCenterX()-carY7.getRadius())&&(human2.getCenterX()-human2.getRadius()<carY7.getCenterX()+carY7.getRadius())) {
                     
                    if((human2.getCenterY()+human2.getRadius()>carY7.getCenterY()-carY7.getRadius())&&(human2.getCenterY()-human2.getRadius()<carY7.getCenterY()+carY7.getRadius())){

                            shutdown();
                    }
                }

                if(carY.getCenterY()-carY.getRadius()>=sceneStage2.getHeight()){
                    carY.setCenterY(0);
                }
                if(carY1.getCenterY()-carY1.getRadius()>=sceneStage2.getHeight()){
                    carY1.setCenterY(0);
                }
                if(carY2.getCenterY()-carY2.getRadius()>=sceneStage2.getHeight()){
                    carY2.setCenterY(0);
                }
                if(carY3.getCenterY()-carY3.getRadius()>=sceneStage2.getHeight()){
                    carY3.setCenterY(0);
                }
                if(carY4.getCenterY()-carY4.getRadius()>=sceneStage2.getHeight()){
                    carY4.setCenterY(0);
                }
                if(carY5.getCenterY()-carY5.getRadius()>=sceneStage2.getHeight()){
                    carY5.setCenterY(0);
                }
                if(carY6.getCenterY()-carY6.getRadius()>=sceneStage2.getHeight()){
                    carY6.setCenterY(0);
                }
                if(carY7.getCenterY()-carY7.getRadius()>=sceneStage2.getHeight()){
                    carY7.setCenterY(0);
                }
                
                if(human2.getCenterY()+human2.getRadius()<=0){
                
                    scoreLabel2.setText("You Have Won The Game On " +counter+" Seconds");
					shutdown();
                
                }
               
                

            }
             
             
//==============================================================================STAGE3============================================================================================================

            if(flag==3){
                
                carStage3.setCenterX(carStage3.getCenterX() + 1);
                car1Stage3.setCenterX(car1Stage3.getCenterX() + 1);
                car2Stage3.setCenterX(car2Stage3.getCenterX() + 1);
                car3Stage3.setCenterX(car3Stage3.getCenterX() + 1);
                car4Stage3.setCenterX(car4Stage3.getCenterX() + 1);
                car5Stage3.setCenterX(car5Stage3.getCenterX() + 1);
                car6Stage3.setCenterX(car6Stage3.getCenterX() + 1);
                car7Stage3.setCenterX(car7Stage3.getCenterX() + 1);
                car8Stage3.setCenterX(car8Stage3.getCenterX() + 1);
                car9Stage3.setCenterX(car9Stage3.getCenterX() + 1);
                
                
                carYStage3.setCenterY(carYStage3.getCenterY() + 1);
                carY1Stage3.setCenterY(carY1Stage3.getCenterY() + 1);
                carY2Stage3.setCenterY(carY2Stage3.getCenterY() + 1);
                carY3Stage3.setCenterY(carY3Stage3.getCenterY() + 1);
                carY4Stage3.setCenterY(carY4Stage3.getCenterY() + 1);
                carY5Stage3.setCenterY(carY5Stage3.getCenterY() + 1);
                carY6Stage3.setCenterY(carY6Stage3.getCenterY() + 1);
                carY7Stage3.setCenterY(carY7Stage3.getCenterY() + 1);
                
                
                if((human3.getCenterX()+human3.getRadius()>carStage3.getCenterX()-carStage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carStage3.getCenterX()+carStage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carStage3.getCenterY()-carStage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carStage3.getCenterY()+carStage3.getRadius())){
                            
                            shutdown();  
                            t1.start();
                    }
                }
                
                if((human3.getCenterX()+human3.getRadius()>car1Stage3.getCenterX()-car1Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car1Stage3.getCenterX()+car1Stage3.getRadius())) {
                    
                    if((human3.getCenterY()+human3.getRadius()>car1Stage3.getCenterY()-car1Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car1Stage3.getCenterY()+car1Stage3.getRadius())){
                            shutdown(); } 
                }
                
                if((human3.getCenterX()+human3.getRadius()>car2Stage3.getCenterX()-car2Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car2Stage3.getCenterX()+car2Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car2Stage3.getCenterY()-car2Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car2Stage3.getCenterY()+car2Stage3.getRadius())){
                            shutdown();}
                }
                
                if((human3.getCenterX()+human3.getRadius()>car3Stage3.getCenterX()-car3Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car3Stage3.getCenterX()+car3Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car3Stage3.getCenterY()-car3Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car3Stage3.getCenterY()+car3Stage3.getRadius())){
                            shutdown();}
                }
                
                if((human3.getCenterX()+human3.getRadius()>car4Stage3.getCenterX()-car4Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car4Stage3.getCenterX()+car4Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car4Stage3.getCenterY()-car4Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car4Stage3.getCenterY()+car4Stage3.getRadius())){
                            shutdown();}
                }
                
                if((human3.getCenterX()+human3.getRadius()>car5Stage3.getCenterX()-car5Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car5Stage3.getCenterX()+car5Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car5Stage3.getCenterY()-car5Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car5Stage3.getCenterY()+car5Stage3.getRadius())){
                            shutdown();}
                }
                
                if((human3.getCenterX()+human3.getRadius()>car6Stage3.getCenterX()-car6Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car6Stage3.getCenterX()+car6Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car6Stage3.getCenterY()-car6Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car6Stage3.getCenterY()+car6Stage3.getRadius())){
                            shutdown();}
                }
                
                if((human3.getCenterX()+human3.getRadius()>car7Stage3.getCenterX()-car7Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car7Stage3.getCenterX()+car7Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car7Stage3.getCenterY()-car7Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car7Stage3.getCenterY()+car7Stage3.getRadius())){
                            shutdown();}
                }
                
                if((human3.getCenterX()+human3.getRadius()>car8Stage3.getCenterX()-car8Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car8Stage3.getCenterX()+car8Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car8Stage3.getCenterY()-car8Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car8Stage3.getCenterY()+car8Stage3.getRadius())){
                            shutdown();}
                }
                if((human3.getCenterX()+human3.getRadius()>car9Stage3.getCenterX()-car9Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<car9Stage3.getCenterX()+car9Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>car9Stage3.getCenterY()-car9Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<car9Stage3.getCenterY()+car8Stage3.getRadius())){
                            shutdown();}
                }
                
                
                
                
                if((human3.getCenterX()+human3.getRadius()>carYStage3.getCenterX()-carYStage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carYStage3.getCenterX()+carYStage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carYStage3.getCenterY()-carYStage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carYStage3.getCenterY()+carYStage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                if((human3.getCenterX()+human3.getRadius()>carY1Stage3.getCenterX()-carY1Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY1Stage3.getCenterX()+carY1Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY1Stage3.getCenterY()-carY1Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY1Stage3.getCenterY()+carY1Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                if((human3.getCenterX()+human3.getRadius()>carY2Stage3.getCenterX()-carY2Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY2Stage3.getCenterX()+carY2Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY2Stage3.getCenterY()-carY2Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY2Stage3.getCenterY()+carY2Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                
                if((human3.getCenterX()+human3.getRadius()>carY3Stage3.getCenterX()-carY3Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY3Stage3.getCenterX()+carY3Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY3Stage3.getCenterY()-carY3Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY3Stage3.getCenterY()+carY3Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                
                if((human3.getCenterX()+human3.getRadius()>carY4Stage3.getCenterX()-carY4Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY4Stage3.getCenterX()+carY4Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY4Stage3.getCenterY()-carY4Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY4Stage3.getCenterY()+carY4Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                
                if((human3.getCenterX()+human3.getRadius()>carY5Stage3.getCenterX()-carY5Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY5Stage3.getCenterX()+carY5Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY5Stage3.getCenterY()-carY5Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY5Stage3.getCenterY()+carY5Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                
                if((human3.getCenterX()+human3.getRadius()>carY6Stage3.getCenterX()-carY6Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY6Stage3.getCenterX()+carY6Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY6Stage3.getCenterY()-carY6Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY6Stage3.getCenterY()+carY6Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                
                if((human3.getCenterX()+human3.getRadius()>carY7Stage3.getCenterX()-carY7Stage3.getRadius())&&(human3.getCenterX()-human3.getRadius()<carY7Stage3.getCenterX()+carY7Stage3.getRadius())) {
                     
                    if((human3.getCenterY()+human3.getRadius()>carY7Stage3.getCenterY()-carY7Stage3.getRadius())&&(human3.getCenterY()-human3.getRadius()<carY7Stage3.getCenterY()+carY7Stage3.getRadius())){
                            //scoreLabel.setText("Score: " + (++counter));
                            
                            shutdown();
                    }
                }
                
                
                
                
                
                
                
                
                if(carStage3.getCenterX()-carStage3.getRadius()>=sceneStage3.getWidth()){
                    carStage3.setCenterX(0);
                }
                
                if(car1Stage3.getCenterX()-car1Stage3.getRadius()>=sceneStage3.getWidth()){
                    car1Stage3.setCenterX(0);
                }
                if(car2Stage3.getCenterX()-car2Stage3.getRadius()>=sceneStage3.getWidth()){
                    car2Stage3.setCenterX(0);
                }
                if(car3Stage3.getCenterX()-car3Stage3.getRadius()>=sceneStage3.getWidth()){
                    car3Stage3.setCenterX(0);
                }
                if(car4Stage3.getCenterX()-car4Stage3.getRadius()>=sceneStage3.getWidth()){
                    car4Stage3.setCenterX(0);
                }
                if(car5Stage3.getCenterX()-car5Stage3.getRadius()>=sceneStage3.getWidth()){
                    car5Stage3.setCenterX(0);
                }
                if(car6Stage3.getCenterX()-car6Stage3.getRadius()>=sceneStage3.getWidth()){
                    car6Stage3.setCenterX(0);
                }
                if(car7Stage3.getCenterX()-car7Stage3.getRadius()>=sceneStage3.getWidth()){
                    car7Stage3.setCenterX(0);
                }
                if(car8Stage3.getCenterX()-car8Stage3.getRadius()>=sceneStage3.getWidth()){
                    car8Stage3.setCenterX(0);
                }
                if(car9Stage3.getCenterX()-car9Stage3.getRadius()>=sceneStage3.getWidth()){
                    car9Stage3.setCenterX(0);
                }
                
                
                
                
                if(carYStage3.getCenterY()-carYStage3.getRadius()>=sceneStage3.getHeight()){
                    carYStage3.setCenterY(0);
                }
                if(carY1Stage3.getCenterY()-carY1Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY1Stage3.setCenterY(0);
                }
                if(carY2Stage3.getCenterY()-carY2Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY2Stage3.setCenterY(0);
                }
                if(carY3Stage3.getCenterY()-carY3Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY3Stage3.setCenterY(0);
                }
                if(carY4Stage3.getCenterY()-carY4Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY4Stage3.setCenterY(0);
                }
                if(carY5Stage3.getCenterY()-carY5Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY5Stage3.setCenterY(0);
                }
                if(carY6Stage3.getCenterY()-carY6Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY6Stage3.setCenterY(0);
                }
                if(carY7Stage3.getCenterY()-carY7Stage3.getRadius()>=sceneStage3.getHeight()){
                    carY7Stage3.setCenterY(0);
                }
                
                

                
            }
            scoreLabel.setText("Time :" + (++counter)/250+" Seconds");
            scoreLabel2.setText("Time :" + (++counter)/250+" Seconds");
            scoreLabel3.setText("Time :" + (++counter)/250+" Seconds");
            
            if(human3.getCenterY()-human3.getRadius()<=0){
                
                    scoreLabel3.setText("You Have Won The Game On " +counter/250+" Seconds");
					
					
					
					
					shutdown();
                
                }
            if(human2.getCenterY()-human2.getRadius()<=0){
                
                    scoreLabel2.setText("You Have Won The Game On " +counter/250+" Seconds");
                    shutdown();
                
                }
            if(human.getCenterY()-human.getRadius()<=0){
                
                    scoreLabel.setText("You Have Won The Game On " +counter/250+" Seconds");
			
					
                
                }
            
            
            
            });
            try {
                t1.sleep(25);
            } catch (InterruptedException ex) {

            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        scoreLabel = new Label("Time: 0 Seconds");
        car = new Circle(30, 150, 30,Paint.valueOf("#FF0000"));
        car1=new Circle(290,150,20,Paint.valueOf("#FF0000"));
        car2=new Circle(550,150,35,Paint.valueOf("#FF0000"));
        car3=new Circle(130,300,20,Paint.valueOf("#FF0000"));
        car4=new Circle(420,300,30,Paint.valueOf("#FF0000"));
        car5=new Circle(30,450,40,Paint.valueOf("#FF0000"));
        car6=new Circle(290,450,20,Paint.valueOf("#FF0000"));
        car7=new Circle(550,450,25,Paint.valueOf("#FF0000"));
        car8=new Circle(130,600,30,Paint.valueOf("#FF0000"));
        car9=new Circle(420,600,20,Paint.valueOf("#FF0000"));
        
        
        
        
        carY = new Circle(35, 400, 35,Paint.valueOf("#FFFF00"));
        carY1=new Circle(200,550,30,Paint.valueOf("#FF0000"));
        carY2=new Circle(200,40,30,Paint.valueOf("#00FF00"));
        carY3=new Circle(300,200,50,Paint.valueOf("#00FF00"));
        carY4=new Circle(400,80,30,Paint.valueOf("#58FAF4"));
        carY5=new Circle(380,350,40,Paint.valueOf("#FF00FF"));
        carY6=new Circle(500,320,30,Paint.valueOf("#82FA58"));
        carY7=new Circle(600,50,50,Paint.valueOf("#FE642E"));
        
        
        
        
        
        carStage3 = new Circle(30, 150, 20,Paint.valueOf("#FF0000"));
        car1Stage3=new Circle(290,150,20,Paint.valueOf("#FF0000"));
        car2Stage3=new Circle(550,150,35,Paint.valueOf("#FF0000"));
        car3Stage3=new Circle(130,300,20,Paint.valueOf("#FF0000"));
        car4Stage3=new Circle(420,300,30,Paint.valueOf("#FF0000"));
        car5Stage3=new Circle(30,450,40,Paint.valueOf("#FF0000"));
        car6Stage3=new Circle(290,450,10,Paint.valueOf("#FF0000"));
        car7Stage3=new Circle(550,450,20,Paint.valueOf("#FF0000"));
        car8Stage3=new Circle(130,600,25,Paint.valueOf("#FF0000"));
        car9Stage3=new Circle(420,600,30,Paint.valueOf("#FF0000"));

        carYStage3 = new Circle(35, 400, 35,Paint.valueOf("#FFFF00"));
        carY1Stage3=new Circle(200,550,30,Paint.valueOf("#FF0000"));
        carY2Stage3=new Circle(200,40,30,Paint.valueOf("#00FF00"));
        carY3Stage3=new Circle(300,200,20,Paint.valueOf("#00FF00"));
        carY4Stage3=new Circle(400,80,30,Paint.valueOf("#58FAF4"));
        carY5Stage3=new Circle(380,350,40,Paint.valueOf("#FF00FF"));
        carY6Stage3=new Circle(500,320,30,Paint.valueOf("#82FA58"));
        carY7Stage3=new Circle(600,50,20,Paint.valueOf("#FE642E"));
        
        
        human = new Circle(400, 650, 15);
        human2=new Circle(385,650,15);
        human3 = new Circle(385, 650, 15);
        
        
        Button up=new Button("UP");
        Button down=new Button("Down");
        Button left=new Button("Left");
        Button right=new Button("Right");
        Button menu=new Button("Menu");
        
        up.setMaxWidth(Double.MAX_VALUE);
        down.setMaxWidth(Double.MAX_VALUE);
        left.setMaxWidth(Double.MAX_VALUE);
        right.setMaxWidth(Double.MAX_VALUE);
        
        up.setOnAction(e->{
            for(int i=0; i<10; i++){
                human.setCenterY(human.getCenterY()-1);
            }
            
        });
        
        down.setOnAction(e->{
            for(int i=0; i<10; i++){
                human.setCenterY(human.getCenterY()+1);
            }
            
        });
        
        left.setOnAction(e->{
            for(int i=0; i<10; i++){
                human.setCenterX(human.getCenterX()-1);
            }
            
        });
        
        right.setOnAction(e->{
            for(int i=0; i<10; i++){
                human.setCenterX(human.getCenterX()+1);
            }
            
        });
        
        Button ups3=new Button("UP");
        Button downs3=new Button("Down");
        Button lefts3=new Button("Left");
        Button rights3=new Button("Right");
        
        ups3.setOnAction(e->{
            for(int i=0; i<10; i++){
                human3.setCenterY(human3.getCenterY()-1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        downs3.setOnAction(e->{
            for(int i=0; i<10; i++){
                human3.setCenterY(human3.getCenterY()+1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        lefts3.setOnAction(e->{
            for(int i=0; i<10; i++){
                human3.setCenterX(human3.getCenterX()-1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        rights3.setOnAction(e->{
            for(int i=0; i<10; i++){
                human3.setCenterX(human3.getCenterX()+1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        
        
        Button ups2=new Button("UP");
        Button downs2=new Button("Down");
        Button lefts2=new Button("Left");
        Button rights2=new Button("Right");
        
        ups2.setOnAction(e->{
            for(int i=0; i<10; i++){
                human2.setCenterY(human2.getCenterY()-1);

            }
            
        });
        
        downs2.setOnAction(e->{
            for(int i=0; i<10; i++){
                human2.setCenterY(human2.getCenterY()+1);

            }
            
        });
        
        lefts2.setOnAction(e->{
            for(int i=0; i<10; i++){
                human2.setCenterX(human2.getCenterX()-1);

            }
            
        });
        
        rights2.setOnAction(e->{
            for(int i=0; i<10; i++){
                human2.setCenterX(human2.getCenterX()+1);

            }
            
        });
        
        
        
        
        menu.setOnAction(e->{
            shutdown();
            primaryStage.setScene(sceneMenu);
            
        
        });
        scoreLabel2 = new Label("Time: 0 Seconds");
        scoreLabel3 = new Label("Time: 0 Seconds");
        

        
        HBox hButton=new HBox(20);
        hButton.getChildren().addAll(up,down,left,right);
        hButton.setPadding(new Insets(650,300,0,300));
        
        HBox hButtonS2=new HBox(20);
        hButtonS2.getChildren().addAll(ups2,downs2,lefts2,rights2);
        hButtonS2.setPadding(new Insets(650,300,0,300));
        
        
        HBox hButtonS3=new HBox(20);
        hButtonS3.getChildren().addAll(ups3,downs3,lefts3,rights3);
        hButtonS3.setPadding(new Insets(650,300,0,300));
        


        stage1 = new Group(scoreLabel, car,car1,car2,car3,car4,car5,car6,car7,car8,car9,human,hButton);
        stage2=new Group(scoreLabel2,carY,carY1,carY2,carY3,carY4,carY5,carY6,carY7,human2,hButtonS2);
        
        stage3=new Group(scoreLabel3, carStage3,carYStage3,car1Stage3,carY1Stage3,car2Stage3,carY2Stage3,car3Stage3,carY3Stage3,car4Stage3,carY4Stage3,car5Stage3,carY5Stage3,car6Stage3,carY6Stage3,car7Stage3,carY7Stage3,car8Stage3,car9Stage3,human3,hButtonS3);
        
        
        
        Label lbl = new Label();
        lbl.setText("Welcome To Bubble Cross");
        lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
	Separator separator1 = new Separator();
        
        Button newGame=new Button("NEW GAME");
        Button highScore=new Button ("HIGH SCORE");
        Button rateGame=new Button("RATE THIS GAME!");
        newGame.setMaxWidth(Double.MAX_VALUE);
        highScore.setMaxWidth(Double.MAX_VALUE);
        rateGame.setMaxWidth(Double.MAX_VALUE);
        
        highScore.setOnAction((ActionEvent e) -> {
        
            try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","manage");  
			Statement stmt=con.createStatement();  

			ResultSet rs=stmt.executeQuery("select * from highscore");  
			while(rs.next())  
                            continue;
			//hihgScoreD.setText(rs.getInt(1));
			}
			catch(Exception ed){ System.out.println(ed);}
        
        });
       
        
        
        VBox vbl=new VBox();
        vbl.setPadding(new Insets(120));
        vbl.getChildren().addAll(lbl,separator1);
        
        
        VBox vbx=new VBox(50);
        vbx.setPadding(new Insets(200,250,0,250));
        
        vbx.getChildren().addAll(newGame,highScore,rateGame);
        
        
        
        
        Label le = new Label();
        le.setText("Select Level");
        le.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        
	Separator ls = new Separator();
        VBox lbll=new VBox();
        lbll.setPadding(new Insets(120));
        lbll.getChildren().addAll(le,ls);
        
        
        Button hard=new Button("Hard");
        Button medium=new Button ("Medium");
        Button easy=new Button("Easy");
        hard.setMaxWidth(Double.MAX_VALUE);
        medium.setMaxWidth(Double.MAX_VALUE);
        easy.setMaxWidth(Double.MAX_VALUE);
        hard.setOnAction((ActionEvent e) -> {
        
            flag=3;
            primaryStage.setScene(sceneStage3);
        
        });
        medium.setOnAction((ActionEvent e) -> {
        
            flag=2;
            primaryStage.setScene(sceneStage2);
        
        });
        easy.setOnAction((ActionEvent e) -> {
        
            flag=1;
            primaryStage.setScene(sceneStage1);
        
        });
        
        
        
        VBox vbxb=new VBox(50);
        vbxb.setPadding(new Insets(200,250,0,250));
        
        vbxb.getChildren().addAll(easy,medium,hard);
       
        
        Group levelGroup=new Group(lbll,vbxb);
        Scene level=new Scene(levelGroup,600,600);
        newGame.setOnAction((ActionEvent e) -> {
        
            flag=3;
            primaryStage.setScene(level);
        
        });
        
        
        menuG=new Group(vbl,vbx);
        sceneMenu=new Scene(menuG,600,600);
        sceneStage1 = new Scene(stage1, 800,800);
        sceneStage2=new Scene(stage2,800,800);
        sceneStage3=new Scene(stage3,800,800);
        primaryStage.setTitle("Bubble Cross");
        primaryStage.setScene(sceneMenu);
        primaryStage.show();

        t1 = new Thread(this);
        t1.start();
    }
}

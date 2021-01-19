import java.util.Scanner;
public class Game {
	
 Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
  String playerName; 
  int choice; 
  int gun;
  int medkit;
  int flashlight;
  int map;
  int password; 
  int shadowHp = 100; 
  int playerHp = 100;
  double radiation; 
  int line;


  public static void main(String[] args) {
Game one; 
one = new Game();
one.playerSetUp();
one.intro();
one.chapterOne();
one.chapterTwo();
  }

  public void playerSetUp(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("                       12:08AM                             ");
   
   int timeToWait = 10; 
        System.out.println("[CONNECTING...]");
        try {
            for (int i=0; i<timeToWait ; i++) {
                Thread.sleep(500);
                System.out.println("_._._._._");
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println("Hey there, can anyone see it?");


		System.out.println("My name is Coueus, I'm the crew member of the secret operation");
    System.out.println("Well, last crew member....");
    System.out.println("What is your name stranger?");
      playerName = myScanner.nextLine();
      System.out.println("Hmmm... " + playerName + ", sounds promising..");
  
    System.out.println("\n1.Are you kidding me?");
    System.out.println("\n2.What happened?");
    System.out.println("\n3.Is it someone's prank?");
    choice = myScanner.nextInt();
    if(choice == 1 || choice == 3){
      System.out.println("\n I have no time to explain, just stay in touch with your phone or PC whatever system I got connected to..");
      
    }
		else{
   System.out.println("BOOM!");
    System.out.println("Blinding light...");
    System.out.println("Woke up on some kind of planet");
		System.out.println("Completele alone...");
    System.out.println("So you are my last chance to survive and keep my mind.Just stay in touch with your phone or PC whatever system I got connected to.. ");

    }
    System.out.println("NO NO NO, NOT NOW!");
    System.out.println("[SIGNAL LOST...}");
    System.out.println("[DISCONNECTED...}");
    System.out.println ("-----------------------------------------------------------------");
  }
public void intro(){

 System.out.println("-----------------------------------------------------------------");
 System.out.println("                       06:55PM                             ");
 System.out.println("[CONNECTING...]");
 System.out.println("[AUTHORIZING...]");
 System.out.println("[SUCCESSFUL...]");
 System.out.println("Hey " + playerName + ", just had a frozen seaweed for diner, disgusting...");
 System.out.println("I will explain you everything, but you have to keep it between us, ok?");
 System.out.println("I'm a member,hmm ex-member, of the secret operation [Tomorow's sunrise]. This operation was founded by the goverments of 56 countries. Our goal was to settle on the planet named SU-556 and find the source of the signal that US goverment got somwhere in 1960. After they decoded this signal they got next message [We are watching you].");
 System.out.println("We flew to this planet in 1969 under the huise of flying to the moon.");
 System.out.println("However, we were entering the atmosphere, when something strange happened...");
 System.out.println("I'm the only one who alive and now I'm sitiing in the emergency capsule, and using the on-board computer I got connected with you instead of headquarters");
 System.out.println("Pretty suspicious errors... Like someone wanted us to die");
 System.out.println("I'm just a coder, so I dont know anything about the flora and fauna on this planet and other stuff, so your role is gonna be to help me with everything, I'm pretty sure that I will die, but I want to share everything with you, so at least someone will know and show the people whats going on here");
   System.out.println("[SIGNAL LOST...}");
    System.out.println("[DISCONNECTED...}");
 System.out.println ("-----------------------------------------------------------------");
}
public void chapterOne(){

 System.out.println("-----------------------------------------------------------------");
    System.out.println("                       08:46AM                             ");
    System.out.println("[CONNECTING...]");
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println(playerName + " okay, now lets try to get out of this emergency module... Answer me ASAP");
   System.out.println("\n1.What can I do to help u?");
    System.out.println("\n2.That looks like an intresting quest");
    choice = myScanner.nextInt();
    if(choice == 1 || choice == 2){
      System.out.println("First of all, we need to decide what I should bring with me, I see a medkit, gun and flashlight... I already took some devices with me");
      inventory();
    }
    passwordGame();
     System.out.println("What should I do next?");
     System.out.println("\n1.Go outside. Be careful!");
     System.out.println("\n2.Look around");
     choice = myScanner.nextInt();
     if(choice == 1){
       System.out.println("Let's do it my friend");
     }
     else{
       System.out.println("You never miss my friend, I found a map!");
       System.out.println("Now I feel more confident to go outside!");
       map = 1;
     }
     System.out.println("I'm openning the do.....");
     System.out.println("[SIGNAL LOST...]");
    System.out.println("[DISCONNECTED...]");
 System.out.println ("-----------------------------------------------------------------");
    }
public void chapterTwo(){
  System.out.println ("-----------------------------------------------------------------");
System.out.println("                       07:32PM                             ");
System.out.println(playerName + " thanks God you are here, when I opened a door I saw someone outssside!! How thats can be even real!! We are not alone??");
if(map == 1){
  System.out.println("I dont know what could happen if I did't have a map with me");
  System.out.println("I found a cave using it nad now I'm sitting here. It's getting dark and cold....");
}
else{
   System.out.println("I hid in the wreckage of the ship, because the door slamed. Very strange.... I don't know what to do, it's geting dark and cold..");
}
  System.out.println("I'm so scared, I hear some noises outside.... Like SOMEONE IS TALKING!!! What should I do?");
  System.out.println("\n1.Stay quiet");
  System.out.println("\n2.Take a look");
  choice = myScanner.nextInt();
  if (choice == 1 && flashlight == 1){
    System.out.println("I think thats a right choice");
    System.out.println("IT'S COMING HERE!");
    System.out.println("I CAN HEAR BREATHING");
    System.out.println("I used the flashlight to scare it");
    System.out.println("Seems like it worked, it ran away!");
    System.out.println("I was so scared, so I did't recognize anything");
    chapterThree();
  }
  if (choice == 1 && gun == 1){
    System.out.println("I think thats a right choice");
    System.out.println("IT'S COMING HERE!");
    System.out.println("I CAN HEAR BREATHING");
    System.out.println("I shot it!");
    System.out.println("Seems like it worked, it ran away!");
    System.out.println("I was so scared, so I did't recognize anything");
    chapterThree();
  }
  if (choice == 1 && medkit == 1){
    System.out.println("I think thats a right choice");
    System.out.println("IT'S COMING HERE!");
    System.out.println("I CAN HEAR BREATHING");
    System.out.println("RIHT HERE, NO, NO ,NO");
     System.out.println("[SIGNAL LOST...]");
    System.out.println("[DISCONNECTED...]");
    System.out.println("[CONNECTING...]");
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println("I got hurt, so I used the medkit. However, thats not the point");
   System.out.println("This.... this..... MONSTER just gave me a glance and then darkness...");
   System.out.println("When I opened my eyes, nothins was here");
   System.out.println("I saw its eyes, there was some kind of man eyes but instead of 2, it has more than 10!!");
   System.out.println("I'm so confused... Something happened... I feel that I'm loosing my mind");
        System.out.println("[SIGNAL LOST...]");
    System.out.println("[DISCONNECTED...]");
   chapterThreeOne();
   
  }
  if (choice == 2 && gun == 1){
  System.out.println("Lets see who is there!");
  System.out.println("WHO IS THERE?");
  System.out.println("I SEE A SHADOW!");
  System.out.println("DO NOT MOVE, I HAVE A GUN!");
  fight();
  System.out.println("What was it??");
  System.out.println("It has a green blood! Can you imagine it?");
  System.out.println("I was so scared, so I did't recognize anything");
  chapterThree();
  
  }
  if (choice == 2 && gun == 0 && medkit != 1){
    System.out.println("WHO IS THERE?");
    System.out.println("I SEE YOU, COME HERE");
    System.out.println("Wait... What are you...?");
    System.out.println("NO, NO, NO, PUT ME DOWN!!");
     System.out.println("[SIGNAL LOST...]");
    System.out.println("[DISCONNECTED...]");
    chapterTwo();

  }
}
 
public void chapterThree(){
 if (map == 0){
    System.out.println("OH NO, My devise is showing me that radiation background here is so high, so I have to move...");
    chapterThreeFive();

  }
  else if(map == 1){
    System.out.println("I can spend a night right in this cave");
    System.out.println("I need to get some sleep");
         System.out.println("[SIGNAL LOST...]");
         System.out.println("[DISCONNECTED...]");
         System.out.println("-----------------------------------------------------------------");
         endingOne();
  }
}
public void chapterThreeFour(){
  System.out.println("-----------------------------------------------------------------");
    System.out.println("                       08:34PM                             ");
    System.out.println("[CONNECTING...]");
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
       System.out.println("Just saw a weird dream...Weird...");
   System.out.println("Like...someone calls me");
   System.out.println("It want to show me something");

}
public void chapterThreeFive(){
System.out.println("It is so dark and cold, I can not see anything...");
System.out.println("I have to keep moving, I see some kind of shelter and something shines far away ");
System.out.println("\n1.[Shelter]");
  System.out.println("\n2.[Shining]");
  choice = enterScanner.nextInt();
  if (choice == 1){
    System.out.println("[Few hours later]");
    System.out.println(playerName + " I found a shelter with people, can you belive in it?");
    System.out.println("My captain and every team member are here, they are so funny ");
    System.out.println("I'm gonna stay here forever, we have unlimited supply of food and entertaiment ");
    System.out.println("Some kind of beautiful dream inside my head");
    System.out.println("Thank you for everything " + playerName);
            System.out.println("[SIGNAL LOST...]");
          System.out.println("[DISCONNECTED...]");
  }
    

     else if(choice == 2){
       System.out.println("[Few hours later]");
       System.out.println("It wants me...");
       System.out.println("I have to go in there...");
        System.out.println("[SIGNAL LOST...]");
          System.out.println("[DISCONNECTED...]");
     }
        

    
  }



public void chapterThreeOne(){
  System.out.println("-----------------------------------------------------------------");
    System.out.println("                       04:34PM                             ");
    System.out.println("[CONNECTING...]");
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println("Hey, who are you?");
   System.out.println("Get out of my head!!");
     System.out.println("\n1.Thats me, " + playerName);
     System.out.println("\n2.What do u mean?");
     choice = enterScanner.nextInt();
     if(choice == 1){
       System.out.println(playerName + " , " + playerName + " I remember this name");
       System.out.println("Listen, " + playerName + " , I'm in the midle of nowhere");
       System.out.println("I understood everything");
       System.out.println("I'm just a pice of code, so my life doent matter");
       System.out.println("I had something important to say");
       System.out.println("RUN FROM YOUR HOUSE RIGH NOW!!!");
       System.out.println("THEY WILL COME FOR YOU!!");
       chapterThreeTwo();
     }
     else if(choice == 2){
       
       System.out.println("I got a knoweledge");
       System.out.println("Very important knoweledge");
       System.out.println("I'm just a pice of code, code, which is coming to an end");
       System.out.println("But I'm not sure who you ar....");
            System.out.println("[SIGNAL LOST...]");
          System.out.println("[DISCONNECTED...]");
          endingOne();
     }
}
public void chapterThreeTwo(){
           System.out.println("\n1.Who?");
           System.out.println("\n2.What happened with u?");
           choice = enterScanner.nextInt();
           if(choice == 1){
             System.out.println("FBI or whoever I got connected to and now they can see our chat!");
             System.out.println("Probably they already know your adress, they are gonna kill you, so you have to RUN!");
             endingTwo();
           }
           else if(choice == 2){
            ThreeThree();
           }
}
public void ThreeThree(){
          System.out.println("YOU REALLY HAVE TO RUN!");
          System.out.println("\n1.Say me what happened!");
           System.out.println("\n2.Damn you,![RUN]");
           choice = enterScanner.nextInt();
           if(choice == 1){
             System.out.println("Awareness...");
             endingOne();
           }
            else if (choice == 2){
             endingTwo();
           }

}
     
  

public void endingOne(){
  System.out.println
("-----------------------------------------------------------------");
    System.out.println("                       05:34PM                             ");
    System.out.println("[CONNECTION INTERRUPTED]");
    System.out.println("[CONNECTING...]");
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println("Hey there, my name is Gerald, I'm an FBI agent");
   System.out.println("You got an access to a secret information");
   System.out.println("We got an order to eliminate you");
   System.out.println("Do not move and stay quite and everything will happen fast");
   System.out.println("[BOOM!]");
    System.out.println("[Blinding light...]");
     System.out.println
("-----------------------------------------------------------------");
}
public void endingTwo(){
  System.out.println
("-----------------------------------------------------------------");
    System.out.println("                       05:34PM                             ");
    System.out.println("[CONNECTION INTERRUPTED]");
    System.out.println("[CONNECTING...]");
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println("Hey there, my name is Gerald, I'm an FBI agent");
   System.out.println("You got an access to a secret information");
   System.out.println("We got an order to eliminate you");
   System.out.println("Do not move and stay quite and everything will happen fast");
   System.out.println("Group Alpha- Pshhh, Gerland, let me report, the falt is empty...");
}
public void fight(){
  while(shadowHp <=100 && shadowHp !=20){
   System.out.println("\n1.FIRE!");
    System.out.println("\n2.DODGE!");
    choice = myScanner.nextInt();
    if(choice == 1){
      System.out.println("Nice shot!");
      shadowHp -= 20; 
      playerHp -= 50;
      fight();
    }
    else{
      System.out.println("Thats was close!");
      playerHp += 25;
    }
    if(shadowHp <= 20){
      System.out.println("It ran away!");
      break;
    }
    while(playerHp <= 0){
      System.out.println("I can not stand anymore...");
      System.out.println("[SIGNAL LOST...]");
     System.out.println("[DISCONNECTED...]");
     playerHp +=100;
     shadowHp +=100;
     chapterTwo();

    }
    
  }

}
public void passwordGame(){
  System.out.println("There is a code lock on the door, I have a paper where states [24816..], but the last two numbers scrached. Do you have any ideas?");
  System.out.println("//Type the full password//");
      
      password = myScanner.nextInt();
      if(password == 2481632){
        System.out.println("Nice job! " + playerName);
      }
      else {
        System.out.println("Try again! " + playerName);
        System.out.println("I think you should find a regularity between numbers");
        passwordGame();
      }
}

  public void inventory(){
    System.out.println("\n1.MEDKIT");
    System.out.println("\n2.GUN");
    System.out.println("\n3.FLASHLIGHT");
    choice = myScanner.nextInt();
    if(choice == 1){
   medkit = 1; 
   gun = 0;
   flashlight = 0; 
   System.out.println("I thought the same");
    }
    else if(choice == 2){
       medkit = 0; 
       gun = 1;
       flashlight = 0; 
   System.out.println("I'm not sure how to use it, but okay.");
    }
    else if(choice == 3){
      medkit = 0; 
      gun = 0;
      flashlight = 1;
    System.out.println("It won't be superfluous");
    }
    


  }
}



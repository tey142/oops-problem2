import java.util.Scanner;
class tempchange{
    float temp;
    public tempchange(float temp){
        this.temp=temp;
    }
    public void upbyone(){
        temp++;
    }
    public void downbyone(){
        temp--;
    }
}
public class thermostat extends tempchange{
    public thermostat(float temp){
        super(temp);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("~~~~thermostat~~~~");
        System.out.println("what is the current temperature?");
        float initialtemp=sc.nextFloat();
        sc.nextLine();
        tempchange o=new tempchange(initialtemp);
        System.out.println("would you like to change the thermostat?(y/n)");
        String choice=sc.nextLine();
        while(choice.equals("y")){
            System.out.println("would you like to increast or decrease the temperature?(i/d)");
            String upordown=sc.nextLine();
            if(upordown.equals("i")){
                o.upbyone();
                System.out.println("new temperature: "+o.temp);
            }
            else if(upordown.equals("d")){
                o.downbyone();
                System.out.println("new temperature: "+o.temp);
            }
            else{
                System.out.println("invalid input");
            }
            System.out.println("would you like to change the thermostat?(y/n)");
            choice=sc.nextLine();
        }
        System.out.println("current temperature: "+o.temp);
    }
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int lemonadePrice = 1;
int orangeJuicePrice = 3;
int ampleWallet = 100;
int slimWallet = 3;
int remainingFunds1 = ampleWallet - lemonadePrice;
int remainingFunds2 = slimWallet - orangeJuicePrice;
System.out.println("Remaining funds in wallet after buying lemonade is $" + remainingFunds1);
System.out.println("Remaining funds in wallet after buying orange juice is $" + remainingFunds2);

double numFriendsFred = 5;
double numFriendsFran = 10;
double ageFred = 15;
double ageFran = 20;
double avgFriendsFred = numFriendsFred / ageFred;
double avgFriendsFran = numFriendsFran / ageFran;
System.out.println("Fred has made an average of " + avgFriendsFred + " friends per year");
System.out.println("Fran has made an average of " + avgFriendsFran + " friends per year");

String firstName1 = "Anne";
String lastName1 = "Green";
char middleInitial1 = 'C';
String firstName2 = "Barry";
String lastName2 = "Brown";
char middleInitial2 = 'M';
String fullName1 = firstName1 + " " + middleInitial1 + ". " + lastName1;
String fullName2 = firstName2 + " " + middleInitial2 + ". " + lastName2;
System.out.println(firstName1 + "'s full name is " + fullName1);
System.out.println(firstName2 + "'s full name is " + fullName2);
	}

}

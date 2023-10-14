import java.util.Scanner;
public class Match
{
    protected String team1;
    protected String team2;

    Match()
    {

    }

    Match(String team1,String team2)
    {
        this.team1=team1;
        this.team2=team2;
    }

    public String getWinningTeam()
    {
        int rank1=getTeamRank(team1);
        int rank2=getTeamRank(team2);

        if(rank1<rank2)
        {
            return "winning team : "+team1;
        }

        else if(rank2<rank1)
        {
            return "winning team : "+team2;
        }

        else
        {
            return "It is a draw!!!";
        }
    }

    private int getTeamRank(String team)
    {
        switch(team)
        {
            case"India":
                return 1;

            case"South Africa":
                return 2;

            case"England":
                return 3;
                
            case"Australia":
                return 4;

            case"Afghanisthan":
                return 5;

            case"Sri Lanka":
                return 6;

            case"Bamgladesh":
                return 7;

            default:
                return Integer.MAX_VALUE;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String team1,team2;
        Integer[] array={12, 45, 78, 23, 69, 85, 63, 45, 10};
        Cricketer C1=new Cricketer();
        Batsman B1=new Batsman("Dinesh Chandimal","18/11/1989",5.8,"Sri Lanka",774,46,746);
        B1.setRole(null);
        Bowler B2=new Bowler("Lasith Malinga","28/08/1983",5.6,"Sri Lanka",1780,90,1451);
        B2.setRole(null);
        System.out.println();
        System.out.println("--------Batsman--------");
        B1.display();
        System.out.println(B1.calculateHighest(array));
        System.out.println();
        System.out.println("--------Bowler--------");
        B2.display();
        System.out.println();
        System.out.println("-----Check Winning Team-----");
        System.out.println();
        System.out.print("Enter Team 01 : ");
        team1=sc.nextLine();
        System.out.print("Enter Team 02 : ");
        team2=sc.nextLine();
        System.out.println();
        Match M1=new Match(team1,team2);
        System.out.println(M1.getWinningTeam());
    }
}
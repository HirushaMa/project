public class Bowler extends Cricketer
{
    protected int runs;
    protected int wickets;
    protected int balls;

    Bowler()
    {

    }

    Bowler(String name,String birthday,double height,String country,int runs,int wickets,int balls)
    {
        super(name,birthday,height,country,country);
        this.runs=runs;
        this.wickets=wickets;
        this.balls=balls;
        super.getRole();
        super.setRole(role);
    }


    public double getBowllingAverage()
    {
        double bowlingAverage=runs/wickets;
        return bowlingAverage;
    }

    public double getBowllingEconomyRate()
    {
        int overs=balls/6;
        double bowllingEconomyRate=runs/overs;
        return bowllingEconomyRate;
    }

    public double getBowllingStrikeRate()
    {
        double bowllingStrikeRate=balls/wickets;
        return bowllingStrikeRate;
    }



    
    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("birthdate : "+birthday);
        System.out.println("height : "+height);
        System.out.println("country : "+country);
        System.out.println("runs : "+runs);
        System.out.println("wickets : "+wickets);
        System.out.println("balls : "+balls);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bowlling Average is : "+getBowllingAverage());
        System.out.println("Bowlling Economy Rate is : "+getBowllingEconomyRate());
        System.out.println("Bowlling Strike Rate is : "+getBowllingStrikeRate());


    }
}
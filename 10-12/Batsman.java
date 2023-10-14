public class Batsman extends Cricketer
{
    protected int runs;
    protected int innings;
    protected int ballfaced;

    Batsman()
    {

    }

    Batsman(String name,String birthday,double height,String country,int runs,int innings,int ballfaced)
    {
        super(name,birthday,height,country,country);
        this.runs=runs;
        this.innings=innings;
        this.ballfaced=ballfaced;
        super.getRole();
        super.setRole(role);
    }


    public double getBattingAverage()
    {
        double getBattingAverage=runs/innings;
        return getBattingAverage;
    }

    public double getBattingStrikerate()
    {
        double battingStrikeRate=(100*runs)/ballfaced;
        return battingStrikeRate ;
    }

   public boolean checkSuitability()
    {
        if(getBattingStrikerate()>100)
        {
            return true;
        }

        else
        {
            return false;
        }

    }

   public int calculateHighest(Integer array[])
    {
        double ab=array[0];
        for(int i=0; i<array.length; i++)
        {
            if(ab<array[i])
            {
                ab=array[i];
                
            }
        }
        System.out.println("Highest is : "+ab);
        return 0;

    }

        public void display()
    {
        System.out.println("name : "+name);
        System.out.println("birthdate : "+birthday);
        System.out.println("height : "+height);
        System.out.println("country : "+country);
        System.out.println("runs : "+runs);
        System.out.println("innings : "+innings);
        System.out.println("ballface : "+ballfaced);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Batting Average is : "+getBattingAverage());
        System.out.println("Batting Strike Rate is : "+getBattingStrikerate());
        System.out.println("Suitability is : "+checkSuitability());
        
    }

}
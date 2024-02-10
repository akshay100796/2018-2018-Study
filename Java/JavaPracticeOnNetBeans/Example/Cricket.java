package Example;

class Cricket extends Player
{
    int match;
    int wicket;
    int score;
    String Stediam;

    public Cricket(int match, int wicket, int score, String Stediam, int age, String name, double wt, double ht) {
        super(age, name, wt, ht);
        this.match = match;
        this.wicket = wicket;
        this.score = score;
        this.Stediam = Stediam;
    }

    public int getMatch() {
        return match;
    }

    public int getWicket() {
        return wicket;
    }
    
    public int getScore() {
        return score;
    }

    public String getStediam() {
        return Stediam;
    }
    
    
    
    
}



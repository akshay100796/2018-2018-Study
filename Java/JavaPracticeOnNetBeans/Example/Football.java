package Example;

class Football extends Player
{
    int goal;
    int time;

    public Football(int goal, int time, int age, String name, double wt, double ht) {
        super(age, name, wt, ht);
        this.goal = goal;
        this.time = time;
    }

    public int getGoal() {
        return goal;
    }

    public int getTime() {
        return time;
    }
    
    
}

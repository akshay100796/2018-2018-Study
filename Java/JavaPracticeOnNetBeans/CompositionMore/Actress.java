
package CompositionMore;

public class Actress 
{
    Person p;
    String BestMovie;
    int totalMovie;
    int Collection;
    int rank;

    public Actress(String BestMovie, int totalMovie, int Collection, int rank,int age, double height, double weight, String email, char sex ,String name) 
    {
        this.p = new Person();
        this.BestMovie = BestMovie;
        this.totalMovie = totalMovie;
        this.Collection = Collection;
        this.rank = rank;
        p.setAge(age);
        p.setHeight(height);
        p.setWeight(weight);
        p.setEmail(email);
        p.setSex(sex);
        p.setName(name);
    }

    public Person getP() {
        return p;
    }

    public String getBestMovie() {
        return BestMovie;
    }

    public int getTotalMovie() {
        return totalMovie;
    }

    public int getCollection() {
        return Collection;
    }

    public int getRank() {
        return rank;
    }
    
    public int getAge()
    {
        return p.age;
    }
    public double getHeight()
    {
        return p.height;
    }
    public double getWeight()
    {
        return p.weight;
    }
    public String getEmail()
    {
        return p.email;
    }
    public char getSex()
    {
        return p.sex;
    }
    public String getName()
    {
        return p.getName();
    }
}

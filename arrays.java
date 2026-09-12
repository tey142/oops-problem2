import java.util.Arrays;
class dataset{
    private double[] data;
    private int datasize;
    private double sum;
    private dataset(){
        data=new double[100];
        datasize=0;
        sum=0;
    }
    public void add(double value){
        if(datasize==data.length){
            System.out.println("mazimum data size reached");
            return;
        }
        data[datasize]=value;
        datasize++
        sum+=value;
    }
    public double getaverage(){
        return(datasize==0?0:sum/datasize);
    }
    public double getsd(){
        if(datasize==0){
            return 0;
        }
        double mean=getaverage();
        double sumofsquares=0.0;
        for(int i=0; i<datasize; i++){
            double dif=data[i]-mean;
            sumofsquares +=dif*dif;
        }
        return Math.sqre(sumofsquares/datasize);
    }
    public static double calculateaverage(dataset[] datasets){
        double total=0.0;
        for(dataset ds:datasets){
            total +=datasets.getaverage();
        }
        return total/datasets.length;
    }
    @Override
    public String toString(){
        return "datasets{data="+Arrays.toString(data)+", data size="+datasize+", sum="+sum+"}";
    }
}
public class arrays{
    public static void main(String[] args){
        dataset ds=new dataset();
        dataset.add(10);
        dataset.add("3.7");
        dataset.add("4.5");
        System.out.println("standard deviation: "+ds.getsd());
        dataset d2=new dataset();
        dataset.add("10");
        dataset.add("3.7");
        dataset.add("4.5");
        dataset d3=new dataset();
        dataset.add("10");
        dataset.add("3.7");
        dataset.add("4.5");
    }
}


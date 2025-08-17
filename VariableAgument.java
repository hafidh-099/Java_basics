public class VariableAgument {

    //this is used to accept many value as paramiter
    public static void VarAgs(String name,int...num){
        int total = 0;
        for(int sum:num){
            //now num iterate and store value into sum
            total +=sum;
            //total = 1+sum
        }
        System.out.println("welcome Mr "+name+" the sum of number is "+total);
    }
    public static void main(String[] args) {
        VarAgs("Hafidh",1,3,5,10,1);
        }
    }


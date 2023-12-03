package project;

public class Task10StringArrayDuplicate {
    public static void main(String[] args) {
        String[] names={"John","James","Peter","Sam","John","Smith","Sam"};

        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.print(names[j]+" ");
                }
            }
        }
    }
}

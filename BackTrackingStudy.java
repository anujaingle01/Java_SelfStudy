public class BackTrackingStudy {

    public static void backtrack(String name,int index,String perm){
        if(name.length()==0){
            System.out.println(perm);
            return;
        }

        for (int i=0;i<name.length();i++){
            char current = name.charAt(i);
            String now = name.substring(0,i)+name.substring(i+1);           // It Avoids Current Character
            backtrack( now, index+1, perm+current);                       // i.e. 0-i & i+1
        }
    }

    public static void main(String[] args){
        String name ="ABC";
        System.out.println("String Name = "+name);
        backtrack(name,0," ");
    }

}
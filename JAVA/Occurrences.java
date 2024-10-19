//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                al.add(i);
                break;
            }
            // if(arr[i] != x){
            //     al.add(-1);
            //     break;
            // }
            
        }
        
        for(int i=0; i<n; i++){
            if(arr[n-1-i] == x){
                al.add(n-1-i);
                break;
            }
            // if(arr[n-1-i] != x){
            //     al.add(-1);
            //     break;
            // }
        }
        al.add(-1);
        al.add(-1);
            
        return al;
    }
}

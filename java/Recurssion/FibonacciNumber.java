class Solution {
    static int[] f;
    public int fib(int n) {
        if(f==null||f.length<=n){
            int[] newf = new int[n+1];
            for(int i =0; i<=n;i++ ){
                if(f != null && i<f.length){
                    newf[i] = f[i];
                }
                else{
                    newf[i] = -1;
                }
            
            }
            f =newf;
        }
        if(n<=1){
            f[n] = n;
            return n;
        }
        if(f[n] != -1){
            return f[n];

        }
        f[n] = fib(n-2)+fib(n-1);
        return f[n];
    }
}

class HollowTriangle {
    public static void main(String[] args) {
        int n=6;
        for (int i=1; i<=n; i++) {
            for (int k = n ; k >=i; k--) { //Invisible inverted triangle on left side
                System.out.print(" ");
            } 
            for (int j = 1; j<=2*i-1; j++) { //Even stars logic to print stars
                if(j==1 || j==(2*i-1) || i==n){ // print * at borders and last row
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println("");
        }
        
    }
}

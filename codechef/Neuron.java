package codechef;

    import java.util.*;
    
    class Neuron{
    	int w,b;
     
    	Neuron(int a, int b)
    	{
    		w = a;
    		this.b = b;
    	}
     
    	public static void main(String[] args){
     
    		Scanner sc = new Scanner(System.in);
    		int t = sc.nextInt();
    		while(t-- > 0){
     
    			int n = sc.nextInt(), minX = sc.nextInt(), maxX = sc.nextInt();
    			int ns=0, s=0;
    			ArrayList<Neuron> arr = new ArrayList<Neuron>();
    			for(int i =0; i !=n; i++){
    				arr.add(new Neuron(sc.nextInt(), sc.nextInt()));
    			}
     
    			while(minX <= maxX){
    			
    				int y = minX * arr.get(0).w + arr.get(0).b;
    				for(int i=1; i !=n; i++)
    					y = y* arr.get(i).w + arr.get(i).b;
    				
     
    				if(y%2 == 0)
    					ns++;
    				else
    					s++;
     
    				minX++;
    			}
     
    			System.out.println(ns+" "+s);
    		}
     
    	}
    } 

public class Test25 {
public static void main(String[] args){
	int a[]={7,3,4,9,6};
	int count = 0; //define count = 0
	for(int x=0;x<a.length;x++){
		for(int i=0;i<a.length-1;i++){
			count ++; //add count
			if(a[i]>a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}	
		}
	}
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
		}
		System.out.println("count:"+count); //print count
	}
}
/*
 * form min to max use array
 */
import java.util.*;
public class Permute2 {
	public static void Permutation(List<Integer> P, List<Integer> A){
		for(int i=0; i<A.size(); ++i){
			int nxt=i;
			while(P.get(nxt)>=0){
				Collections.swap(A, i, P.get(nxt));
				int tmp= P.get(nxt);
				P.set(nxt, P.get(nxt)-P.size());
				nxt= tmp;
			}
		}
		for(int i=0; i< P.size(); i++) {
			P.set(i, P.get(i)+P.size());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> P = Arrays.asList(2,0,3,1);
		List<Integer> A = Arrays.asList(3,1,2,0);
		System.out.println("Permutation List= "+P+"\n"+"Original List =   "+A);
		Permutation(P, A);
		System.out.println("Permuted List =   "+A);
	}

}

package svcImpl;

import inter.PatterService;

public class PatterServiceImpl implements PatterService  {

	public void computeLPSArray(int[] lps, int M, String pat) {
		int len = 0;
		int i = 1;
		lps[0] = 0; //lps[0] = 0
		
		//loop calculates lps[i] for i =1 to M-1
		while(i < M) {
			if(pat.charAt(i) == pat.charAt(len)) {
				++len;
				lps[i] = len;
				++i;
			} else {
				if(len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = len;
					++i;
				}
			}
		}
		
	}

	public 	void getKPM(String txt, String pat) {
		int M = pat.length();
		int N = txt.length();
		int[]lps = new int[M];
		
		computeLPSArray(lps, M, pat);
		int j = 0;
		int i = 0;
		while(i < N) {
			if(pat.charAt(j) == txt.charAt(i)) {
				++j;
				++i;
			} 
			if(j == M) {
				System.out.println("Patter found at index : " + (i - j));
			} else if(i < N && pat.charAt(j) != txt.charAt(i)) {
				if(j != 0) {
					j = lps[j - 1];
				} else {
					++i;
				}
			}
		}	
	}

}

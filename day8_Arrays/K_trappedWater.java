package day8_Arrays;

public class K_trappedWater {
	public static int trappedWater(int height[]) {
		int n = height.length;
		
		//left max array 
		int LeftMax[] = new int[n];
		
		LeftMax[0] = height[0];
		//loop from leftmax[1] to n
		for(int i = 1; i < n ; i++) {
			
			LeftMax[i] = Math.max(height[i], LeftMax[i - 1]);
		}
		
		int RightMax[] = new int[n];
		RightMax[n-1] = height[n-1];
		for(int i = n-2; i >= 0; i--) {
			RightMax[i] = Math.max(height[i], RightMax[i + 1]);
			
		}
		
		//calculating trapped water between bar
		int trappedwater = 0;
		for (int i = 0; i < n; i++ ) {
			
			int waterlevel = Math.min(LeftMax[i], RightMax[i]);
			trappedwater += waterlevel - height[i];
		}
		
		return trappedwater;
	}
	public static void main(String[] args) {
		int height[] = {4,2,0,6,3,2,5};
		
		System.out.println(trappedWater(height));
	}

}

package com.nit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*7. Rotate a List by K Positions

Example: rotate [1,2,3,4,5] by 2 → [4,5,1,2,3].*/
public class Rotate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k = 2;

        k = k % list.size();   // handle k > size
        Collections.rotate(list, k);

        System.out.println(list);
	}

}

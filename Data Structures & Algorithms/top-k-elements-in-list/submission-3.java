class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> count = new HashMap<>();
        // List<Integer>[] freq = new List[nums.length + 1];

        // for (int i = 0; i < freq.length; i++) {
        //     freq[i] = new ArrayList<>();
        // }

        // for (int n : nums) {
        //     count.put(n, count.getOrDefault(n, 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
        //     freq[entry.getValue()].add(entry.getKey());
        // }

        // int[] res = new int[k];
        // int index = 0;
        // for (int i = freq.length - 1; i > 0 && index < k; i--) {
        //     for (int n : freq[i]) {
        //         res[index++] = n;
        //         if (index == k) {
        //             return res;
        //         }
        //     }
        // }
        // return res;

        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
            .boxed()  // Convert int[] to Stream<Integer>
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Step 2: Sort the map by frequency in descending order and take the first K elements
        return frequencyMap.entrySet().stream()
            .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))  // Sort by frequency (value)
            .limit(k)  // Take the first k elements
            .mapToInt(Map.Entry::getKey)  // Extract just the keys (numbers)
            .toArray();  // Convert to int[]
    }
    }


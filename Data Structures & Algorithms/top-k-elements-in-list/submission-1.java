class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int numero : map.keySet()) {
            int frecuencia = map.get(numero);
            
            if (buckets[frecuencia] == null) {
                buckets[frecuencia] = new ArrayList<>();
            }

            buckets[frecuencia].add(numero);
        }

        int[] resultado = new int[k];
        int recolectados = 0;

        for (int i = buckets.length - 1; i >= 0 && recolectados < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    resultado[recolectados] = num;
                    recolectados++;

                    if (recolectados == k) {
                        return resultado;
                    }
                }
            }
        }

        return resultado;
    }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int curr_perim = 0;
        int total_perim = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    continue;
                }
                //cases:
                if(i - 1 < 0 
                    || grid[i-1][j] == 0){
                    System.out.println("LEFT");
                    curr_perim += 1;
                }

                if(i + 1 >= grid.length 
                    || grid[i+1][j] == 0)
                {                    
                    System.out.println("RIGHT");
                    curr_perim += 1;
                }

                if(j - 1 < 0 
                    || grid[i][j-1] == 0)
                {
                    System.out.println("UP");
                    curr_perim += 1;
                }

                // System.out.println(j+1);
                // System.out.println(grid[0].length);
                if((j + 1) >= grid[0].length 
                    || grid[i][j+1] == 0)
                {
                    System.out.println("DOWN");
                    curr_perim += 1;
                }

                System.out.println("i:" + i);
                System.out.println("j:" + j);
                System.out.println("CURR PERIM: " + curr_perim);
                System.out.println();
                total_perim += curr_perim;
                curr_perim = 0;
            }
        }
        return total_perim;
    }
}

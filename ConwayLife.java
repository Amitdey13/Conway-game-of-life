

public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        // your code goes here
                   /*********************
                    input a 'NxN' array
                      and generations
                   *********************/

        int[][] result = new int[10][10];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++)
                result[i][j] = 0;
        }
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++)
                result[i+3][j+3] = cells[i][j];
        }
        cells = new int[10][10];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                cells[i][j] = result[i][j];
            }
        }
        int e = cells.length - 1;

        for (int a = 1; a <= generations; a++) {
            System.out.println("Generations:" + a);
            for (int i = 0; i<cells.length; i++) {
                for (int j = 0; j < cells.length; j++)
                    System.out.print(cells[i][j] + " ");
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells.length; j++) {
                    int c = 0;
                    if (i == 0 && j == 0) {
                        if (result[i][j + 1] == 1)
                            c++;
                        if (result[i + 1][j + 1] == 1)
                            c++;
                        if (result[i + 1][j] == 1)
                            c++;
                    } else if (i == 0 && j == e) {
                        if (result[i][j - 1] == 1)
                            c++;
                        if (result[i + 1][j - 1] == 1)
                            c++;
                        if (result[i + 1][j] == 1)
                            c++;
                    } else if (i == e && j == 0) {
                        if (result[i - 1][j] == 1)
                            c++;
                        if (result[i - 1][j + 1] == 1)
                            c++;
                        if (result[i][j + 1] == 1)
                            c++;
                    } else if (i == e && j == e) {
                        if (result[i - 1][j] == 1)
                            c++;
                        if (result[i - 1][j - 1] == 1)
                            c++;
                        if (result[i][j - 1] == 1)
                            c++;
                    } else if (i == 0) {
                        if (result[i][j - 1] == 1)
                            c++;
                        if (result[i + 1][j - 1] == 1)
                            c++;
                        if (result[i + 1][j] == 1)
                            c++;
                        if (result[i + 1][j + 1] == 1)
                            c++;
                        if (result[i][j + 1] == 1)
                            c++;
                    } else if (j == 0) {
                        if (result[i - 1][j] == 1)
                            c++;
                        if (result[i - 1][j + 1] == 1)
                            c++;
                        if (result[i][j + 1] == 1)
                            c++;
                        if (result[i + 1][j + 1] == 1)
                            c++;
                        if (result[i + 1][j] == 1)
                            c++;
                    } else if (i == e) {
                        if (result[i][j - 1] == 1)
                            c++;
                        if (result[i - 1][j - 1] == 1)
                            c++;
                        if (result[i - 1][j] == 1)
                            c++;
                        if (result[i - 1][j + 1] == 1)
                            c++;
                        if (result[i][j + 1] == 1)
                            c++;
                    } else if (j == e) {
                        if (result[i - 1][j] == 1)
                            c++;
                        if (result[i - 1][j - 1] == 1)
                            c++;
                        if (result[i][j - 1] == 1)
                            c++;
                        if (result[i + 1][j - 1] == 1)
                            c++;
                        if (result[i + 1][j] == 1)
                            c++;
                    } else {
                        if (result[i - 1][j - 1] == 1)
                            c++;
                        if (result[i - 1][j] == 1)
                            c++;
                        if (result[i - 1][j + 1] == 1)
                            c++;
                        if (result[i][j + 1] == 1)
                            c++;
                        if (result[i + 1][j + 1] == 1)
                            c++;
                        if (result[i + 1][j] == 1)
                            c++;
                        if (result[i + 1][j - 1] == 1)
                            c++;
                        if (result[i][j - 1] == 1)
                            c++;
                    }

                    if (result[i][j] == 0 && c == 3)
                        cells[i][j] = 1;
                    else if (c > 3 || c < 2)
                        cells[i][j] = 0;


                }
            }
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells.length; j++) {
                    result[i][j] = cells[i][j];
                }
            }
        }
        loop:
        {
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells.length; j++)
                    if(cells[i][j] == 0)
                        continue ;
                    else
                        break loop;
            }
            return null;
        }
        return cells;
    }

}

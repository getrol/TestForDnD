package gameplay.mechanics;

public class CubeAnalyzer {
    public CubeAnalyzer cubeAnalyzer;

    private CubeAnalyzer() {
    }

    public synchronized CubeAnalyzer getCubeAnalyzer() {
        if (cubeAnalyzer == null) {
            cubeAnalyzer = new CubeAnalyzer();
        }
        return this.cubeAnalyzer;
    }

    public CubeResult getCubeResult(String... template){
        
        return null;
    }
    private class CubeResult{
        int [] results;
    }
}

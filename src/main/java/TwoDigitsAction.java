public class TwoDigitsAction {

    public static Results calculateResults(int firstInteger, int secondInteger) {
        Results results = new Results();
        results.setMultiplicationResult(firstInteger * secondInteger);
        results.setDivisionResult((double) firstInteger / (double) secondInteger);
        results.setRemainderResult(firstInteger % secondInteger);

        return results;
    }
}

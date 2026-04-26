class AverageCalculator {
    public static double average(String[] values)
            throws NullPointerException, NumberFormatException {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                throw new NullPointerException("Null value found at index " + i);
            }
            double num = Double.parseDouble(values[i]);
            sum += num;
        }
        return sum / values.length;
    }
    public static void main(String[] args) {
        String[] validData = {"10", "20", "30"};
        String[] invalidData = {"10", "abc", "30"};
        String[] nullData = {"10", null, "30"};
        try {
            double result = average(validData);
            System.out.println("Average (valid data): " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished valid data test\n");
        }
        try {
            double result = average(invalidData);
            System.out.println("Average (invalid data): " + result);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished invalid data test\n");
        }
        try {
            double result = average(nullData);
            System.out.println("Average (null data): " + result);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: Null value found");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
finally {
          System.out.println(" finished null data test\n");
        }
    }
}

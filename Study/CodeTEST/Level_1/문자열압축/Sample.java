package Level_1.문자열압축;

public class Sample {
    public static void main(String[] arg) throws ArrayIndexOutOfBoundsException {
        Sample Pavel = new Sample();
        Pavel.Sample1();
    }

    public void Sample1() {
        String msg = "abbbbcccccccc";
        String[] str_arr = msg.split("");
        StringBuffer sb = new StringBuffer();
        int result = 1;
        for (int i = 0; i < msg.length() - 1; i++) {

            while (true) {

                int test = i + result;
                try {
                    if (str_arr[i].equals(str_arr[test])) {
                        result++;
                    }

                    else {
                        sb.append(str_arr[i] + result);
                        i = test - 1;
                        result = 1;

                        break;
                    }
                }

                catch (ArrayIndexOutOfBoundsException e) {

                    sb.append(str_arr[i] + result);
                    i = test - 1;
                    result = 1;
                    break;
                }
            }

        }

        System.out.print(sb);
    }
}

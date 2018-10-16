public class CharSum {
    public static int sum(char arr[]) {
        int length = arr.length;
        int counter, num = 0, sum = 0;
        String str = "";
        for(int i=0; i<length; i++) {
            counter = i;
            while(counter < length && isDigit(arr[counter])){
                str+= arr[counter];
                counter++;
            }
            while(counter < length && !isDigit(arr[counter])){ counter++; } //skip alphabets to go to next number
            if(!str.equals("")) { num = Integer.parseInt(str); }
            i=counter-1; //reduce counter value by 1 as i will get increased by 1 in for loop
            sum += num;
            num = 0;
            str = "";
        }
        return sum;
    }
    public static boolean isDigit(char ch) {
        return (ch>='0' && ch<='9');
    }
    public static void main(String[] args) {
        char[] arr = {'3', 'a', 'b', 'c', '9', '8' , '4', 'a', '5', 'z', '1'};
        System.out.println(sum(arr));
    }
}